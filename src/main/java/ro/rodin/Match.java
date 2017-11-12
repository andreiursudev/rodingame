package ro.rodin;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/match")
public class Match {

    private FaceDownDoorCardsPile faceDownDoorCardsPile;
    private Player player;

    @OnOpen
    public void initialize() {
        faceDownDoorCardsPile =
                new FaceDownDoorCardsPile(
                        new DoorCard()
                );

        player = new Player();
    }

    @OnMessage
    public String play(String action){
        switch (Message.valueOf(action)){
            case KICK_OPEN_THE_DOOR:
                return player.kickOpenTheDoor(faceDownDoorCardsPile).act();
        }

        return "no action match";
    }

}
