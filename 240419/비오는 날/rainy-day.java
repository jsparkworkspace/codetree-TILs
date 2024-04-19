import java.util.Scanner;

class Compute {
    String date;
    String dow;
    String weather;

    public Compute(String date, String dow, String weather) {
        this.date = date;
        this.dow = dow;
        this.weather = weather;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        Compute[] computeList = new Compute[n];

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String dow = sc.next();
            String weather = sc.next();
            computeList[i] = new Compute(date, dow, weather);
        }

        
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(computeList[i].weather.equals("Rain")) {
                index = i;
                break;
            }

        }

        int lowIdx = index;
        for (int i = index + 1; i < n; i++) {
            if(computeList[i].weather.equals("Rain")) {
                if (computeList[i].date.compareTo(computeList[lowIdx].date) < 0) {
                    lowIdx = i;
                }
            }
        }

        System.out.printf("%s %s %s", computeList[lowIdx].date, computeList[lowIdx].dow, computeList[lowIdx].weather);

        sc.close();
    }
}