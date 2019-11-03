package com.tk.Bridge;

public class WarmGift extends Gift {

    private String name = "WarmGift";

    public WarmGift(GiftImpl impl) {
        this.impl = impl;
        this.name = this.name + "--" + impl.getName();
    }

    @Override
    public String toString() {
        return name;
    }
}
