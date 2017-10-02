package model;

import java.util.Random;

public abstract class Human{
    protected int id;
    protected String name;
    protected StateHuman currentStateHuman;


    protected Human() {
    }

    public Human(int id, String name) {
        this.id = id;
        this.name = name;
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

    public StateHuman getCurrentStateHuman() {
        return currentStateHuman;
    }

    public void setCurrentStateHuman(StateHuman currentStateHuman) {
        this.currentStateHuman = currentStateHuman;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;

        Human human = (Human) o;

        return id == human.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return " "+name+"("+id+") "+ currentStateHuman;
    }
}
