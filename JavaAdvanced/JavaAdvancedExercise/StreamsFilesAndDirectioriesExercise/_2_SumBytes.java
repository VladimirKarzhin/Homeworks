package JavaAdvanced.JavaAdvancedExercise.StreamsFilesAndDirectioriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class _2_SumBytes {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("D:\\SoftUni\\JavaAdvanced\\src\\04-Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        List<String> lines = Files.readAllLines(path);

        int sumLines = 0;

        for (String line : lines) {
            sumLines += getSumAsciiLines(line);
        }
        System.out.println(sumLines);
    }
    private static int getSumAsciiLines(String line) {
        int sum = 0;
        for (char symbol : line.toCharArray()) {
            sum += symbol;
        }
        return sum;
    }
}
