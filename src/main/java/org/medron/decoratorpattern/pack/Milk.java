package org.medron.decoratorpattern.pack;

public class Milk extends BeverageDecorator{
    public Milk(Beverage beverage) {
        super(beverage);
        super.getBeverage().setCost(beverage.getCost()+5);
    }

    @Override
    public String getDescription() {
        return super.getBeverage().getDescription()+" ,Milk";
    }

}
