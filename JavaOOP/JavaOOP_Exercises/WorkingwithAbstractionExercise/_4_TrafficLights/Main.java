package JavaOOP.JavaOOP_Exercises.WorkingwithAbstractionExercise._4_TrafficLights;

import java.util.Arrays;
import java.util.Scanner;

import static JavaOOP.JavaOOP_Exercises.WorkingwithAbstractionExercise._4_TrafficLights.Color.printSignal;
import static JavaOOP.JavaOOP_Exercises.WorkingwithAbstractionExercise._4_TrafficLights.Color.updateColor;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Color[] colors = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Color::valueOf)
                .toArray(Color[]::new);

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            updateColor(colors);

            printSignal(colors);
        }
    }
}
