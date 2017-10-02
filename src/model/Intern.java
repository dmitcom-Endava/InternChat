package model;

public class Intern  extends Human {
    public Intern(int id, String name) {
        super(id, name);
        this.currentStateHuman = StateHuman.AVAILIBLE;
    }

    public Intern(int id, String name, StateHuman stateIntern) {
        super(id, name);
        this.currentStateHuman = stateIntern;
    }

}
