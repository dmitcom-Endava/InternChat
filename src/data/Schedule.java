package data;


import model.Human;
import model.Intern;
import model.SchedulePoint;
import model.StateHuman;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Schedule {
    private static List<Human> humanList= HumansList.getHumans();
    public static List <SchedulePoint> schedulePointsList=new ArrayList<>();

    static{
        fillSchedule();
    }

    public Schedule() {
    }

    public static List <SchedulePoint> getSchedulePointsList() {
        return schedulePointsList;
    }

    public static void addSchedulePoint(Human human, StateHuman stateHuman, LocalDateTime startTimeStatus, LocalDateTime endTimeStatus) {
        schedulePointsList.add(new SchedulePoint(human, stateHuman, startTimeStatus,  endTimeStatus));
    }

    public static void fillSchedule(){
        for (Human human : humanList) {
            addSchedulePoint(human, StateHuman.BUSSY,randomizeNowMinus(),randomizeNowPlus()) ;
        }
    }

    private static LocalDateTime randomizeNowMinus(){
        return LocalDateTime.now().minusSeconds(new Random().nextInt(2));
    }
    private static LocalDateTime randomizeNowPlus(){
        return LocalDateTime.now().plusSeconds(new Random().nextInt(11));
    }

}
