package ro.rodin;

public class Monster {

    private String name;
    private Integer level;

    public Monster(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }
}
