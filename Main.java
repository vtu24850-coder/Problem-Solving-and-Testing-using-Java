import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int marks = sc.nextInt();
            students.add(new Student(name, marks));
        }

        int K = sc.nextInt();

        List<String> topKStudents = students.stream()
                .sorted(
                        Comparator.comparingInt(Student::getMarks).reversed()
                                .thenComparing(Student::getName)
                )
                .limit(K)
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println(String.join(" ", topKStudents));
    }
}
