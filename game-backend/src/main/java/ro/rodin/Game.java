package ro.rodin;

public class Game {
    private FaceDownDoorCardsPile faceDownDoorCardsPile;

    public Game(FaceDownDoorCardsPile faceDownDoorCardsPile) {
        this.faceDownDoorCardsPile = faceDownDoorCardsPile;
    }

    public FaceDownDoorCardsPile getFaceDownDoorCardsPile() {
        return faceDownDoorCardsPile;
    }
}
