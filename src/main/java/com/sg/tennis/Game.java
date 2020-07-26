package com.sg.tennis;

public class Game {

    private ScorePlayer scoreFirstPlayer;

    private ScorePlayer scoreSecondPlayer;

    private Game(Player firstPlayer, Player secondPlayer) {
        scoreFirstPlayer = ScorePlayer.init(firstPlayer);
        scoreSecondPlayer = ScorePlayer.init(secondPlayer);
    }

    public static Game start(Player firstPlayer, Player secondPlayer) {
        return new Game(firstPlayer, secondPlayer);
    }

    public Score getScoreFirstPlayer() {
        return this.scoreFirstPlayer.getScore();
    }

    public Score getScoreSecondPlayer() {
        return this.scoreSecondPlayer.getScore();
    }

    public void winPoint(Player player) {
        if(player.equals(scoreFirstPlayer.getPlayer())) {
            scoreFirstPlayer.changeScore();
        }else if(player.equals(scoreSecondPlayer.getPlayer())){
            scoreSecondPlayer.changeScore();
        }

        if(Score.FORTY.equals(scoreFirstPlayer.getScore()) && Score.FORTY.equals(scoreSecondPlayer.getScore())){
            scoreFirstPlayer.activateDeuceRule();
            scoreSecondPlayer.activateDeuceRule();
        }

    }
}
