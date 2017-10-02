package model;

import java.time.LocalDateTime;

public class SchedulePoint {
    private Human human;
    private StateHuman stateHuman;
    private LocalDateTime startTimeStatus;
    private LocalDateTime endTimeStatus;

    private SchedulePoint() {
    }

    public SchedulePoint(Human human, StateHuman stateHuman, LocalDateTime startTimeStatus, LocalDateTime endTimeStatus) {
        this.human = human;
        this.stateHuman = stateHuman;
        this.startTimeStatus = startTimeStatus;
        this.endTimeStatus = endTimeStatus;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Intern human) {
        this.human = human;
    }

    public StateHuman getStateHuman() {
        return stateHuman;
    }

    public void setStateHuman(StateHuman stateHuman) {
        this.stateHuman = stateHuman;
    }

    public LocalDateTime getStartTimeStatus() {
        return startTimeStatus;
    }

    public void setStartTimeStatus(LocalDateTime startTimeStatus) {
        this.startTimeStatus = startTimeStatus;
    }

    public LocalDateTime getEndTimeStatus() {
        return endTimeStatus;
    }

    public void setEndTimeStatus(LocalDateTime endTimeStatus) {
        this.endTimeStatus = endTimeStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SchedulePoint)) return false;

        SchedulePoint that = (SchedulePoint) o;

        if (!human.equals(that.human)) return false;
        if (stateHuman != that.stateHuman) return false;
        if (!startTimeStatus.equals(that.startTimeStatus)) return false;
        return endTimeStatus.equals(that.endTimeStatus);
    }

    @Override
    public int hashCode() {
        int result = human.hashCode();
        result = 31 * result + stateHuman.hashCode();
        result = 31 * result + startTimeStatus.hashCode();
        result = 31 * result + endTimeStatus.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "SchedulePoint{" +
                "human=" + human +
                ", stateHuman=" + stateHuman +
                ", startTimeStatus=" + startTimeStatus +
                ", endTimeStatus=" + endTimeStatus +
                '}';
    }
}
