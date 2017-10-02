package service;

import data.HumansList;
import data.Schedule;
import model.Human;
import model.Intern;
import model.SchedulePoint;
import model.StateHuman;

import java.time.LocalDateTime;
import java.util.List;

public class ScheduleService implements ScheduleCheckable {
    List schedule = Schedule.getSchedulePointsList();
    public ScheduleService() {
    }

    public boolean checkSchedule (Human humanReceiver){
        for (SchedulePoint schedulePoint : Schedule.getSchedulePointsList()) {
            if (schedulePoint.getHuman().equals(humanReceiver) &&
                    LocalDateTime.now().isBefore(schedulePoint.getEndTimeStatus())&&
                    LocalDateTime.now().isAfter(schedulePoint.getStartTimeStatus())&&
                    !schedulePoint.getStateHuman().equals(StateHuman.BUSSY)); return true;
        }
        System.out.println("Sorry, calendar says i'm Bussy");
        return false;
    }

    public boolean checkScheduleByName (String name){
        Human human= HumansList.getHumanByName(name);
        if (checkSchedule(human)) return true;
        return false;
    }

    public  static void printSchedule(){
        for (SchedulePoint schedulePoint : Schedule.getSchedulePointsList()) {
            System.out.println(schedulePoint);
        }
    }

    public  static SchedulePoint getInternSchedule (Intern internReceiver){
        for (SchedulePoint schedulePoint : Schedule.getSchedulePointsList()) {
            if (schedulePoint.getHuman().equals(internReceiver))return schedulePoint;
        }
        return null;
    }

}
