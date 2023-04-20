package org.medron.commandpattern.pack;

public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Sensitivity: "+ light.getSensitivity()+ ", Color: "+ light.getColor()+ " is on.");

    }
}

