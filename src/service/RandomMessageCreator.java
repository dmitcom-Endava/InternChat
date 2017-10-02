package service;

import data.HumansList;
import model.Human;

import java.util.Random;

public class RandomMessageCreator implements Runnable {
    private Human humanSender, humanReceiver;
    SenderService senderService;

    public RandomMessageCreator(SenderService senderService) {
        this.senderService = senderService;
    }

    @Override
    public void run() {
        try {
            int circle=0;
            while(circle<100) {
                humanSender = HumansList.getHumans().get(3);
                humanReceiver= HumansList.getHumans().get(4);
                senderService.sendMessage(humanSender,humanReceiver,"Message nr "+circle);
                Thread.sleep(50);
                circle++;
            }

        } catch (InterruptedException e) {
        }
    }
}
