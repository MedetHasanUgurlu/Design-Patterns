package org.medron.proxypattern.pack;

public class Main {
    public static void main(String[] args) {
        RealFile realFile = new RealFile("pattern.txt");
        realFile.read();
        ProxyFile proxyFile = new ProxyFile("pattern2.txt");
        proxyFile.read();
    }
}
