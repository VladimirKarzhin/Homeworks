package Fundamentals.AssociativeArraysExercise;

import java.util.*;

public class _5_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line =  scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!line.equals("end")) {
            String[] commandParts = line.split(" : ");
            String courseName = commandParts[0];
            String studentName = commandParts[1];

            if (courses.containsKey(courseName)) {
                List<String> currentStudents = courses.get(courseName);
                currentStudents.add(studentName);
            } else {
                courses.put(courseName, new ArrayList<>());
                courses.get(courseName).add(studentName);
            }
            line = scanner.nextLine();
        }
        courses.entrySet().forEach(entry -> {
            //как да вземем числото колко човека има записани в дадения курс: entry.getValue().size();
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            //entry.getValue().forEach(student -> System.out.println("-- " + student));
            for (String student : entry.getValue()) {
                System.out.println("-- " + student);
            }
        });


    }
}
