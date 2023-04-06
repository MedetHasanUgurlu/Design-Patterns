package org.medron.templatepattern.pack;

public class Soccer extends Game {
    @Override
    public void initialize() {
        System.out.println("Soccer initialized.");
    }

    @Override
    public void start() {
        System.out.println("Soccer has started.");
    }

    @Override
    public void finish() {
        System.out.println("Soccer has finished");
    }
}
