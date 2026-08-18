package com.javarush.island.makhmudov.entity.map;

import com.javarush.island.makhmudov.entity.organism.Organism;

import java.util.HashMap;
import java.util.Map;

public class GameMap {
    private final Cell[][] cells;

    private final Map<Organism, Long> statistics;

    public GameMap(int rows, int cols) {
        this.cells = new Cell[rows][cols];
        this.statistics = new HashMap<>();

    }
    public int getRows() {
        return cells.length;
    }
    public int getCols() {
        return cells[0].length;
    }

    public Cell[][] getCells() {
        return new Cell[0][];
    }
}
