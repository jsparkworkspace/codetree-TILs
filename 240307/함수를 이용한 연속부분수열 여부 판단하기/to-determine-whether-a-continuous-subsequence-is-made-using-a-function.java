import java.util.Scanner;

public class Main {
    public static int[] setArray(Scanner sc, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static boolean isSequence(int n, int[] arr1, int[] arr2) {
            boolean b = true;
            for (int i = 0; i < arr2.length; i++) {
                if (arr1[i + n] == arr2[i]) {
                    continue;
                } else {
                    b = false;
                    break;
                }
            }
        
        return b;
    }

    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = setArray(sc, n1);
        int[] b = setArray(sc, n2);
        String str = "No";

        for (int i = 0; i < a.length - b.length + 1; i++) {
            if (isSequence(i, a, b)) {
                str = "Yes";
                break;
            }
        }
        
        System.out.print(str);
        

        sc.close();
    }
}