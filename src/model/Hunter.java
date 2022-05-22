package model;

import java.util.List;

public class Hunter extends Character {

    private int willPoints;

    private List<Talent> talents;

    public Hunter() {}

    public Hunter(int id, String name, int gold, int health, int power, List<Armor> armor, Armor activeArmor,
                  List<Weapon> weapons, List<Weapon> activeWeapons, List<Strength> strengths, List<Weakness> weaknesses,
                  int willPoints, List<Talent> talents) {
        super(id, name, gold, health, power, armor, activeArmor, weapons, activeWeapons, strengths, weaknesses);
        this.willPoints = willPoints;
        this.talents = talents;
    }

    public int getWillPoints() {
        return willPoints;
    }

    public void setWillPoints(int willPoints) {
        this.willPoints = willPoints;
    }

    public List<Talent> getTalents() {
        return talents;
    }

    public void setTalents(List<Talent> talents) {
        this.talents = talents;
    }

}
