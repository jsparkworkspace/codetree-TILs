import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        // 두 번째 문자열을 문자 배열로 저장
        char[] arr = str2.toCharArray();
        
        // 두 번째 문자열의 앞 두글자를 첫 문자열의 앞 두글자로 변경
        arr[0] = str1.charAt(0);
        arr[1] = str1.charAt(1);

        // 변경된 두 번째 문자 배열을 문자열로 출력한 결과를 str2에 저장 
        str2 = String.valueOf(arr);

        System.out.print(str2);

        sc.close();
    }
}