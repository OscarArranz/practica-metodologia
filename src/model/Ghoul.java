package model;

public class Ghoul extends DemonOwnableMinion {

    private int dependence;

    public Ghoul(int id, String name, int health, int dependence) {
        super(id, name, health);
        this.dependence = dependence;
    }

    public int getDependence() {
        return dependence;
    }

    public void setDependence(int dependence) {
        this.dependence = dependence;
    }

}
