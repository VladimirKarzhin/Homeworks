package Fundamentals.ObjectsandClassesLab._4_SongsPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Song> songs = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] songArgs = scanner.nextLine().split("_");
            String songType = songArgs[0];
            String name = songArgs[1];
            String time = songArgs[2];

            Song song = new Song(songType, name, time);

            songs.add(song);
        }

        String filter = scanner.nextLine();
        boolean shouldFilter = !filter.equals("all");

        for (Song song : songs) {
            if (!shouldFilter) {
                System.out.println(song.getName());
            } else if (song.getTypeList().equals(filter)) {
                System.out.println(song.getName());
            }
        }
    }
}
