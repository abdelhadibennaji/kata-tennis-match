package com.sg.tennis;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void The_game_should_starts_with_a_score_of_0_point_for_each_player() {
        //GIVEN
        Player firstPlayer = new Player("Nadal");
        Player secondPlayer = new Player("Federer");

        //WHEN
        Game game = Game.start(firstPlayer, secondPlayer);

        //THEN
        assertEquals(Score.ZERO,game.getScoreFirstPlayer());
        assertEquals(Score.ZERO, game.getScoreSecondPlayer());
    }

    @Test
    public void the_game_score_should_be_fifteen_if_the_player_win_one_point() {
        //GIVEN
        Player firstPlayer = new Player("Nadal");
        Player secondPlayer = new Player("Federer");
        Game game = Game.start(firstPlayer, secondPlayer);
        //WHEN
        game.winPoint(firstPlayer);
        //THEN
        assertEquals(15, game.getScoreFirstPlayer());
    }

}
