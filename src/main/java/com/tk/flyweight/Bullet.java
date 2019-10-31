package com.tk.flyweight;

import lombok.Data;

import java.util.UUID;

@Data
public class Bullet {
    public UUID id = UUID.randomUUID();
    boolean living = true;
}
