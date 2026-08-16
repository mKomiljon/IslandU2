package com.javarush.island.makhmudov.api.entity.annotation.entity;

import com.javarush.island.khmelov.entity.map.Cell;

public interface Movable {
    boolean move(Cell startCell);
}
