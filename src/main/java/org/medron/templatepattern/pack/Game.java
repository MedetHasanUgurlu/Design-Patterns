package org.medron.templatepattern.pack;

public abstract class Game {
    public abstract void initialize();
    public abstract void start();
    public abstract void finish();

    public final void launch(){
        initialize();
        start();
        finish();
    }
}
