package model;

import java.util.List;

public class Vampire extends Character {

    private int bloodPoints;
    private int age;

    private List<Discipline> disciplines;

    public Vampire() {}

    public Vampire(int id, String name, int gold, int health, int power, List<Armor> armor, Armor activeArmor,
                   List<Weapon> weapons, List<Weapon> activeWeapons, List<Strength> strengths, List<Weakness> weaknesses,
                   int bloodPoints, int age, List<Discipline> disciplines) {
        super(id, name, gold, health, power, armor, activeArmor, weapons, activeWeapons, strengths, weaknesses);
        this.bloodPoints = bloodPoints;
        this.age = age;
        this.disciplines = disciplines;
    }

    public int getBloodPoints() {
        return bloodPoints;
    }

    public void setBloodPoints(int bloodPoints) {
        this.bloodPoints = bloodPoints;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }
}
