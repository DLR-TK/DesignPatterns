package com.tk.cor.demo;

public class HtmlFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace('<','[');
        r = r.replace('>',']');
        msg.setMsg(r);
        return true;
    }
}
