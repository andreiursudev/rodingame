package ro.rodin;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/match")
public class Match {

    private Game game;
    private Player player;

    @OnOpen
    public void initialize() {
        game =  new Game(
                new FaceDownDoorCardsPile(
                        new DoorCard()
                )
        );
        player = new Player();
    }

    @OnMessage
    public String play(String action){
        switch (Message.valueOf(action)){
            case KICK_OPEN_THE_DOOR:
                player.kickOpenTheDoor(game.getFaceDownDoorCardsPile());
                break;
        }

        return "KICK_OPEN_THE_DOOR";
    }

}
