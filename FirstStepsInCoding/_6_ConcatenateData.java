package FirstStepsInCoding;

import java.util.Scanner;

public class _6_ConcatenateData {
    public static void main(String[] args) {
        //"You are <firstName> <lastName>, a <age>-years old person from <town>."
        //Напишете програма, която прочита от конзолата име, фамилия, възраст и град и печата следното съобщение
    Scanner scanner = new Scanner(System.in);
    String firstName = scanner.nextLine();
    String lastName = scanner.nextLine();
    int age =Integer.parseInt(scanner.nextLine());
    String town = scanner.nextLine();

    System.out.print("You are " +firstName+ " " +lastName+ ", a " +age+ "-years old person from " +town+ ".");}}
