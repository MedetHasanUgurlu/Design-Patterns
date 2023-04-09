package org.medron.statepattern.pack2;

public class CoffeeMaker {
    private State state;

    public CoffeeMaker() {
        this.state = new LatteState();
    }

    public State getCoffeeMakerState() {
        return state;
    }

    public void setCoffeeMakerState(State state) {
        this.state = state;
    }

    public void selectCoffee() {
        state.selectCoffee();
    }

    public void addWater() {
        state.addWater();
    }

    public void addCoffeeBeans() {
        state.addCoffeeBeans();
    }

    public void grindBeans() {
        state.grindBeans();
    }

    public void brew() {
        state.brew();
    }
}
