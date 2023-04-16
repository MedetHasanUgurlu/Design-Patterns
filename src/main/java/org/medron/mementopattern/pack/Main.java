package org.medron.mementopattern.pack;

public class Main {
    public static void main(String[] args) {
        SaveManager saveManager = new SaveManager();
        Game game = new Game(56,758);
        saveManager.save(game);
        Game game1 = new Game(57,789);
        saveManager.save(game1);
        saveManager.getHistory().stream().forEach(System.out::println);
        saveManager.undo(game1);
        System.out.println("////");
        saveManager.getHistory().stream().forEach(System.out::println);

    }
}
