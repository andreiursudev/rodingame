package ro.rodin;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;
import java.util.ArrayList;
import java.util.List;

@ServerEndpoint("/player")
public class Player {

    private List<DoorCard> hand = new ArrayList<>();

    private Game game;

    @OnOpen
    public void initialize() {
        game = new GameFactory().basicGame();
    }

    @OnMessage
    public String play(String playerName){
            switch (Message.valueOf(playerName)){
                case KICK_OPEN_THE_DOOR:
                    kickOpenTheDoor(game.getFaceDownDoorCardsPile());
                    break;
            }

        return "KICK_OPEN_THE_DOOR";
    }

    public void kickOpenTheDoor(FaceDownDoorCardsPile pile){
        DoorCard card = pile.draw();
        this.putInHand(card);
    }

    private void putInHand(DoorCard card) {
        hand.add(card);
    }

    public Integer numberOfCardsInHand() {
        return hand.size();
    }
}
