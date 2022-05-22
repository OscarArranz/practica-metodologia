package model;

public abstract class SpecialAbility {

    private int id;
    private String name;
    private int attackValue;
    private int defenseValue;

    public SpecialAbility(int id, String name, int attackValue, int defenseValue) {
        this.id = id;
        this.name = name;
        this.attackValue = attackValue;
        this.defenseValue = defenseValue;
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

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }

}
