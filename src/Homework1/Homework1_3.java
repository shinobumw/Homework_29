package Homework1;

public class Homework1_3 {
    public static void main(String[] args) {
        final int oneMinute = 60;
        final int oneHour = oneMinute * 60;
        final int oneDay = oneHour * 24;

        int time = 256559;
        int day = time / oneDay;
        int hour = (time - day * oneDay) / oneHour;
        int min = (time - day * oneDay - hour * oneHour) / oneMinute;
        int sec = (time - day * oneDay - hour * oneHour - min * oneMinute) % oneMinute;
        System.out.printf("256559秒為%d天、%d小時、%d分與%d秒\n", day, hour, min, sec);
    }
}
