package ro.rodin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class FaceDownDoorCardsPileTest {

    @Test
    public void draw_remove_top_card() throws Exception {
        DoorCard firstCard = mock(DoorCard.class);
        DoorCard secondCard = mock(DoorCard.class);

        FaceDownDoorCardsPile pile = new FaceDownDoorCardsPile(firstCard, secondCard);

        DoorCard card = pile.draw();
        assertEquals(firstCard, card);
        assertTrue(pile.numberOfCardsInPile() == 1);
    }
}