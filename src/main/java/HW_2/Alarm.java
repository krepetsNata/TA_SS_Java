package HW_2;

public interface Alarm {
    default String turnAlarmOn(String brand) {
        return "alarm is on on " + brand;
    }

    default String turnAlarmOff(String brand) {
        return "alarm is off on " + brand;
    }
}
