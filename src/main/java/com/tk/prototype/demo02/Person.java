package com.tk.prototype.demo02;

import lombok.Data;

@Data
public class Person implements Cloneable{

    private int age = 21;
    private String name = "tk";
    public Location location = new Location("xian", "007");

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person p = (Person) super.clone();
        p.location = (Location) location.clone();
        return p;
    }

    @Data
    public class Location implements Cloneable{
        private String street;
        private String roomNo;

        public Location(String street, String roomNo) {
            this.street = street;
            this.roomNo = roomNo;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
