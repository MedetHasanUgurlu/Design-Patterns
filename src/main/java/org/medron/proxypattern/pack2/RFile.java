package org.medron.proxypattern.pack2;

import java.util.ArrayList;
import java.util.List;

public class RFile implements File{

    private String name;
    private List<Integer> data = new ArrayList<>();


    public RFile(String name) {
        this.name = name;
        load();
    }
    public void load(){
        System.out.println("File: " +name+ " is loading.");
        data.add(1);
        data.add(0);
        data.add(1);
        data.add(0);
        data.add(1);
        data.add(0);
        data.add(1);
        data.add(1);
        data.add(1);
        data.add(0);
    }

    @Override
    public void read() {
        System.out.println("File: " +name+ " is reading.");

        for (Integer datum : data) {
            System.out.print(datum);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }
}
