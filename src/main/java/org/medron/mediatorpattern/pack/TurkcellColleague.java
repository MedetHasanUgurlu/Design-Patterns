package org.medron.mediatorpattern.pack;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class TurkcellColleague implements Colleague{
    private String name;
    private  Mediator mediator;

    public TurkcellColleague(String name) {
        this.name = name;
    }

    @Override
    public void send(String message) {
        mediator.send(message,this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Received message: " + message);
    }
}
