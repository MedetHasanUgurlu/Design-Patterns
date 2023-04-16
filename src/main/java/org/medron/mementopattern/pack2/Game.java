package org.medron.mementopattern.pack2;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter

@AllArgsConstructor
@NoArgsConstructor
public class Game {
    private int level;
    private int score;

    public GameMemento save(){
        return new GameMemento(level,score);
    }
    public void restore(GameMemento memento){
        setLevel(memento.getLevel());
        setScore(memento.getScore());
    }

    public void setLevel(int level) {
        this.level = level;
        save();
    }

    public void setScore(int score) {
        this.score = score;
        save();
    }
}
