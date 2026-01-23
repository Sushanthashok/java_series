package Suskkoo;
class Time {
    int hours, minutes, seconds;

    Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    void display() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time t1 = new Time(9, 5, 3);
        t1.display();   // Output: 09:05:03
    }
}
