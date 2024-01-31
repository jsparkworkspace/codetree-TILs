import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
    
        int odd = 0;
        int nodd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                odd += Integer.parseInt(arr[i]);
            } else {
                nodd += Integer.parseInt(arr[i]);
            }
        }
        if (odd > nodd) {
            System.out.print(odd - nodd);
        } else {
            System.out.print(nodd - odd);
        }
        

        br.close();
    }
}