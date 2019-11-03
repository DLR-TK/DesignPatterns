package com.tk.builder;

public interface TerrainBuilder {

    TerrainBuilder buildWall();
    TerrainBuilder buildFort();
    TerrainBuilder buildMine();
    Terrain build();
}
