package com.javarush.island.makhmudov.entity.organism;

import com.javarush.island.makhmudov.api.entity.Eating;
import com.javarush.island.makhmudov.api.entity.Reproducible;
import com.javarush.island.makhmudov.api.entity.Movable;

public abstract class Organism implements Movable, Eating, Reproducible, cloneable {
}
