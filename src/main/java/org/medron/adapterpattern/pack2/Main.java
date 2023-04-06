package org.medron.adapterpattern.pack2;

public class Main {
    public static void main(String[] args) {
        AConcretes aConcretes = new AConcretes();
        aConcretes.aaaFeatures();
        BConcretes bConcretes = new BConcretes();
        bConcretes.bbbFeatures();
        AAdapter aAdapter = new AAdapter(aConcretes);
        aAdapter.bbbFeatures();
    }
}
