package org.medron.compositepattern.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HeadDepartment implements Department{
    Logger logger = Logger.getLogger("HeadDepartment.class.getName()");
    private int id;
    private String name;
    List<Department> departments;

    public HeadDepartment(int id, String name) {
        this.id = id;
        this.name = name;
        departments = new ArrayList<>();
    }

    @Override
    public void showInfo() {

        System.out.println("Id: "+id+ "Name: "+name);
        departments.forEach(Department::showInfo);
    }
    public void addDepartment(Department department){
        departments.add(department);


    }
    public void removeDepartment(Department department){
        departments.remove(department);

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
