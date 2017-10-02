package data;

import model.Human;
import model.Intern;
import model.StateHuman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HumansList {
    public static List <Human> humans =new  ArrayList(8);

    public HumansList() {
    }

    public void addIntern(Human intern){
        humans.add(intern);
    }

    public static boolean addNewHuman(String name){
        if (findHumanByName(name)>-1){
            System.out.println("Sorry, user with the same name is already in system.");
                return false;
        }
        int id= humans.size()+1;
        humans.add(new Intern(id, name));
        return true;
    }

    public static List<Human> getHumans() {
        return humans;
    }

    public void setHumans(List interns) {
        this.humans = humans;
    }

    public boolean checkHumanById(int id){
        for (Human human : humans) {
            if (human.getId()==id) return true;
        }
        return false;
    }

    public static  int findHumanByName(String name){
        for (Human human : humans) {
            if (human.getName().equals(name)) return human.getId();
        }
        return -1;
    }

    public static Human getHumanByName(String name){
        for (Human human : humans) {
            if (human.getName().equals(name)) return human;
        }
        return null;
    }

    public static Human getRandomHuman(){
        return humans.get(new Random().nextInt(humans.size()));
    }

    public static void printInterns(){
        System.out.println("List of humans:");
        for (Human human : humans) {
            System.out.println(human);
        }

    }

    static {
        addNewHuman("Vasea");
        addNewHuman("Petea");
        addNewHuman("Anton");
        addNewHuman("Serghei");
        addNewHuman("Anna");
        addNewHuman("Irina");
        addNewHuman("Gleb");
        addNewHuman("Alina");
    }
}
