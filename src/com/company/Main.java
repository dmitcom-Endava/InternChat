package com.company;

import data.HumansList;
import model.Human;
import model.Intern;
import model.Mentor;
import model.StateHuman;
import service.SenderService;
import service.ScheduleService;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HumansList.printInterns();
        Intern intern = new Intern(1, "Intern", StateHuman.AVAILIBLE);
        Mentor mentor = new Mentor(1, "Mentor", StateHuman.AVAILIBLE);

        //ScheduleService.printSchedule();
        SenderService senderService = new SenderService();

        //senderService.sendMessageByNames("Vasea", "Petea", "Hello!");
        senderService.sendMessage(intern,mentor, "Hello!");

      // sender.sendMessageByNames("Vasea", "Petea", "Hello!");
       //senderService.stopMessageThread();
      // senderService.stopStatusThread();
       //ScheduleService.printSchedule();
    }
}
