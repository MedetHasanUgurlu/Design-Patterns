package org.medron.builderpattern.pack2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private int id;
    public User(String name){
        this.name = name;
    }
    private User(){

    }
    class Gort{
        User user = new User();
    }

}
