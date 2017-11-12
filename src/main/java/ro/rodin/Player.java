package ro.rodin;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/player")
public class Player {

    @OnMessage
    public String play(String playerName){
            switch (Message.valueOf(playerName)){
                case DRAW_DOOR_CARD:
                    break;
            }

        return "DRAW_DOOR_CARD";
    }

}
