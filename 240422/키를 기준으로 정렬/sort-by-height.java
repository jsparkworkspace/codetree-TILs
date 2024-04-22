import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    String firstName;
    int height;
    int weight;

    public Student(String firstName, int height, int weight) {
        this.firstName = firstName;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            String firstName = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i] = new Student(firstName, height, weight);
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return a.height - b.height;
            }

        });

        for (int i = 0; i < n; i++) {
            System.out.printf("%s %d %d\n", students[i].firstName, students[i].height, students[i].weight);
        }

        sc.close();
    }
}