package model;

public class Demon extends DemonOwnableMinion {

    private DemonOwnerAgreement agreement;

    public Demon(int id, String name, int health, DemonOwnerAgreement agreement) {
        super(id, name, health);
        this.agreement = agreement;
    }

    public DemonOwnerAgreement getAgreement() {
        return agreement;
    }

    public void setAgreement(DemonOwnerAgreement agreement) {
        this.agreement = agreement;
    }

}
