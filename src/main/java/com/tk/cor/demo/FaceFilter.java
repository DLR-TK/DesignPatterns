package com.tk.cor.demo;

public class FaceFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace(":)","^V^");
        msg.setMsg(r);
        return true;
    }
}
