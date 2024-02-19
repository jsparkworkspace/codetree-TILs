import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int no = sc.nextInt();
            switch (no) {
                case 1: {
                    str = str.substring(1) + str.substring(0,1);
                    System.out.println(str);
                    break;
                }
                case 2: {
                    str = str.substring(str.length() - 1) + str.substring(0, str.length() - 1);
                    System.out.println(str);
                    break;
                }
                case 3: {
                    char[] arr = str.toCharArray();
                    for (int j = 0; j < str.length() / 2; j++) {
                        char tmp = arr[j];
                        arr[j] = arr[arr.length - (1 + j)];
                        arr[arr.length - (1 + j)] = tmp;
                    }
                    str = String.valueOf(arr);
                    System.out.println(str);
                    break;
                }
                default: {
                    break;
                }
            }
        }

        sc.close();
    }
}