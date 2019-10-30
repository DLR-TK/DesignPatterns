package com.tk.cor.servlet.filter;

import com.tk.cor.servlet.object.Msg;
import com.tk.cor.servlet.object.Request;
import com.tk.cor.servlet.object.Response;

public class HtmlFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.setStr(request.getStr()
                .replaceAll("<","[")
                .replaceAll(">","]")
                + "--HtmlFilter()");

        filterChain.doFilter(request, response);
        response.setStr(response.getStr() + "--HtmlFilter()");
    }
}
