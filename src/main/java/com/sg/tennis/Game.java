package com.sg.tennis;

public class Game {

    private Game(Player firstPlayer, Player secondPlayer) {
    }

    public static Game start(Player firstPlayer, Player secondPlayer) {
        return new Game(firstPlayer, secondPlayer);
    }

    public int getScoreFirstPlayer() {
        return 0;
    }

    public int getScoreSecondPlayer() {
        return 0;
    }
}
