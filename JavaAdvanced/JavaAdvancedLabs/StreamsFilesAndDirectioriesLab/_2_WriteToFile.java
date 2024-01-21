package JavaAdvanced.JavaAdvancedLabs.StreamsFilesAndDirectioriesLab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _2_WriteToFile {
    public static void main(String[] args) throws IOException {

        String inputPath = "D:\\SoftUni\\JavaAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "D:\\SoftUni\\JavaAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\WriteToFile";
        FileInputStream fileInputStream = new FileInputStream(inputPath);
        FileOutputStream fileOutputStream = new FileOutputStream(outputPath);

        int oneByte = fileInputStream.read();
        while (oneByte >= 0) {
            char currentChar = (char) oneByte;
            if (currentChar != ',' && currentChar != '.' && currentChar != '!' && currentChar != '?') {
                fileOutputStream.write(currentChar);
            }

            oneByte = fileInputStream.read();
        }
    }
}
