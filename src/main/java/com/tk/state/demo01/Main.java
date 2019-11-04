package com.tk.state.demo01;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("tk", new HappyState());

        person.say();
    }
}
