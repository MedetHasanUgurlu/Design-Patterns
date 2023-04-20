package org.medron.bridgepattern.pack2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle extends Shape{

    private int x;
    private int y;
    public Rectangle(int x, int y, Color color) {
        super(color);
        this.x = x;
        this.y = y;
    }

    @Override
    void draw() {
        System.out.println("Rectangle- "+ color.toString()+" Length-"+x+"-"+y);
    }
}
