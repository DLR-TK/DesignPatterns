package com.tk.builder;

public class Main {
    public static void main(String[] args) {
        TerrainBuilder terrainBuilder = new ComplexTerrainBuilder();
        Terrain terrain = terrainBuilder.buildWall().buildFort().buildMine().build();

        Person person = new Person.PersonBuilder()
                .basicInfo(1, "tk", 21)
                .weight(60)
                .score(88)
                .loc("xian", "007")
                .build();
    }
}
