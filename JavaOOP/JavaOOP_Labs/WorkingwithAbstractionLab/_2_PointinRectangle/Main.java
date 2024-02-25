package JavaOOP.JavaOOP_Labs.WorkingwithAbstractionLab._2_PointinRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinates = readArray(scanner);

        Rectangle rectangle = new Rectangle(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);

        int count = Integer.parseInt(scanner.nextLine());

        while (count-- > 0) {
            int[] pointCoordinates = readArray(scanner);

            Point point = new Point(pointCoordinates[0], pointCoordinates[1]);

            System.out.println(rectangle.contains(point));
        }

    }
    private static int[] readArray(Scanner scanner) {
         return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
