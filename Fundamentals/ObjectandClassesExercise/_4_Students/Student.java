package Fundamentals.ObjectandClassesExercise._4_Students;

public class Student {
    String firstName;
    String secondName;
    double grade;

    public Student(String firstName, String secondName, double grade) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public double getGrade() {
        return grade;
    }
}
