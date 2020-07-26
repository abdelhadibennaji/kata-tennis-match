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

    public void winPoint(Player winnerPlayer) {
        changeScoreForThePlayerWinPoint(winnerPlayer);
        activateDeuceRuleIfTheTwoPlayersReachForty();
    }

    private void changeScoreForThePlayerWinPoint(Player winnerPlayer){
        ScorePlayer scoreWinnerPlayer = winnerPlayer.equals(scoreFirstPlayer.getPlayer()) ? scoreFirstPlayer : scoreSecondPlayer;
        scoreWinnerPlayer.changeScore();
    }

    private void activateDeuceRuleIfTheTwoPlayersReachForty(){
        if((Score.FORTY.equals(scoreFirstPlayer.getScore()) && Score.FORTY.equals(scoreSecondPlayer.getScore())) ||
                (Score.ADVANTAGE.equals(scoreFirstPlayer.getScore()) && Score.ADVANTAGE.equals(scoreSecondPlayer.getScore()))){
            scoreFirstPlayer.activateDeuceRule();
            scoreSecondPlayer.activateDeuceRule();
        }
    }
}
