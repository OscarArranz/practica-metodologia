package model.builder;

import model.Discipline;
import model.Vampire;

import java.util.List;

public class VampireBuilder extends CharacterBuilder {

    public VampireBuilder() {
        this.character = new Vampire();
    }

    @Override
    public void reset() {
        this.character = new Vampire();
    }

    public void setBloodPoints(int bloodPoints) {
        ((Vampire) this.character).setBloodPoints(bloodPoints);
    }

    public void setAge(int age) {
        ((Vampire) this.character).setAge(age);
    }

    public void setDisciplines(List<Discipline> disciplines) {
        ((Vampire) this.character).setDisciplines(disciplines);
    }

    public Vampire build() {
        return (Vampire) this.character;
    }

}
