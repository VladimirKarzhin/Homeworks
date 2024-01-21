package JavaAdvanced.JavaAdvancedLabs.StreamsFilesAndDirectioriesLab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class _6_SortLines {
    public static void main(String[] args) throws IOException {

        Path inPath = Paths.get("D:\\SoftUni\\JavaAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        Path outPath = Paths.get("D:\\SoftUni\\JavaAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\SortLines.txt");

        List<String> allLines = Files.readAllLines(inPath);
        Collections.sort(allLines);

        Files.write(outPath, allLines);

    }
}
