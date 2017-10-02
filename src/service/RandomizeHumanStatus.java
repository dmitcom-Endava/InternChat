package service;

import data.HumansList;
import model.Human;
import model.StateHuman;

import java.util.Random;

public class RandomizeHumanStatus implements Runnable{

    @Override
    public void run() {
        try {
            int circle=0;
            while(++circle<10) {
                Human human= HumansList.getRandomHuman();
                human.setCurrentStateHuman(getRandomHumanStatus());
               Thread.sleep(50);
            }

        } catch (InterruptedException e) {
        }
    }

    private StateHuman getRandomHumanStatus(){
        return StateHuman.values()[new Random().nextInt(StateHuman.values().length)];
    }
}
