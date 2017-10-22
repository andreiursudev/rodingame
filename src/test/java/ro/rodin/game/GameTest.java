package ro.rodin.game;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testPlay() throws Exception {
        Game game = new Game();
        String play = game.play();
        assertEquals("You won!", play);

    }
}