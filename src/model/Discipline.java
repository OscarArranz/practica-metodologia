package model;

public class Discipline extends SpecialAbility {

    private int bloodPointCost;

    public Discipline(int id, String name, int attackValue, int defenseValue, int bloodPointCost) {
        super(id, name, attackValue, defenseValue);
        this.bloodPointCost = bloodPointCost;
    }

    public int getBloodPointCost() {
        return bloodPointCost;
    }

    public void setBloodPointCost(int bloodPointCost) {
        this.bloodPointCost = bloodPointCost;
    }

}
