package JavaAdvanced.JavaAdvancedLabs.SetsAndMapsAdvancedLab;

import java.util.*;

public class _5_AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsGrades = new TreeMap<>();

        for (int i = 0; i < count; i++) {
            String line = scanner.nextLine();
            String[] commandParts = line.split("\\s+");
            String studentName = commandParts[0];
            double grade = Double.parseDouble(commandParts[1]);

            if (!studentsGrades.containsKey(studentName)) {
                studentsGrades.put(studentName, new ArrayList<>());
                studentsGrades.get(studentName).add(grade);
            } else {
                List<Double> currentList = studentsGrades.get(studentName);
                currentList.add(grade);
            }
        }

        for (Map.Entry<String, List<Double>> kvp : studentsGrades.entrySet()) {
            String studentName = kvp.getKey();
            List<Double> average = kvp.getValue();
            System.out.printf("%s -> ", studentName);
            for (Double grade : average) {
                System.out.printf("%.2f ", grade);
            }
            System.out.printf("(avg: %.2f)", getAverageGrade(average));
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
