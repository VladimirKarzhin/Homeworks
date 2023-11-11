package Fundamentals.TextProcessingExercise;

import java.util.Scanner;

public class _3_ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();

        String[] partPath = path.split("\\\\");
        String fullFileName = partPath[partPath.length - 1];

        String fileName = fullFileName.split("\\.")[0];
        String fileExtension = fullFileName.split("\\.")[1];

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s%n", fileExtension);
    }
}
