import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += sc.next();
        }
        String[] arr = new String[str.length() / 5];
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ""; // null 값을 빈 값으로 초기화

            for (int j = cnt; j < str.length(); j++) { // 직전 반복 횟수를 받아 해당 문자 위치부터 반복 시작
            arr[i] += str.charAt(j); // String + char = String
            cnt++;
            if (cnt % 5 == 0) break; // 5회 반복 시 for문 종료
            }
            System.out.println(arr[i]);
        }

        System.out.print(arr.length);

        sc.close();
    }
}