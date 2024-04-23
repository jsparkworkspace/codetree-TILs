import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    int height;
    int weight;
    int num;

    public Student(int height, int weight, int num) {
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i] = new Student(height, weight, i + 1);
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if (a.height != b.height) return b.height - a.height;
                if (a.weight != b.weight) return b.weight - a.weight;
                return a.num - b.num;
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d\n", students[i].height, students[i].weight, students[i].num);
        }

        sc.close();
    }
}