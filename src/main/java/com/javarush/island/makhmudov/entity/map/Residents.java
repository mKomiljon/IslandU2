package com.javarush.island.makhmudov.entity.map;

import com.javarush.island.makhmudov.entity.organism.Organisms;

import java.util.concurrent.ConcurrentHashMap;

public class Residents extends ConcurrentHashMap<String, Organisms> {
    private static final int PERCENT_RANDOM_ROTATE = 1;

    private Organisms checkNull(Object key) {
        checkNull(key);
        return super.get(key);
    }
}
