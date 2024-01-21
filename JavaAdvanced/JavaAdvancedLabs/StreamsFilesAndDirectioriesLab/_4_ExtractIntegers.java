package JavaAdvanced.JavaAdvancedLabs.StreamsFilesAndDirectioriesLab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _4_ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {

        String inputPath = "D:\\SoftUni\\JavaAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(inputPath);
        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println(number);
            }
            scanner.next();
        }
    }
}

