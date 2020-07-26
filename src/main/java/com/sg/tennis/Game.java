package com.sg.tennis;

public class Game {

    private Score scoreFirstPlayer = Score.ZERO;

    private Score scoreSecondPlayer = Score.ZERO;

    private Player firstPlayer;

    private Player secondPlayer;

    private Game(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public static Game start(Player firstPlayer, Player secondPlayer) {
        return new Game(firstPlayer, secondPlayer);
    }

    public Score getScoreFirstPlayer() {
        return this.scoreFirstPlayer;
    }

    public Score getScoreSecondPlayer() {
        return this.scoreSecondPlayer;
    }

    public void winPoint(Player player) {
        if(player.equals(firstPlayer)) {
            this.scoreFirstPlayer = Score.FIFTEEN;
        }else if(player.equals(secondPlayer)){
            this.scoreSecondPlayer = Score.FIFTEEN;
        }
    }
}
