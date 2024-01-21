package JavaAdvanced.JavaAdvancedLabs.StreamsFilesAndDirectioriesLab;

import java.io.File;
import java.io.IOException;

public class _7_ListFiles {
    public static void main(String[] args) throws IOException {

        File folder = new File("D:\\SoftUni\\JavaAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        if (folder.exists()) {
            if (folder.isDirectory()) {
                File[] allFiles = folder.listFiles();
                for (File file: allFiles) {
                    if (!file.isDirectory()) {
                        System.out.printf("%s: [%d]%n", file.getName(), file.length());
                    }
                }
            }
        }
    }
}
