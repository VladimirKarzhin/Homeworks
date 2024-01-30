package JavaAdvanced.JavaAdvancedExercise.StreamsFilesAndDirectioriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class _1_SumLines {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("D:\\SoftUni\\JavaAdvanced\\src\\04-Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        List<String> lines = Files.readAllLines(path);

        for (String line : lines) {
            printSumAscii(line);
        }
    }

    private static void printSumAscii(String line) {
        int sum = 0;
        for (char symbol : line.toCharArray()) {
            sum += symbol;
        }
        System.out.println(sum);
    }
}
