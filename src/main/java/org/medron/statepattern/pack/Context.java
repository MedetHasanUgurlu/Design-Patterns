package org.medron.statepattern.pack;

public class Context {
    private State state;

    public Context() {
        this.state = new StartState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
