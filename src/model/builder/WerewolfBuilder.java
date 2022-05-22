package model.builder;

import model.Gift;
import model.Werewolf;

import java.util.List;

public class WerewolfBuilder extends CharacterBuilder {

    public WerewolfBuilder() {
        this.character = new Werewolf();
    }

    @Override
    public void reset() {
        this.character = new Werewolf();
    }

    public void setRagePoints(int ragePoints) {
        ((Werewolf) this.character).setRagePoints(ragePoints);
    }

    public void setGifts(List<Gift> gifts) {
        ((Werewolf) this.character).setGifts(gifts);
    }

    public Werewolf build() {
        return (Werewolf) this.character;
    }

}
