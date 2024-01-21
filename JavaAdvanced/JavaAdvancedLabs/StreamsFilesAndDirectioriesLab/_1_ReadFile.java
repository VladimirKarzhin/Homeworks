package JavaAdvanced.JavaAdvancedLabs.StreamsFilesAndDirectioriesLab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _1_ReadFile {
    public static void main(String[] args) throws IOException {

        String inputPath = "D:\\SoftUni\\JavaAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "D:\\SoftUni\\JavaAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\ReadLineOutput.txt";
        FileInputStream fileInputStream = new FileInputStream(inputPath);
        FileOutputStream fileOutputStream = new FileOutputStream(outputPath);


        int oneByte = fileInputStream.read();

        while (oneByte >= 0) {
            char currentChar = (char) oneByte;
            Integer binaryChar = Integer.valueOf(Integer.toBinaryString(currentChar));
            fileOutputStream.write((binaryChar + " ").getBytes());

            oneByte = fileInputStream.read();
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
