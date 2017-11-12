package ro.rodin;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class FaceDownDoorCardsPile {
    private Deque<DoorCard> cards;

    public FaceDownDoorCardsPile(DoorCard... cards) {
        this.cards = new ArrayDeque(Arrays.asList(cards));
    }

    public DoorCard draw() {
        return cards.poll();
    }

    public Integer numberOfCardsInPile(){
        return cards.size();
    }
}
