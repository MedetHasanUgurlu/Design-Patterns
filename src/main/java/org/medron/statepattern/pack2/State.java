package org.medron.statepattern.pack2;

public interface State {
    void selectCoffee();
    void addWater();
    void addCoffeeBeans();
    void grindBeans();
    void brew();
}
