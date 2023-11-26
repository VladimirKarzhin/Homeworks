package TheFinalExamPreparation._4_Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _2_DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String placesOnMap = scanner.nextLine();
        String regex = "(\\=|\\/)(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(placesOnMap);

        List<String> travelOutput = new ArrayList<>();

        int travelPoints = 0;
        while (matcher.find()) {
            String destination = matcher.group("destination");
            travelOutput.add(destination);
            travelPoints += destination.length();
        }
        System.out.print("Destinations: ");
        System.out.print(String.join(", ", travelOutput));
        System.out.println();
        System.out.printf("Travel Points: %d", travelPoints);
    }
}
