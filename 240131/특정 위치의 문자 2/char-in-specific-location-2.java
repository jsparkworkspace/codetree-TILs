import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        
        for (int i = 0; i < arr.length; i++) {
           if (i == 1 || i == 4 || i == 7)
           System.out.print(arr[i] + " ");
            
        }

        br.close();
    }
}