package MidExam;
import java.util.Scanner;

public class _1_Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double days = Double.parseDouble(scanner.nextLine());
        double numberOfPlayers = Double.parseDouble(scanner.nextLine());
        double groupsEnergy = Double.parseDouble(scanner.nextLine());
        double waterPerDayForOnePerson = Double.parseDouble(scanner.nextLine());
        double foodPerDayForOnePerson = Double.parseDouble(scanner.nextLine());

        double totalWater = days * numberOfPlayers * waterPerDayForOnePerson;
        double totalFood = days * numberOfPlayers * foodPerDayForOnePerson;
        boolean notEnought = false;

        for (int day = 1; day <= days; day++) {
            double givenMinusEnergy = Double.parseDouble(scanner.nextLine());
            groupsEnergy -= givenMinusEnergy;

            if (day % 2 == 0) {
                if (totalWater - totalWater * 0.3 > 0) {
                    groupsEnergy *= 1.05;
                    totalWater -= totalWater * 0.3;
                }
            }

            if (day % 3 == 0) {
                totalFood /= numberOfPlayers;
                if (totalFood > 0) {
                    groupsEnergy *= 1.30;
                }
            }
            if (groupsEnergy <=0) {
                notEnought = true;
                break;
            }
        }

        if (notEnought) {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", groupsEnergy);
        } else {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood, totalWater);
        }
    }
}
