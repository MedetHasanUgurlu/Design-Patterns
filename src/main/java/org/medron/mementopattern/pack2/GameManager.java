package org.medron.mementopattern.pack2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Stack;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameManager {
    Stack<GameMemento> stack = new Stack<>();
    public void save(Game game){
        stack.push(game.save());

    }
    public void restore(Game game){
        GameMemento gameMemento = stack.pop();
        game.restore(gameMemento);
    }
    public void display(){
        System.out.println(String.format("Level: %s  Score: %s",stack.get(stack.size()-1).getLevel(),stack.get(stack.size()-1).getScore()));
    }
}
