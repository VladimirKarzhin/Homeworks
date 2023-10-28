package Fundamentals.ObjectandClassesExercise._6_OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] personInfo = line.split(" ");
            String firstName = personInfo[0];
            String id = personInfo[1];
            int age = Integer.parseInt(personInfo[2]);

            Person person = new Person(firstName, id, age);
            personList.add(person);

            line =  scanner.nextLine();
        }

        personList.sort(Comparator.comparingInt(Person::getAge));

        for (Person person : personList) {
            System.out.printf("%s with ID: %s is %d years old.%n", person.getName(), person.getId(), person.getAge());
        }
    }
}
