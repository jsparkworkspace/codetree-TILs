import java.util.Scanner;

public class Main {

    public static int dayOfNum(int m, int d) {
        int[] dayOfMonth = new int[] {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 1;
        
        for (int i = 1; i < m; i++) {
            totalDays += dayOfMonth[i];
        }
        totalDays += d;

        return totalDays;

    }

    public static int dayCount(int d, String str) {
        String[] daystr = new String[] {"", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int index = 0;
        int totalNum = 0;

        for (int i = 1; i < daystr.length; i++) {
            if (daystr[i].equals(str)) {
                index = i;
                break;
            }
        }

        totalNum = d / 7;
        if (d % 7 >= index) totalNum++;

        return totalNum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String str = sc.next();

        int day1 = dayOfNum(m1, d1);
        int day2 = dayOfNum(m2, d2);

        System.out.print(dayCount(day2 - day1 + 1, str));



        sc.close();
    }
}