package com.sg.tennis;

public class ScorePlayer {

    private Player player;

    private Score score = Score.ZERO;

    private ScorePlayer(Player player) {
        this.player = player;
    }

    public static ScorePlayer init(Player player) {
        return new ScorePlayer(player);
    }

    public Player getPlayer() {
        return player;
    }

    public Score getScore() {
        return score;
    }

    public void changeScore() {
        this.score = this.score.getNext();
    }

    public void activateDeuceRule() {
        this.score = Score.DEUCE;
    }
}
