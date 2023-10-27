package Fundamentals.ObjectandClassesExercise._3_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        List<Person> peopleList = new ArrayList<>();

        for (int row = 1; row <= lines; row++) {
            String personalData = scanner.nextLine();
            String name = personalData.split(" ")[0];
            int age = Integer.parseInt(personalData.split(" ")[1]);

            if (age > 30) {
                Person person = new Person(name, age);
                peopleList.add(person);
            }
        }
        for (Person person : peopleList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }


    }
}