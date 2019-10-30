package com.tk.cor.servlet;

import com.tk.cor.servlet.filter.*;
import com.tk.cor.servlet.object.Request;
import com.tk.cor.servlet.object.Response;

public class ServletMain {

    public static void main(String[] args) {

        Request request = new Request();
        request.setStr("request:大家好:),<script>,欢迎访问tk.com,996");

        Response response = new Response();
        response.setStr("response:");

        FilterChain filterChain = new FilterChain();
        filterChain.add(new HtmlFilter()).add(new SensitiveFilter());
        filterChain.doFilter(request, response);
        System.out.println(request.getStr());
        System.out.println(response.getStr());
    }
}

