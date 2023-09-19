package ForLoolExercise;

import java.util.Scanner;

public class _6_0scars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int numOfJudges = Integer.parseInt(scanner.nextLine());

        for (int currentJudge = 0; currentJudge < numOfJudges; currentJudge++) {
            String currentJudgeName = scanner.nextLine();
            double currentJudgePoints = Double.parseDouble(scanner.nextLine());
            points += (currentJudgeName.length() * currentJudgePoints) / 2;

            if (points > 1250.5) {
                break;
            }
        }

        if (points > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, points);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actor, 1250.5 - points);
        }



    }
}
