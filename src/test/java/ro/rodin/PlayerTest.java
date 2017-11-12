package ro.rodin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class PlayerTest {

    private Player player;
    private FaceDownDoorCardsPile pile;

    @Before
    public void setUp() throws Exception {
        player = new Player();
        pile = new FaceDownDoorCardsPile(mock(DoorCard.class));
    }

    @Test
    public void when_player_draws_normal_card_then_the_card_is_removed_from_the_pile() throws Exception {
        player.kickOpenTheDoor(pile);

        assertTrue(pile.numberOfCardsInPile() == 0);
    }

    @Test
    public void when_player_draws_normal_card_then_the_card_is_in_players_hand() throws Exception {
        player.kickOpenTheDoor(pile);

        assertTrue(player.numberOfCardsInHand() == 1);
    }
}