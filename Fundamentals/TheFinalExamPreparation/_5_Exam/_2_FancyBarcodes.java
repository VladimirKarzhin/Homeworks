package TheFinalExamPreparation._5_Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _2_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        String regex = "@#+(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < count; i++) {
            String currentBarcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(currentBarcode);;

            if (matcher.find()) {
                String barcode = matcher.group("barcode");
                String concatenatedNumbers = "";
                for (int j = 0; j < barcode.length(); j++) {
                    boolean isDigit = Character.isDigit(barcode.charAt(j));
                    if (isDigit) {
                        concatenatedNumbers += String.valueOf(barcode.charAt(j));
                    }
                }

                if (concatenatedNumbers.equals("")) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.printf("Product group: %s%n", concatenatedNumbers);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
