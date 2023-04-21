package org.medron.mediatorpattern.pack;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator{
    private List<Colleague> colleagues;
    public ConcreteMediator(){
        colleagues = new ArrayList<>();
    }
    @Override
    public void send(String message, Colleague colleague) {
        for (Colleague colleague1 : colleagues) {
            if(colleague1 != colleague){
                colleague.receive(message);
            }
        }
    }
    public void addColleague(Colleague colleague){
        colleagues.add(colleague);
    }
}
