package org.medron.proxypattern.pack2;

public class PFile implements File{
    private String name;
    RFile rFile;

    public PFile(String name) {
        this.name = name;
    }

    @Override
    public void read() {
        if(rFile== null){
            rFile = new RFile(name);
        }
        System.out.println("File "+ name+ " is reading");
        for (int i = rFile.getData().size()/2; i < rFile.getData().size(); i++) {
            System.out.print(rFile.getData().get(i));
        }

    }
}
