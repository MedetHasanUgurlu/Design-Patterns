package org.medron.mementopattern.pack;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Stack;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SaveManager {
    private Stack<Memento> history = new Stack<>();
    public void save(Game game){
        history.push(game.save());
    }
    public void undo(Game game){
        Memento memento = history.pop();
        game.restore(memento);
    }

}
