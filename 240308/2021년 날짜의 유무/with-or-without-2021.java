import java.util.Scanner;

public class Main {
    
    public static String isDate(int month, int day) {
        if (month > 0 && month <= 12) {
            switch (month) {
                case 1: {
                    if (day > 0 && day <= 31) { return "Yes"; }
                    break;
                } case 2: {
                    if (day > 0 && day <= 28) { return "Yes"; }
                    break;
                } case 3: {
                    if (day > 0 && day <= 31) { return "Yes"; }
                    break;
                } case 5: {
                    if (day > 0 && day <= 31) { return "Yes"; }
                    break;
                } case 7: {
                    if (day > 0 && day <= 31) { return "Yes"; }
                    break;
                } case 8: {
                    if (day > 0 && day <= 31) { return "Yes"; }
                    break;
                } case 10: {
                    if (day > 0 && day <= 31) { return "Yes"; }
                    break;
                } case 12: {
                    if (day > 0 && day <= 31) { return "Yes"; }
                    break;
                } case 4: {
                    if (day > 0 && day <= 30) { return "Yes"; }
                    break;
                } case 6: {
                    if (day > 0 && day <= 30) { return "Yes"; }
                    break;
                } case 9: {
                    if (day > 0 && day <= 30) { return "Yes"; }
                    break;
                } case 11: {
                    if (day > 0 && day <= 30) { return "Yes"; }
                    break;
                }
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();

        System.out.print(isDate(month, day));

        sc.close();
    }
}