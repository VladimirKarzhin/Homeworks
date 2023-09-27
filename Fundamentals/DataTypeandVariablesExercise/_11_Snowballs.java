package Fundamentals.DataTypeandVariablesExercise;

import java.util.Scanner;

public class _11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());
        double maxsnowballValue = Double.MIN_VALUE;
        int snowballSnowBiggest = 0;
        int snowballTimeBiggest = 0;
        int snowballQualityBiggest = 0;

        for (int balls = 1; balls <= numberOfSnowballs; balls++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);

            if (snowballValue > maxsnowballValue) {
                maxsnowballValue = snowballValue;
                snowballSnowBiggest = snowballSnow;
                snowballTimeBiggest = snowballTime;
                snowballQualityBiggest = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d) ", snowballSnowBiggest, snowballTimeBiggest, maxsnowballValue, snowballQualityBiggest);
    }
}