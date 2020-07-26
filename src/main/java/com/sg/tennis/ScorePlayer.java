package com.sg.tennis;

public class ScorePlayer {

    private Player player;

    private Score score;

    private ScorePlayer(Player player) {
        this.player = player;
    }

    public static ScorePlayer init(Player player) {
        ScorePlayer scorePlayer = new ScorePlayer(player);
        scorePlayer.score = Score.ZERO;
        return scorePlayer;
    }

    public Player getPlayer() {
        return player;
    }

    public Score getScore() {
        return score;
    }

    public void changeScore() {
        this.score = Score.FIFTEEN;
    }
}
