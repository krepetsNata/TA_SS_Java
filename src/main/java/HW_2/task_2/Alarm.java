package HW_2.task_2;

public interface Alarm {
    default String turnAlarmOn(){ return "alarm is on";}

    default String turnAlarmOff(){ return "alarm is off";}
}
