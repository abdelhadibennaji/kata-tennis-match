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
        assertEquals(0,game.getScoreFirstPlayer);
        assertEquals(0, game.getScoreSecondPlayer);
    }
}
