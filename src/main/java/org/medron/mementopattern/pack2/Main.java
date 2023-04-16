package org.medron.mementopattern.pack2;

public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        Game game = new Game(1,5);
        gameManager.save(game);
        Game game2 = new Game(2,9);
        gameManager.save(game2);
        gameManager.display();
        gameManager.restore(game2);
        gameManager.display();
    }
}
