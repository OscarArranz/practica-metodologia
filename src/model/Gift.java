package model;

public class Gift extends SpecialAbility {

    private int minRagePoints;

    public Gift(int id, String name, int attackValue, int defenseValue, int minRagePoints) {
        super(id, name, attackValue, defenseValue);
        this.minRagePoints = minRagePoints;
    }

    public int getMinRagePoints() {
        return minRagePoints;
    }

    public void setMinRagePoints(int minRagePoints) {
        this.minRagePoints = minRagePoints;
    }

}
