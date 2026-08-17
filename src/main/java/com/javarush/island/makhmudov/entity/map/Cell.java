package com.javarush.island.makhmudov.entity.map;

import com.javarush.island.khmelov.entity.map.Residents;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Cell {
    private final List<Cell> nextcell = new ArrayList<>();
    @Getter
    private final Lock lock = new ReentrantLock(true);
    @Getter
    private final Residents residents = new Residents();

    public void updateNextCell(GameMap map, int row, int col) {
        Cell[][] cells = map.getCells();
    }
}
