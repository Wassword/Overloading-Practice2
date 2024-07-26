package org.example.tvshow;

import org.example.tvshow.TvShow;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TvShow> tvShows = new ArrayList<>();

        // Using overloaded constructors
        tvShows.add(new TvShow("Breaking Bad", 62, "Drama"));
        tvShows.add(new TvShow("Friends", 236));
        tvShows.add(new TvShow());

        System.out.println("Names of tv shows:");
        System.out.print("Entering nothing with stop the loop ");

        while (true) {
            System.out.print("Enter the name of the tv show: ");
            String showName = sc.nextLine();
            if (showName.equals("stop")) {
                break;
            }

            System.out.print("Enter the number of the episodes: ");
            int episodes = Integer.parseInt(sc.nextLine());

            System.out.print("Enter the Genre: ");
            String genre = sc.nextLine();

            tvShows.add(new TvShow(showName, episodes, genre));

            // Print each TvShow object using the overridden toString method
            for (TvShow show : tvShows) {
                System.out.println(show);
            }

            sc.close();
        }
    }
}

