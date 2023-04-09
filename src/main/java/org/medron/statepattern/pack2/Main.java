package org.medron.statepattern.pack2;

public class Main {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.addWater();
        coffeeMaker.setCoffeeMakerState(new EspressoState());
        coffeeMaker.addWater();
    }
}
