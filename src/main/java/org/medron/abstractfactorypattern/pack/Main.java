package org.medron.abstractfactorypattern.pack;

import org.medron.abstractfactorypattern.pack.entity.Table;

public class Main {
    public static void main(String[] args) {

        Table table = TableProducer.getFactory(true).createTable();
        System.out.println(table.getClass().getSimpleName());

    }
}
