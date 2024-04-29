import java.util.Scanner;

public class Main {

    public static int days(int month, int day) {
        int[] monthOfDays = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;

        for (int i = 1; i < month; i++) {
            totalDays += monthOfDays[i];
        }
        totalDays += day;

        return totalDays;
    }

    public static String printDay(int dayNum) {
        String[] arr = new String[] {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        if (dayNum == 0) {
            return arr[dayNum];
        } else if (dayNum < 0) {
            dayNum = 7 - (dayNum * -1) % 7;
            return arr[1 + dayNum];
        } else {
            dayNum %= 7;
            return arr[1 + dayNum];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int dayNum = days(m2, d2) - days(m1, d1);
        System.out.println((printDay(dayNum)));
        

        sc.close();
    }
}