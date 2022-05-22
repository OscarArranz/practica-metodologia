package model;

public class Challenge {
    private int id;
    private int gold;

    private DefaultUser defiant;
    private DefaultUser defied;

    public Challenge(int id, int gold, DefaultUser defiant, DefaultUser defied) {
        this.id = id;
        this.gold = gold;
        this.defiant = defiant;
        this.defied = defied;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public DefaultUser getDefiant() {
        return defiant;
    }

    public void setDefiant(DefaultUser defiant) {
        this.defiant = defiant;
    }

    public DefaultUser getDefied() {
        return defied;
    }

    public void setDefied(DefaultUser defied) {
        this.defied = defied;
    }

}
