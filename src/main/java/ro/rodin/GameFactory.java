package ro.rodin;

public class GameFactory {

    public GameFactory() {
    }

    public Game basicGame(){
        return new Game(
                new FaceDownDoorCardsPile(
                        new DoorCard()
                )
        );
    }
}
