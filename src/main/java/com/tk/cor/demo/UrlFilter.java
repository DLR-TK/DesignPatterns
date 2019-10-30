package com.tk.cor.demo;

public class UrlFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace("tk.com","http://www.baidu.com");
        msg.setMsg(r);
        return true;
    }
}
