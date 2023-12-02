package TheFinalExamPreparation._5_Exam;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _3_HeroesofCodeandLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> heroHitPoints = new LinkedHashMap<>();
        Map<String, Integer> heroManaPoints = new LinkedHashMap<>();

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String line = scanner.nextLine();
            String[] commandParts = line.split(" ");
            String heroName = commandParts[0];
            int hitPoints = Integer.parseInt(commandParts[1]);
            int manaPoints = Integer.parseInt(commandParts[2]);

            heroHitPoints.put(heroName, hitPoints);
            heroManaPoints.put(heroName, manaPoints);
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandParts = command.split(" - ");
            String commandName = commandParts[0];
            String heroName = commandParts[1];

            switch (commandName) {
                case "CastSpell":
                    int manaPointsNeeded = Integer.parseInt(commandParts[2]);
                    String spellName = commandParts[3];

                    int heroManaPoint = heroManaPoints.get(heroName);
                    if (manaPointsNeeded <= heroManaPoint) {
                        int reducedMana = heroManaPoint - manaPointsNeeded;
                        heroManaPoints.put(heroName, reducedMana);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, reducedMana);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damageToTake = Integer.parseInt(commandParts[2]);
                    String attacker = commandParts[3];

                    int heroHitPoint = heroHitPoints.get(heroName);
                    if (heroHitPoint - damageToTake <= 0) {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroManaPoints.remove(heroName);
                        heroHitPoints.remove(heroName);
                    } else {
                        int reducedHit = heroHitPoint - damageToTake;
                        heroHitPoints.put(heroName, reducedHit);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damageToTake, attacker, reducedHit);
                    }
                    break;
                case "Recharge":
                    int amountForRecharge = Integer.parseInt(commandParts[2]);
                    int currentMP = heroManaPoints.get(heroName);
                    if (currentMP + amountForRecharge <= 200) {
                        heroManaPoints.put(heroName, currentMP + amountForRecharge);
                        System.out.printf("%s recharged for %d MP!%n", heroName, amountForRecharge);
                    } else {
                        int mp = 200 - currentMP;
                        heroManaPoints.put(heroName, currentMP + mp);
                        System.out.printf("%s recharged for %d MP!%n", heroName, mp);
                    }
                    break;
                case "Heal":
                    int amountForHeal = Integer.parseInt(commandParts[2]);
                    int currentHP = heroHitPoints.get(heroName);
                    if (currentHP + amountForHeal <= 100) {
                        heroHitPoints.put(heroName, currentHP + amountForHeal);
                        System.out.printf("%s healed for %d HP!%n", heroName, amountForHeal);
                    } else {
                        int hp = 100 - currentHP;
                        heroHitPoints.put(heroName, currentHP + hp);
                        System.out.printf("%s healed for %d HP!%n", heroName, hp);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> kvp : heroManaPoints.entrySet()) {
            String heroName = kvp.getKey();
            int manaPoints = kvp.getValue();
            int hitPoints = heroHitPoints.get(heroName);
            System.out.printf("%s%n", heroName);
            System.out.printf("  HP: %d%n", hitPoints);
            System.out.printf("  MP: %d%n", manaPoints);
        }
    }
}
