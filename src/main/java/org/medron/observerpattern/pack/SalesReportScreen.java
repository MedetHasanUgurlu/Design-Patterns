package org.medron.observerpattern.pack;

public class SalesReportScreen extends Observer{
    @Override
    void update(SalesData data) {
        System.out.println("SalesReportScreen - Units sold: " + data.getUnitsSold() + ", Revenue: " + data.getRevenue());
    }
}
