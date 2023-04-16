package org.medron.mementopattern.pack;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Game {
    private int level;
    private int score;

    public Memento save(){
        return new Memento(level,score);
    }
    public void restore(Memento memento){
        level = memento.getLevel();
        score = memento.getScore();
    }
}
