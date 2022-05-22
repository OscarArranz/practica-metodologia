package model;

public abstract class Modifier {
    private int id;
    private String name;
    private int modifier;

    public Modifier(int id, String name, int modifier) {
        this.id = id;
        this.name = name;
        this.modifier = modifier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }
}
