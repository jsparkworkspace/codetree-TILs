import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int height;
    int weight;
    int index;

    public Student(int height, int weight, int index) {
        this.height = height;
        this.weight = weight;
        this.index = index;
    }

    @Override
    public int compareTo(Student student) {
        if (this.height != student.height) return this.height - student.height;
        return student.weight - this.weight;
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

        Arrays.sort(students);

        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d\n", students[i].height, students[i].weight, students[i].index);
        }

        sc.close();
    }
}