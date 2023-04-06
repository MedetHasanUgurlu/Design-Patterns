package org.medron.commandpattern.pack;

public class Light {
    private String color;
    private int sensitivity;

    public Light(String color, int sensitivity) {
        this.color = color;
        this.sensitivity = sensitivity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSensitivity() {
        return sensitivity;
    }

    public void setSensitivity(int sensitivity) {
        this.sensitivity = sensitivity;
    }
}
