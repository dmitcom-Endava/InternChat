package model;

public class Mentor extends Human{
    public Mentor(int id, String name) {
        super(id, name);
        this.currentStateHuman = StateHuman.AVAILIBLE;
    }

    public Mentor(int id, String name, StateHuman stateMentor) {
        super(id, name);
        this.currentStateHuman =stateMentor;
    }
}
