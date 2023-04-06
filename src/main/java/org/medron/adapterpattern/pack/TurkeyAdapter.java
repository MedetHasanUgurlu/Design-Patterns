package org.medron.adapterpattern.pack;

public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        turkey.fly();
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
