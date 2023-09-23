package Fundamentals.DataTypesandVariablesLab;

import java.util.Scanner;

public class _4_TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"Town {town name} has population of {population} and area {area} square km.".
        String townName = scanner.nextLine();
        long population = Long.parseLong(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", townName, population, area);
    }
}
