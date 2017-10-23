package ro.rodin;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/game")
public class Game {

    @OnMessage
    public String play(){
        return "You won!";
    }

}
