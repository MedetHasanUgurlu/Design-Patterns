package org.medron.mementopattern.pack;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Memento {
    private int level;
    private int score;

    @Override
    public String toString() {
        return "Memento{" +
                "level=" + level +
                ", score=" + score +
                '}';
    }
}
