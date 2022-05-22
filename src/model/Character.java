package model;

import java.util.List;

public abstract class Character {

    private int id;
    private String name;
    private int gold;
    private int health;
    private int power;

    private List<Armor> armor;
    private Armor activeArmor;
    private List<Weapon> weapons;
    private List<Weapon> activeWeapons;

    private List<Strength> strengths;
    private List<Weakness> weaknesses;

    public Character() {}

    public Character(int id, String name, int gold, int health, int power, List<Armor> armor, Armor activeArmor,
                     List<Weapon> weapons, List<Weapon> activeWeapons, List<Strength> strengths, List<Weakness> weaknesses) {
        this.id = id;
        this.name = name;
        this.gold = gold;
        this.health = health;
        this.power = power;
        this.armor = armor;
        this.activeArmor = activeArmor;
        this.weapons = weapons;
        this.activeWeapons = activeWeapons;
        this.strengths = strengths;
        this.weaknesses = weaknesses;
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

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public List<Armor> getArmor() {
        return armor;
    }

    public void setArmor(List<Armor> armor) {
        this.armor = armor;
    }

    public Armor getActiveArmor() {
        return activeArmor;
    }

    public void setActiveArmor(Armor activeArmor) {
        this.activeArmor = activeArmor;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    public List<Weapon> getActiveWeapons() {
        return activeWeapons;
    }

    public void setActiveWeapons(List<Weapon> activeWeapons) {
        this.activeWeapons = activeWeapons;
    }

    public List<Strength> getStrengths() {
        return strengths;
    }

    public void setStrengths(List<Strength> strengths) {
        this.strengths = strengths;
    }

    public List<Weakness> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(List<Weakness> weaknesses) {
        this.weaknesses = weaknesses;
    }

}
