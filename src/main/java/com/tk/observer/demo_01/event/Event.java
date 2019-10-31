package com.tk.observer.demo_01.event;

abstract class Event<T> {
    abstract T getSource();
}
