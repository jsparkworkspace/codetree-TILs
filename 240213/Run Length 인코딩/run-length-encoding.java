import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        String input = scanner.nextLine();

        // Run-Length Encoding 적용
        String encodedResult = runLengthEncoding(input);

        // 결과 출력
        System.out.println(encodedResult.length());
        System.out.println(encodedResult);
    }

    public static String runLengthEncoding(String input) {
        StringBuilder encodedStr = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                encodedStr.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        encodedStr.append(input.charAt(input.length() - 1)).append(count);

        return encodedStr.toString();
    }
}