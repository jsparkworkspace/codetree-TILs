import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Y = scanner.nextInt();
        int M = scanner.nextInt();
        int D = scanner.nextInt();
        
        int season = getSeason(Y, M, D);
        
        if (season == -1) {
            System.out.println(-1);
        } else {
            switch (season) {
                case 0:
                    System.out.println("Spring");
                    break;
                case 1:
                    System.out.println("Summer");
                    break;
                case 2:
                    System.out.println("Fall");
                    break;
                case 3:
                    System.out.println("Winter");
                    break;
            }
        }
        
        scanner.close();
    }
    
    public static int getSeason(int Y, int M, int D) {
        if (!isValidDate(Y, M, D)) {
            return -1; // Invalid date
        }
        
        if (M >= 3 && M <= 5) {
            return 0; // Spring
        } else if (M >= 6 && M <= 8) {
            return 1; // Summer
        } else if (M >= 9 && M <= 11) {
            return 2; // Fall
        } else if (M == 12 || M <= 2) {
            return 3; // Winter
        } else {
            return -1; // Invalid month
        }
    }
    
    public static boolean isValidDate(int Y, int M, int D) {
        if (M < 1 || M > 12 || D < 1 || D > 31) {
            return false; // Invalid month or day
        }
        
        if (M == 2) {
            if (isLeapYear(Y)) {
                return D <= 29;
            } else {
                return D <= 28;
            }
        } else if (M == 4 || M == 6 || M == 9 || M == 11) {
            return D <= 30;
        } else {
            return true; // Other months have 31 days
        }
    }
    
    public static boolean isLeapYear(int Y) {
        return (Y % 4 == 0 && Y % 100 != 0) || (Y % 400 == 0);
    }
}