package model;

import java.util.List;

public class Werewolf extends Character {

    private int ragePoints;

    private List<Gift> gifts;

    public Werewolf() {}

    public Werewolf(int id, String name, int gold, int health, int power, List<Armor> armor, Armor activeArmor,
                    List<Weapon> weapons, List<Weapon> activeWeapons, List<Strength> strengths, List<Weakness> weaknesses,
                    int ragePoints, List<Gift> gifts) {
        super(id, name, gold, health, power, armor, activeArmor, weapons, activeWeapons, strengths, weaknesses);
        this.ragePoints = ragePoints;
        this.gifts = gifts;
    }

    public int getRagePoints() {
        return ragePoints;
    }

    public void setRagePoints(int ragePoints) {
        this.ragePoints = ragePoints;
    }

    public List<Gift> getGifts() {
        return gifts;
    }

    public void setGifts(List<Gift> gifts) {
        this.gifts = gifts;
    }
}
