package ro.rodin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class PlayerTest {

    private Player player;
    private FaceDownDoorCardsPile pileWithNormalCard;
    private FaceDownDoorCardsPile pileWithMonsterCard;

    @Before
    public void setUp() throws Exception {
        player = new Player();
        pileWithNormalCard = new FaceDownDoorCardsPile(new DoorCard());
        pileWithMonsterCard = new FaceDownDoorCardsPile(new DoorCard(new Monster("Plant", 1)));
    }

    @Test
    public void given_normal_card_on_top_of_face_down_door_cards_pile_when_player_kickOpenTheDoor_then_pile_has_one_card_less() throws Exception {
        player.kickOpenTheDoor(pileWithNormalCard);

        assertTrue(pileWithNormalCard.numberOfCardsInPile() == 0);
    }

    @Test
    public void given_normal_card_on_top_of_face_down_door_cards_pile_when_player_kickOpenTheDoor_then_player_has_one_more_card_in_hand() throws Exception {
        player.kickOpenTheDoor(pileWithNormalCard);

        assertTrue(player.numberOfCardsInHand() == 1);
    }

    @Test
    public void given_normal_card_on_top_of_face_down_door_cards_pile_when_player_kickOpenTheDoor_then_player_can_do_no_action() throws Exception {
        Action action = player.kickOpenTheDoor(pileWithNormalCard);

        assertTrue(action instanceof NoAction);
    }

    @Test
    public void given_monster_card_on_top_of_face_down_door_cards_pile_when_player_kickOpenTheDoor_then_monster_card_is_placed_in_combat() throws Exception {
        Action action = player.kickOpenTheDoor(pileWithMonsterCard);

        assertTrue(player.numberOfCardsInHand() == 0);
        assertTrue(action instanceof Combat);
    }
}