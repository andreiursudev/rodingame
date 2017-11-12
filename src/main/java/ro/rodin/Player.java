package ro.rodin;

import java.util.ArrayList;
import java.util.List;


public class Player {

    private List<DoorCard> hand = new ArrayList<>();

    public void kickOpenTheDoor(FaceDownDoorCardsPile pile){
        DoorCard card = pile.draw();
        if(card.isMonsterCard()){

        } else {
            this.putInHand(card);
        }
    }

    private void putInHand(DoorCard card) {
        hand.add(card);
    }

    public Integer numberOfCardsInHand() {
        return hand.size();
    }
}
