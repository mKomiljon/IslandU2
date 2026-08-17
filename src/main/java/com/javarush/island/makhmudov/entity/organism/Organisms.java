package com.javarush.island.makhmudov.entity.organism;

import com.javarush.island.makhmudov.api.entity.Eating;
import com.javarush.island.makhmudov.api.entity.Reproducible;
import com.javarush.island.makhmudov.api.entity.Movable;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public abstract class Organisms implements Movable, Eating, Reproducible {
    private final static AtomicLong idCounter = new AtomicLong(System.currentTimeMillis());

    private final Set<Map.Entry<String, Integer>> foodMap;
    private long id = idCounter.incrementAndGet();

    protected Organisms(Set<Map.Entry<String, Integer>> foodMap) {
        this.foodMap = foodMap;
    }
}
