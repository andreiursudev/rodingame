package ro.rodin;

public class DoorCard {

    private Monster monster;

    public DoorCard() {
    }

    public DoorCard(Monster monster) {
        this.monster = monster;
    }

    public boolean isMonsterCard() {
        return monster != null;
    }

    public Monster getMonster() {
        return monster;
    }
}
