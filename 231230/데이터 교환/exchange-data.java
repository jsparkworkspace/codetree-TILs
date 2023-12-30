public class Main {
    public static void main(String[] args) {
        int a, b, c;
        a = 5;
        b = 6;
        c = 7;

        int temp = b;
        int temp2 = c;
        b = a;
        c = temp;
        a = temp2;

        System.out.printf("%d\n%d\n%d",a, b, c);
    }
}