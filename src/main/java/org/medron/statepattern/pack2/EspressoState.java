package org.medron.statepattern.pack2;

public class EspressoState implements State {
    @Override
    public void selectCoffee() {
        System.out.println("Espresso selected.");
    }

    @Override
    public void addWater() {
        System.out.println("Adding water for espresso.");
    }

    @Override
    public void addCoffeeBeans() {
        System.out.println("Adding coffee beans for espresso.");
    }

    @Override
    public void grindBeans() {
        System.out.println("Grinding coffee beans for espresso.");
    }

    @Override
    public void brew() {
        System.out.println("Brewing espresso.");
    }
}
