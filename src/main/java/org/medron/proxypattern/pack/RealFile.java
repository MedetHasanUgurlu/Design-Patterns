package org.medron.proxypattern.pack;

public class RealFile implements File{
    private String fileName;

    public RealFile(String fileName) {
        this.fileName = fileName;
        load();
    }

    @Override
    public void read() {
        System.out.println(fileName+ " reading...");

    }
    public void load(){
        System.out.println(fileName + " file loading...");
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
