package org.medron.builderpattern.pack;

import org.medron.builderpattern.pack2.User;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .setBrand("MSI")
                .setModel("RTX-3060")
                .setYear(2020)
                .setMemory(32)
                .build();

        System.out.println(computer.toString());

    }
}
