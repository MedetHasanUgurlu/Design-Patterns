package org.medron.decoratorpattern.pack;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Coffee();
        System.out.println(beverage.getDescription()+" "+ beverage.getCost());
        BeverageDecorator milk = new Milk(beverage);
        System.out.println(beverage.getDescription()+" "+ beverage.getCost());
        BeverageDecorator sugar = new Milk(beverage);
        System.out.println(beverage.getDescription()+" "+ beverage.getCost());


    }
}
