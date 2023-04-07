package org.medron.proxypattern.pack2;

public class Main {
    public static void main(String[] args) {
        File realFile = new RFile("history.txt");
        realFile.read();
        System.out.println("");
        System.out.println("Proxy Time");
        File proxyFile = new PFile("history.txt");
        proxyFile.read();
    }
}
