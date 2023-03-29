package org.medron.singletonpattern.pack;

public class Singleton {
    private static Singleton uniqueSingleton;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if (uniqueSingleton == null) {
            uniqueSingleton = new Singleton();
        }

        return uniqueSingleton;
    }
    public void run(){
        System.out.println("Singleton run method.");
    }

}
