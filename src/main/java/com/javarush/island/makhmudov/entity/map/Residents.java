package com.javarush.island.makhmudov.entity.map;

import com.javarush.island.makhmudov.entity.organism.Organism;

import java.util.concurrent.ConcurrentHashMap;

public class Residents extends ConcurrentHashMap<String, Organism> {
    private static final int PERCENT_RANDOM_ROTATE = 1;

    private Organism checkNull(Object key) {
        checkNull(key);
        return super.get(key);
    }
}
