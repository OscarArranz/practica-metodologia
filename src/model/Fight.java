package model;

import java.util.Date;

public class Fight {

    private int id;
    private int rounds;
    private int goldWon;
    private Date date;

    private DefaultUser defiant;
    private DefaultUser defied;
    private DefaultUser winner;

    public Fight(int id, int rounds, int goldWon, Date date, DefaultUser defiant, DefaultUser defied, DefaultUser winner) {
        this.id = id;
        this.rounds = rounds;
        this.goldWon = goldWon;
        this.date = date;
        this.defiant = defiant;
        this.defied = defied;
        this.winner = winner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getGoldWon() {
        return goldWon;
    }

    public void setGoldWon(int goldWon) {
        this.goldWon = goldWon;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public DefaultUser getDefiant() {
        return defiant;
    }

    public void setDefiant(DefaultUser defiant) {
        this.defiant = defiant;
    }

    public DefaultUser getDefied() {
        return defied;
    }

    public void setDefied(DefaultUser defied) {
        this.defied = defied;
    }

    public DefaultUser getWinner() {
        return winner;
    }

    public void setWinner(DefaultUser winner) {
        this.winner = winner;
    }

}
