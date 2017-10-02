package service;

import model.Human;
import model.Intern;

public interface ScheduleCheckable {
    boolean checkSchedule(Human human);
    boolean checkScheduleByName (String name);

}
