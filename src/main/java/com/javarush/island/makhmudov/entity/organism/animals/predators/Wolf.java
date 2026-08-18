package com.javarush.island.makhmudov.entity.organism.animals.predators;

import com.javarush.island.makhmudov.entity.organism.Limit;
import com.javarush.island.makhmudov.api.annotation.DataType;

@DataType()
public class Wolf extends Predator {

    public Wolf(String name, String icon, Limit limit) {
        super(name, icon, limit);
    }
}
