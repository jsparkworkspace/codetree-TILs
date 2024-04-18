import java.util.Scanner;

class Product {
    String productName;
    int code;

    public Product() {
        this.productName = "codetree";
        this.code = 50;
    }

    public Product(String productName, int code) {
        this.productName = productName;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String productName = sc.next();
        int code = sc.nextInt();

        Product product1 = new Product();
        Product product2 = new Product(productName, code);

        System.out.printf("product %d is %s\n", product1.code, product1.productName);
        System.out.printf("product %d is %s", product2.code, product2.productName);

        sc.close();
    }
}