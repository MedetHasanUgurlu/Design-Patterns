package org.medron.decoratorpattern.pack;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BeverageDecorator {
    private Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    public abstract String getDescription();
}
