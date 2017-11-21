package ro.rodin;

import java.util.ArrayList;
import java.util.List;


public class Player {

    private List<DoorCard> hand = new ArrayList<>();

    public Action kickOpenTheDoor(FaceDownDoorCardsPile pile){
        DoorCard card = pile.draw();
        if(card.isMonsterCard()){
            return new Combat(card.getMonster());
        } else {
            this.putInHand(card);
            return new NoAction();
        }
    }

    private void putInHand(DoorCard card) {
        hand.add(card);
    }

    public Integer numberOfCardsInHand() {
        return hand.size();
    }
}
