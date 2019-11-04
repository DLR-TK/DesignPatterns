package com.tk.observer.demo01.event;

abstract class Event<T> {
    abstract T getSource();
}
