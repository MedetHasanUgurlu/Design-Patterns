package org.medron.adapterpattern.pack;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallarDuck();
        Turkey wildTurkey = new WildTurkey();
        Duck adapter = new TurkeyAdapter(wildTurkey);
        adapter.fly();
        adapter.quack();
    }
}
