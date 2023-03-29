package org.medron.factorypattern.pack;

public class ShapeFactory {
    public Shape getShape(String name){
        Shape shape= null;
        if(name.equalsIgnoreCase("circle")){
            shape = new Circle();

        }else if(name.equalsIgnoreCase("square")){
            shape = new Square();

        }
        return shape;
    }
}
