import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());
            String[] tmp = br.readLine().split(" ");
            int[] arr = new int[tmp.length];

            for (int i = 0; i < tmp.length; i++) {
                arr[i] = Integer.parseInt(tmp[i]);
            }

            int max = 0;
            int index = arr.length;
            int cursor = 0;
            while (index != 0) {
                max = 0;
                for (int j = 0; j < index; j++) {
                    if (max < arr[j]) {
                        max = arr[j];
                        cursor = j;
                    } else if (max >= arr[j]) {
                        continue;
                    }
                }
                System.out.printf("%d ", cursor + 1);
                index = cursor;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}