package org.medron.bridgepattern.pack2;

public abstract class Shape {
    protected Color color;
    public Shape(Color color){
        this.color = color;
    }
    abstract void draw();
}
