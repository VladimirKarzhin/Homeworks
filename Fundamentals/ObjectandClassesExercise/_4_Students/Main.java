package Fundamentals.ObjectandClassesExercise._4_Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>();

        for (int count = 1; count <= countStudents; count++) {
            String[] studentInfo = scanner.nextLine().split(" ");
            String firstName = studentInfo[0];
            String secondName = studentInfo[1];
            double grade = Double.parseDouble(studentInfo[2]);

            Student student = new Student(firstName, secondName, grade);
            studentList.add(student);

        }
        Collections.sort(studentList, Comparator.comparingDouble(Student::getGrade).reversed());

        for (Student student : studentList) {
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getSecondName(), student.getGrade());
        }
    }
}
