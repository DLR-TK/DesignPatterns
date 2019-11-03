package com.tk.Bridge;


public class ColdGift extends Gift {

    private String name = "WarmGift";

    public ColdGift(GiftImpl impl) {
        this.impl = impl;
        this.name = this.name + "--" + impl.getName();
    }

    @Override
    public String toString() {
        return  name;
    }
}
