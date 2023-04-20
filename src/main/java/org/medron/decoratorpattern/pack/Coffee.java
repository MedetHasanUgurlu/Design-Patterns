package org.medron.decoratorpattern.pack;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coffee extends Beverage{
    public Coffee(){
        super.setCost(20);
        super.setDescription("Coffee");
    }
    @Override
    public double calculateCost() {
        return 20;
    }
}
