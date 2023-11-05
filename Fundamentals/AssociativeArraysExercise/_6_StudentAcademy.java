package Fundamentals.AssociativeArraysExercise;

import java.util.*;

public class _6_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        int countStudents = Integer.parseInt(scanner.nextLine());

        for (int student = 1; student <= countStudents; student++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (studentGrades.containsKey(studentName)) {
                List<Double> currentGrades = studentGrades.get(studentName);
                currentGrades.add(grade);
            } else {
                studentGrades.put(studentName, new ArrayList<>());
                studentGrades.get(studentName).add(grade);
            }
        }
        Map<String, Double> studentsAverageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> kvp : studentGrades.entrySet()) {
            String studentName = kvp.getKey();
            List<Double> grades = kvp.getValue();
            double average = getAverageGrade(grades);
            //double average = grades.stream().mapToDouble(a -> a).average().orElse(0.0);

            if (average >= 4.50) {
                studentsAverageGrade.put(studentName, average);
            }
        }
        studentsAverageGrade.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));

    }
    private static double getAverageGrade(List<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
