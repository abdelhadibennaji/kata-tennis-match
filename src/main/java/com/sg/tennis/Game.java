package com.sg.tennis;

public class Game {

    private Game(Player firstPlayer, Player secondPlayer) {
    }

    public static Game start(Player firstPlayer, Player secondPlayer) {
        return new Game(firstPlayer, secondPlayer);
    }

    public Score getScoreFirstPlayer() {
        return Score.ZERO;
    }

    public Score getScoreSecondPlayer() {
        return Score.ZERO;
    }
}
