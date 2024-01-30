package JavaAdvanced.JavaAdvancedExercise.StreamsFilesAndDirectioriesExercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _4_CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("D:\\SoftUni\\JavaAdvanced\\src\\04-Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        List<String> lines = Files.readAllLines(path);

        Map<String, Integer> symbols = new HashMap<>();
        symbols.put("vowels", 0);
        symbols.put("consonants", 0);
        symbols.put("punctuations", 0);

        for (String line : lines) {
            for (char symbol : line.toCharArray()) {
                if (symbol == ' ') {
                    continue;
                }
                if (isVowel(symbol)) {
                    symbols.put("vowels", symbols.get("vowels") + 1);
                } else if (isPunctional(symbol)) {
                    symbols.put("punctuations", symbols.get("punctuations") + 1);
                } else {
                    symbols.put("consonants", symbols.get("consonants") + 1);
                }
            }
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("output_task_4.txt"));
        writer.write("Vowels: " + symbols.get("vowels"));
        writer.newLine();
        writer.write("Other symbols: " + symbols.get("consonants"));
        writer.newLine();
        writer.write("Punctuation: " + symbols.get("punctuations"));
        writer.newLine();

        writer.close();
    }

    private static boolean isPunctional(char symbol) {

        return symbol == '!' || symbol == ',' || symbol == '.' || symbol == '?';
    }
    private static boolean isVowel(char symbol) {

        return symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u';
    }
}
