package Fundamentals.ObjectsandClassesLab._6_Students_2_0_Package;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }

            String[] studentArgs = line.split(" ");
            String firstName = studentArgs[0];
            String lastName = studentArgs[1];
            int age = Integer.parseInt(studentArgs[2]);
            String hometown = studentArgs[3];

            Student student = findStudent(students, firstName, lastName);
            if (student != null) {
                student.setAge(age);
                student.setHometown(hometown);
            } else {
                students.add(new Student(firstName, lastName, age, hometown));
            }

        }

        String filterCity = scanner.nextLine();

        for (Student student : students) {
            if (student.getHometown().equals(filterCity)) {
                System.out.println(student.getDetails());
            }
        }
    }

    public static Student findStudent(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }
}
