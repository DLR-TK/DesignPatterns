package com.tk.asm_demo;

import jdk.internal.org.objectweb.asm.ClassWriter;

import static jdk.internal.org.objectweb.asm.Opcodes.*;

public class ClassWriteTest {
    public static void main(String[] args) {
        ClassWriter classWriter = new ClassWriter(0);
        classWriter.visit(V1_5, ACC_PUBLIC + ACC_ABSTRACT + ACC_INTERFACE,
                "pkg/Comparable", null, "java/lang/Object", null);
        classWriter.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "LESS", "I",
                null, -1).visitEnd();
        classWriter.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "EQUAL", "I",
                null, 0).visitEnd();
        classWriter.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "GREATER", "I",
                null, 1).visitEnd();
        classWriter.visitMethod(ACC_PUBLIC + ACC_ABSTRACT, "compareTo",
                "(Ljava/lang/Object;)I", null, null).visitEnd();
        classWriter.visitEnd();
        byte[] bytes = classWriter.toByteArray();

        MyClassLoader myClassLoader = new MyClassLoader();
        Class c = myClassLoader.defineClass("pkg.Comparable", bytes);
        System.out.println(c.getMethods()[0].getName());
    }
}
