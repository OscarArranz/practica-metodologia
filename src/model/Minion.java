package model;

public abstract class Minion {

    private int id;
    private String name;
    private int health;

    public Minion(int id, String name, int health) {
        this.id = id;
        this.name = name;
        this.health = health;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}