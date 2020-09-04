package homework.radioalarm;

public class RadioAlarm implements Radio, Alarm {
    private Radio radio;
    private Alarm alarm;

    public RadioAlarm() {
        this.radio =  new RadioImpl();
        this.alarm = new AlarmClock();
    }

    @Override
    public void c() {
        alarm.c();
    }

    @Override
    public void d() {
        alarm.d();
    }

    @Override
    public void a() {
        radio.a();
    }

    @Override
    public void b() {
        radio.b();
    }

    public static void main(String[] args) {
        RadioAlarm radioAlarm = new RadioAlarm();
        radioAlarm.a();
    }
}
