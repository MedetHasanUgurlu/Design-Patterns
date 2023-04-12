package org.medron.compositepattern.pack;

public class Main {
    public static void main(String[] args) {
        HeadDepartment headDepartment = new HeadDepartment(1,"Head Department");
        SalesDepartment salesDepartment = new SalesDepartment(2,"Sales Department");
        FinancialDepartment financialDepartment = new FinancialDepartment(3,"Financial Department");
        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);
        headDepartment.showInfo();
    }
}
