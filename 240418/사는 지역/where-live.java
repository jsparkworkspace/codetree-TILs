import java.util.Scanner;

class Address {
    String name;
    String addr;
    String region;

    public Address(String name, String addr, String region) {
        this.name = name;
        this.addr = addr;
        this.region = region;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Address[] addressList = new Address[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String addr = sc.next();
            String region = sc.next();
            addressList[i] = new Address(name, addr, region);
        }

        int min_val = 0;

        for(int i = 1; i < n; i++){
            if (addressList[i].name.compareTo(addressList[min_val].name) > 0){
                min_val = i;
            }
        }

        System.out.printf("name %s\n", addressList[min_val].name);
        System.out.printf("addr %s\n", addressList[min_val].addr);
        System.out.printf("city %s", addressList[min_val].region);


        sc.close();
    }
}