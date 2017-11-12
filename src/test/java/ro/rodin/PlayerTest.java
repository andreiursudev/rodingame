package ro.rodin;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testPlay() throws Exception {
        Player player = new Player();
        String play = player.play("DRAW_DOOR_CARD");
        assertEquals("DRAW_DOOR_CARD", play);
    }
}