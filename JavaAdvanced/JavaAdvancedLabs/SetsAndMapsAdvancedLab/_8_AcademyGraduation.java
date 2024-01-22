package JavaAdvanced.JavaAdvancedLabs.SetsAndMapsAdvancedLab;

import java.util.*;

public class _8_AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsGrades = new TreeMap<>();

        for (int i = 0; i < count; i++) {
            String studentName = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            studentsGrades.put(studentName, new ArrayList<>());

            for (double number : grades) {
                studentsGrades.get(studentName).add(number);
            }
        }

        for (Map.Entry<String, List<Double>> kvp : studentsGrades.entrySet()) {
            String studentName = kvp.getKey();
            List<Double> listWithGrades = kvp.getValue();
            System.out.printf("%s is graduated with " + getAverageGrade(listWithGrades), studentName);
            System.out.println();
        }

    }
    public static double getAverageGrade(List<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
