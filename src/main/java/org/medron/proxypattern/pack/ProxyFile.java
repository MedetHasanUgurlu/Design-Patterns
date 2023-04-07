package org.medron.proxypattern.pack;

public class ProxyFile implements File{

    private String fileName;
    private RealFile realFile;

    public ProxyFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void read() {
        if(realFile==null){
            realFile = new RealFile(fileName);
        }
        System.out.println(fileName+ "is reading.");

    }
}
