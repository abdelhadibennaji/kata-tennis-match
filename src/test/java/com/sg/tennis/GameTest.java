package com.sg.tennis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {

    private Player firstPlayer;
    private Player secondPlayer;

    @BeforeEach
    public void setUp(){
        firstPlayer = new Player("Nadal");
        secondPlayer = new Player("Federer");
    }

    @Test
    public void The_game_should_starts_with_a_score_of_0_point_for_each_player() {
        //GIVEN

        //WHEN
        Game game = Game.start(this.firstPlayer, this.secondPlayer);

        //THEN
        assertEquals(Score.ZERO,game.getScoreFirstPlayer());
        assertEquals(Score.ZERO, game.getScoreSecondPlayer());
    }

    @Test
    public void the_game_score_should_be_fifteen_if_the_player_wins_one_point() {
        //GIVEN
        Game game = Game.start(this.firstPlayer, this.secondPlayer);
        //WHEN
        game.winPoint(this.firstPlayer);
        //THEN
        assertEquals(Score.FIFTEEN, game.getScoreFirstPlayer());
    }

    @Test
    public void the_game_score_should_be_thirty_if_the_player_wins_two_points() {
        //GIVEN
        Game game = Game.start(this.firstPlayer, this.secondPlayer);
        //WHEN
        game.winPoint(this.firstPlayer);
        game.winPoint(this.firstPlayer);
        //THEN
        assertEquals(Score.THIRTY, game.getScoreFirstPlayer());
    }

    @Test
    public void the_game_score_should_be_forty_if_the_player_wins_three_points() {
        //GIVEN
        Game game = Game.start(this.firstPlayer, this.secondPlayer);
        //WHEN
        game.winPoint(this.firstPlayer);
        game.winPoint(this.firstPlayer);
        game.winPoint(this.firstPlayer);
        //THEN
        assertEquals(Score.FORTY, game.getScoreFirstPlayer());
    }

}
