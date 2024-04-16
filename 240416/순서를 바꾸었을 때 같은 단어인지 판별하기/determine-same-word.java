import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr1 = sc.next().toCharArray();
        char[] arr2 = sc.next().toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String str1 = "";
        String str2 = "";

        for (char c : arr1) {
            str1 += (c + "");
        }

        for (char c : arr2) {
            str2 += (c + "");
        }

        if (str1.equals(str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}