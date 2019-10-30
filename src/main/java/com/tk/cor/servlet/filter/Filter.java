package com.tk.cor.servlet.filter;

import com.tk.cor.servlet.object.Msg;
import com.tk.cor.servlet.object.Request;
import com.tk.cor.servlet.object.Response;

public interface Filter {
    void doFilter(Request request, Response response, FilterChain filterChain);
}
