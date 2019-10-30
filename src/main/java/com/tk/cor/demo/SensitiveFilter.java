package com.tk.cor.demo;

public class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replaceAll("996","955");
        msg.setMsg(r);
        return false;
    }
}
