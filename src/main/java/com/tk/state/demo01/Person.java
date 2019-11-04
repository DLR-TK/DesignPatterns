package com.tk.state.demo01;

import lombok.Data;

@Data
public class Person {

    private String name;
    private PersonState personState;

    public void smile() {
        personState.smile();
    }

    public void cry() {
        personState.cry();
    }

    public void say() {
        personState.say();
    }

    public Person(String name, PersonState personState) {
        this.name = name;
        this.personState = personState;
    }
}
