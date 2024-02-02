import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] diceNum = {1, 2, 3, 4, 5, 6};
        int[] numCnt = new int[6];

        String[] arr = br.readLine().split(" ");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < diceNum.length; j++) {
            if (Integer.parseInt(arr[i]) == diceNum[j]) {
                numCnt[j]++;
            }

            }
        }

        for (int i = 0; i < diceNum.length; i++) {
            bw.write(diceNum[i] + " - " + numCnt[i] + "\n");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}