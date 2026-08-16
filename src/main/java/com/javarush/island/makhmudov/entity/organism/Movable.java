package com.javarush.island.makhmudov.entity.organism;

import com.javarush.island.makhmudov.entity.map.Cell;

public interface Movable {
    boolean move(Cell startCell);
}
