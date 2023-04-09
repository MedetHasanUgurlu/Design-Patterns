package org.medron.statepattern.pack2;

public class LatteState implements State {
    @Override
    public void selectCoffee() {
        System.out.println("Latte selected.");
    }

    @Override
    public void addWater() {
        System.out.println("Adding water for latte.");
    }

    @Override
    public void addCoffeeBeans() {
        System.out.println("Adding coffee beans for latte.");
    }

    @Override
    public void grindBeans() {
        System.out.println("Grinding coffee beans for latte.");
    }

    @Override
    public void brew() {
        System.out.println("Steaming milk for latte. Brewing latte.");
    }
}
