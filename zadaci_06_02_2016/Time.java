package zadaci_06_02_2016;

/*
 * Zadatak1
 * Time class
 */

public class Time {

    public long hour;
    public long minute;
    public long second;
    // default no-arg constructor
    public Time() {
        long totalSeconds = System.currentTimeMillis() / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        this.hour = totalHours % 24;
        this.minute = totalMinutes % 60;
        this.second = totalSeconds % 60;

    }
    // constructor that constructs time with specified hours, mins and seconds
    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    // a constructor with elapsed time
    public Time(long elapseTime) {
        long totalSeconds = elapseTime / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        this.hour = totalHours % 24;
        this.minute = totalMinutes % 60;
        this.second = totalSeconds % 60;

    }

    // next lines are getters for h, m and s
    public long getHour() {
        return hour;
    }


    public long getMinute() {
        return minute;
    }


    public long getSecond() {
        return second;
    }

}
