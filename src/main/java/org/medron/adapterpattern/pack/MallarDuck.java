package org.medron.adapterpattern.pack;

public class MallarDuck implements Duck{
    @Override
    public void fly() {
        System.out.println("Mallard duck flying");
    }

    @Override
    public void quack() {
        System.out.println("Mallard duck quacking...");
    }
}
