package org.medron.facadepattern.pack;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Gpu {
    private String name;
    public void launch(){
        System.out.println(String.format("%s is launched.",name));
    }
    public void terminate(){
        System.out.println(String.format("%s is terminated.",name));
    }
}
