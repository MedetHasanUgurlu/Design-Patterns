package org.medron.factorypattern.pack2;

public class MainPack2 {
    public static void main(String[] args) {
        Shape s = ShapeFactoryV2.Circle.createShape();
        s.info();
    }
}
