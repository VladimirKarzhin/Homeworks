package Fundamentals.ObjectandClassesExercise._1_AdvertisementMessage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Message message =  new Message();
        int countOfMessages = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < countOfMessages; row++) {
            String output =  message.randomMessage();
            System.out.println(output);
        }
    }
}
