package com.javarush.island.makhmudov.api.init;

import com.javarush.island.makhmudov.entity.map.Cell;
import com.javarush.island.makhmudov.entity.organism.Organisms;

import java.util.List;

public interface Initialization {
    void fill(Cell cell, double persentProbably);
    List<Organisms> getAllPrototypes();
}
