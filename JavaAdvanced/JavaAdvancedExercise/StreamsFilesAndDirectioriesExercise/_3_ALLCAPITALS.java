package JavaAdvanced.JavaAdvancedExercise.StreamsFilesAndDirectioriesExercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

public class _3_ALLCAPITALS {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("D:\\SoftUni\\JavaAdvanced\\src\\04-Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        List<String> lines = Files.readAllLines(path);

        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        for (String line : lines) {
            writer.write(line.toUpperCase());
            writer.newLine();
        }
        writer.close();
    }
}
