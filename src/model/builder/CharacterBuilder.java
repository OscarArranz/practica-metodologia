package model.builder;

import model.*;
import model.Character;

import java.util.List;

public abstract class CharacterBuilder {

    protected Character character;

    protected CharacterBuilder() {}

    abstract public void reset();

    public void setId(int id) {
        this.character.setId(id);
    }

    public void setName(String name) {
        this.character.setName(name);
    }

    public void setGold(int gold) {
        this.character.setGold(gold);
    }

    public void setHealth(int health) {
        this.character.setHealth(health);
    }

    public void setPower(int power) {
        this.character.setPower(power);
    }

    public void setActiveArmor(Armor armor) {
        this.character.setActiveArmor(armor);
    }

    public void setArmor(List<Armor> armor) {
        this.character.setArmor(armor);
    }

    public void setActiveWeapons(List<Weapon> weapons) {
        this.character.setActiveWeapons(weapons);
    }

    public void setWeapons(List<Weapon> weapons) {
        this.character.setWeapons(weapons);
    }

    public void setStrengths(List<Strength> strengths) {
        this.character.setStrengths(strengths);
    }

    public void setWeaknesses(List<Weakness> weaknesses) {
        this.character.setWeaknesses(weaknesses);
    }

}
