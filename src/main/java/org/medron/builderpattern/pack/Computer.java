package org.medron.builderpattern.pack;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Computer {
    private String brand;
    private String model;
    private int year;
    private int memory;

    private Computer(ComputerBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.memory = builder.memory;
    }
    public static class ComputerBuilder{
        private String brand;
        private String model;
        private int year;
        private int memory;

        public ComputerBuilder setBrand(String brand){
            this.brand = brand;
            return this;
        }
        public ComputerBuilder setModel(String model){
            this.model = model;
            return this;
        }
        public ComputerBuilder setYear(int year){
            this.year = year;
            return this;
        }
        public ComputerBuilder setMemory(int memory){
            this.memory = memory;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", memory=" + memory +
                '}';
    }
}
