package com.tk.cor.demo;

public class Main {

    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("大家好:),<script>,欢迎访问tk.com,996");

        FilterChain filterChain = new FilterChain();
        filterChain.add(new HtmlFilter()).add(new SensitiveFilter());

        FilterChain filterChain2 = new FilterChain();
        filterChain2.add(new FaceFilter()).add(new UrlFilter());

        filterChain.add(filterChain2);
        filterChain.doFilter(msg);

        System.out.println(msg);
    }
}

