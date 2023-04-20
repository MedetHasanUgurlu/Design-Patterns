package org.medron.decoratorpattern.pack;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Beverage {

    private String description;
    private double cost=0;

    public abstract double calculateCost();
}
