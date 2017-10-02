package service;

import data.HumansList;
import model.*;

import java.util.Random;

public class SenderService{

    private Human humanSender, humanReceiver;
    private ScheduleService scheduleService=new ScheduleService();
    Thread messageThread, statusThread;

    public SenderService() {
        /*
        messageThread = new Thread (new RandomMessageCreator(this), "RandomMessageCreator");
        messageThread.start();
        statusThread = new Thread (new RandomizeHumanStatus(), "RandomizeHumanStatus");
        statusThread.start();
        */
    }
    public  static void createHuman(String name){
        HumansList.addNewHuman(name);
    }

    public void sendMessageByNames(String humanSenderName, String humanReceiverName, String message) {
        humanSender = HumansList.getHumanByName(humanSenderName);
        humanReceiver = HumansList.getHumanByName(humanReceiverName);
        if (isHumanReadyToMessage(humanReceiver) && !humanSender.equals(humanReceiver))
            new Sender().sendMessage(new Message(humanSender, humanReceiver, message, StateMessage.DELIVERED));
        else {
            System.out.println(
                    "Something wrong! Try again..." + humanReceiver.getCurrentStateHuman().getPeriod() * 1000 + " seconds");

        }
    }

    public void sendMessage(Human messageSender, Human messageReceiver, String message){
        if (isHumanReadyToMessage(messageReceiver) && !messageSender.equals(humanReceiver))
            new Sender().sendMessage(new Message(messageSender, messageReceiver,message, StateMessage.DELIVERED) );
        else{
            new Sender().sendMessage(new Message(messageSender, messageReceiver,message, StateMessage.UNDELIVERED));
            System.out.println(
                    "Something wrong! Try again..."+messageSender.getCurrentStateHuman().getPeriod()*1000+" seconds");
        }
    }

    private boolean isHumanReadyToMessage(Human human){
        if (human.getCurrentStateHuman().equals(StateHuman.AVAILIBLE)) {
            System.out.println(human.getName()+" is ready");
            return true;
        }
        System.out.println(human.getName()+" is NOT ready");
        return false;
    }


    public void stopMessageThread(){
        try {
            messageThread.join();
            messageThread.interrupt();
        } catch (Exception e) {
        }
    }


    public void stopStatusThread(){
        try {
            statusThread.join();
            statusThread.interrupt();
        } catch (Exception e) {
        }
    }
/*
    public void stopInternThreads(){
        HumansList.allThreadStop();
    }

    public void stopInternThreads(){
        HumansList.allThreadStop();
    }

    public void startInternThreads(){
        HumansList.allTreadStart();
    }

    public void run() {
        try {
            int circle=0;
            while(circle<100) {
                humanSender = HumansList.getRandomHuman();
                humanReceiver= HumansList.getRandomHuman();
                sendMessageByNames(humanSender.getName(),humanReceiver.getName(),"Message nr "+circle);
                thread.sleep(40*(new Random().nextInt(20)));
                circle++;
            }

        } catch (InterruptedException e) {
        }
    }

    public void startMessageThread(){
        try {
            thread.start();
        } catch (Exception e) {
        }
    }

    public void stopMessageThread(){
        try {
            thread.join();
            thread.interrupt();
        } catch (Exception e) {
        }
    }
    */


}
