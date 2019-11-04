package com.tk.prototype.demo01;

import lombok.Data;

@Data
public class Person implements Cloneable{

    private int age = 21;
    private String name = "tk";
    public Location location = new Location("xian", "007");

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Data
    public class Location {
        private String street;
        private String roomNo;

        public Location(String street, String roomNo) {
            this.street = street;
            this.roomNo = roomNo;
        }
    }
}
