package com.tk.cor.servlet.filter;

import com.tk.cor.servlet.object.Msg;
import com.tk.cor.servlet.object.Request;
import com.tk.cor.servlet.object.Response;

public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.setStr(request.getStr().replaceAll("996","955") + "--SensitiveFilter()");
        filterChain.doFilter(request, response);
        response.setStr(response.getStr() + "--SensitiveFilter()");
    }
}
