public class Clock {
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;
    
    Clock() {
        this.hour = 0;
        this.minute = 0;
    }
    
    Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    
    void setClock() {
        this.hour = 0;
        this.minute = 0;
    }
    
    void setClock(int newHour, int newMinute) {
        this.hour = newHour;
        this.minute = newMinute;
    }
    
    void setAlarm(int alarmHour, int alarmMinute) {
        this.alarmHour = alarmHour;
        this.alarmMinute = alarmMinute;
    }
    
    void displayTime() {
        System.out.println((this.hour < 10 ? "0" : "") + this.hour + ":" + (this.minute < 10 ? "0" : "") + this.minute);
    }
    
    void addOneMinute() {
        this.minute++;
        if (this.minute == 60) {
            this.minute = 0;
            this.hour++;
            if (this.hour == 24) this.hour = 0;
        }
        
        if (this.hour == this.alarmHour && this.minute == this.alarmMinute) this.runAlarm();
    }
    
    void runAlarm() {
        System.out.println("beep-beep-beep-beep !!");
    }
    
    static void main(String[] args) {
        Clock clock = new Clock(12, 47);
        clock.displayTime();
        clock.setClock(18, 14);
        clock.displayTime();
        clock.setClock(9, 3);
        clock.displayTime();
        clock.setClock(23, 58);
        clock.displayTime();
        clock.addOneMinute();
        clock.displayTime();
        clock.addOneMinute();
        clock.displayTime();
    }
}