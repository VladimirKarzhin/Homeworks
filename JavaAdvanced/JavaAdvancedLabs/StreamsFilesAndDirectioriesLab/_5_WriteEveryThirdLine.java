package JavaAdvanced.JavaAdvancedLabs.StreamsFilesAndDirectioriesLab;

import java.io.*;
import java.util.Scanner;

public class _5_WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String inputPath = "D:\\SoftUni\\JavaAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "D:\\SoftUni\\JavaAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\WriteEveryThirdLine.txt";

        FileInputStream inputStream = new FileInputStream(inputPath);
        FileOutputStream outputStream = new FileOutputStream(outPath);

        Scanner reader = new Scanner(inputStream);
        PrintWriter writer = new PrintWriter(outputStream);

        int count = 1;
        String line = reader.nextLine();
        while (reader.hasNextLine()) {
            if (count % 3 == 0) {
                writer.println(line);
            }
            count++;
            line = reader.nextLine();
        }
        writer.close();
        reader.close();
    }
}
