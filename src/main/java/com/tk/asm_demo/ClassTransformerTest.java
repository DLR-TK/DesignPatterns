package com.tk.asm_demo;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.MethodVisitor;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;

import static jdk.internal.org.objectweb.asm.Opcodes.ASM4;
import static jdk.internal.org.objectweb.asm.Opcodes.INVOKESTATIC;

public class ClassTransformerTest {
    public static void main(String[] args) throws Exception{
        ClassReader classReader = new ClassReader(
                ClassPrinter.class.getClassLoader().getResourceAsStream("com/tk/asm_demo/Tank.class"));

        ClassWriter classWriter = new ClassWriter(0);
        ClassVisitor classVisitor = new ClassVisitor(ASM4, classWriter) {

            /**
             * visitMethod 返回方法访问者(访问者模式)
             * @param access
             * @param name
             * @param descriptor
             * @param signature
             * @param exceptions
             * @return
             */
            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {

                MethodVisitor methodVisitor = super.visitMethod(access, name, descriptor, signature, exceptions);

                /**
                 * 如果方法名为move 为其添加代理
                 */
                if (name.equals("move")) {
                    return new MethodVisitor(ASM4, methodVisitor) {
                        @Override
                        public void visitCode() {
                            visitMethodInsn(INVOKESTATIC, "com/tk/asm_demo/TimeProxy", "before", "()V", false);
                            super.visitCode();
                        }
                    };
                }

                /**
                 * 其他方法直接不做操作
                 */
                return new MethodVisitor(ASM4, methodVisitor) {
                    @Override
                    public void visitCode() {
                       super.visitCode();
                    }
                };
            }
        };

        classReader.accept(classVisitor, 0);
        byte[] b2 = classWriter.toByteArray();

        MyClassLoader cl = new MyClassLoader();
        cl.loadClass("com.tk.asm_demo.TimeProxy");
        Class c2 = cl.defineClass("com.tk.asm_demo.Tank", b2);
        /**
         * 获取move方法并运行
         */
        Object obj = c2.getConstructor().newInstance();
        Method method = c2.getMethod("move");
        Object result = method.invoke(obj);

        String path = (String) System.getProperties().get("user.dir");
        File file = new File(path + "/com/tk/asm_demo/");
        file.mkdirs();

        FileOutputStream fileOutputStream =new FileOutputStream(
                new File(path + "/com/tk/asm_demo/Tank_0.class"));
        fileOutputStream.write(b2);
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
