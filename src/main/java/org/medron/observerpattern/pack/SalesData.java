package org.medron.observerpattern.pack;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@Builder
public class SalesData {
    private double revenue;
    private int unitsSold;
    private List<Observer> observerList;

    public SalesData(){
        observerList = new ArrayList<>();
    }
    public void setRevenue(double revenue) {
        this.revenue = revenue;
        notifyObserver();
    }

    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
        notifyObserver();

    }
    public void notifyObserver(){
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }
    public void attachObserver(Observer observer){
        observerList.add(observer);
    }



}
