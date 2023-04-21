package org.medron.mediatorpattern.pack2;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements User{

    private int id;
    private String name;
    private Mediator mediator;
    @Override
    public void sendMessage(String message) {
        System.out.println("Id: "+id+ " Name: "+name+ " sending message."+"["+message+"]");
        mediator.send(message,this);
    }

    @Override
    public void receivedMessage(String message) {
        System.out.println("Id: "+id+ " Name: "+name+ " received message."+"["+message+"]");

    }
}
