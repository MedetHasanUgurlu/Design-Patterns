package org.medron.mediatorpattern.pack2;

import java.util.ArrayList;
import java.util.List;

public class CMediator implements Mediator{
    List<User> userList;
    public CMediator(){
        userList = new ArrayList<>();
    }
    @Override
    public void send(String message, User user) {
        for (User user1 : userList) {
            if (user1 != user) {
                user1.receivedMessage(message);
            }
        }
    }
    public void addUser(User user){
        userList.add(user);
        System.out.println("User added.");
    }
}
