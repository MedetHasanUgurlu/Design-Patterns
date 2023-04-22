package org.medron.observerpattern.pack;

public class Main {
    public static void main(String[] args) {
        Observer observer = new SalesReportScreen();
        Observer observer1 = new SalesReportScreen2();
        SalesData data = new SalesData();
        data.attachObserver(observer);
        data.attachObserver(observer1);
        data.setRevenue(1500);
        data.setUnitsSold(150);



        data.setRevenue(15200);
        data.setUnitsSold(500);

    }
}
