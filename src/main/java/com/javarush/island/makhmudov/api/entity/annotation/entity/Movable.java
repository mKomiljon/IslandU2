package com.javarush.island.makhmudov.api.entity.annotation.entity;

import com.javarush.island.makhmudov.entity.map.Cell;

@FunctionalInterface
public interface Movable {
    boolean move(Cell startCell);
}
