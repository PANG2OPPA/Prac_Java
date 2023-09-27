package 태초마을;

public class TT {
    public static void main(String[] args) {
        Time t = new Time();
        t.hour = 12;
        t.min = 34;
        Time.sec = 24;
        System.out.println(t.hour + "시" + t.min + "분" + t.sec + "초");
    }
}

class Time {
    int hour;
    int min;
    static int sec;

}
