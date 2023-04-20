package org.medron.decoratorpattern.pack;

public class Sugar extends BeverageDecorator{
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return null;
    }
}
