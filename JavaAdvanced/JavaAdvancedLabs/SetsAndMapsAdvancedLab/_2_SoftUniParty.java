package JavaAdvanced.JavaAdvancedLabs.SetsAndMapsAdvancedLab;

import java.util.*;

public class _2_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            Set<String> regularMembers = new TreeSet<>();
        Set<String> VIPMembers = new TreeSet<>();

        String line = scanner.nextLine();
        while (!"PARTY".equals(line)) {
            char[] wordChars = line.toCharArray();

            if (Character.isDigit(wordChars[0])) {
                VIPMembers.add(line);
            } else {
                regularMembers.add(line);
            }

            line = scanner.nextLine();
        }

        String line2 = scanner.nextLine();
        while (!"END".equals(line2)) {

            if (VIPMembers.contains(line2)) {
                VIPMembers.remove(line2);
            } else {
                regularMembers.remove(line2);
            }

            line2 = scanner.nextLine();
        }

        System.out.println(VIPMembers.size() + regularMembers.size());
        for (String VIPMember : VIPMembers) {
            System.out.println(VIPMember);
        }
        for (String regularMember : regularMembers) {
            System.out.println(regularMember);
        }
    }
}
