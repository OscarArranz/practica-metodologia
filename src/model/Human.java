package model;

public class Human extends Minion {

    private Loyalty loyalty;

    public Human(int id, String name, int health, Loyalty loyalty) {
        super(id, name, health);
        this.loyalty = loyalty;
    }

    public Loyalty getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(Loyalty loyalty) {
        this.loyalty = loyalty;
    }

}
