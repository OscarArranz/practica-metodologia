package model.builder;

import model.Hunter;
import model.Talent;

import java.util.List;

public class HunterBuilder extends CharacterBuilder {

    public HunterBuilder() {
        this.character = new Hunter();
    }

    @Override
    public void reset() {
        this.character = new Hunter();
    }

    public void setWillPoints(int willPoints) {
        ((Hunter) this.character).setWillPoints(willPoints);
    }

    public void setTalents(List<Talent> talents) {
        ((Hunter) this.character).setTalents(talents);
    }

    public Hunter build() {
        return (Hunter) this.character;
    }

}
