package org.medron.observerpattern.pack;

import java.util.Observable;

public class SalesReportScreen2 extends Observer {
    @Override
    void update(SalesData data) {
        System.out.println("SalesReportScreen2 - Units sold: " + data.getUnitsSold() + ", Revenue: " + data.getRevenue());

    }
}
