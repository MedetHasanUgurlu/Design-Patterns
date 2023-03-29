package org.medron.factorypattern.pack2;

public enum ShapeFactoryV2 {
    Circle{
        @Override
        public Shape createShape() {
            return new Circle();
        }

    },
    Square{
        @Override
        public Shape createShape() {
            return new Square();
        }
    };
    public abstract Shape createShape();


}
