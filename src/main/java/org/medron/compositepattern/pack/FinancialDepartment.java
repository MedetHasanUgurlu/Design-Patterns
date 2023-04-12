package org.medron.compositepattern.pack;


public class FinancialDepartment implements Department{
    private int id;
    private String name;

    public FinancialDepartment(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.err.println("Id: "+id+ "Name: "+name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
