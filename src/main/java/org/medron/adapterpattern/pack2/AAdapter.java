package org.medron.adapterpattern.pack2;

public class AAdapter implements B{
    A a;

    public AAdapter(A a) {
        this.a = a;
    }

    @Override
    public void bFeatures() {
        System.out.println("Nothing");
    }

    @Override
    public void bbbFeatures() {
        a.aaaFeatures();
    }
}
