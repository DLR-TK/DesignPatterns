package com.tk.prototype.demo02;

/**
 * 深克隆
 */
@SuppressWarnings("all") //抑制警告(与本文无关)

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person) person1.clone();
        System.out.println(person2.getAge() + " " + person2.getName());
        System.out.println(person2.getLocation());

        System.out.println(person1.getLocation() == person2.getLocation());

        person1.setAge(12);
        person1.location.setRoomNo("009");
        System.out.println(person2.getAge());
        System.out.println(person2.getLocation());
    }
}
