package ro.rodin;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/player")
public class Game {

    @OnMessage
    public String play(String playerName){
            switch (Message.valueOf(playerName)){
                case DRAW_DOOR_CARD:
                    break;
            }

        return playerName + ", you won!";
    }

}
