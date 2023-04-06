package org.medron.templatepattern.pack;

public class Basketball extends Game{
    @Override
    public void initialize() {
        System.out.println("Basketball initialized.");
    }

    @Override
    public void start() {
        System.out.println("Basketball has started.");
    }

    @Override
    public void finish() {
        System.out.println("Basketball finished.");
    }
}
