package assignment5;

import java.util.Scanner;

public class DisplayHighest {

    public void chooseHighest() {
        Scanner value = new Scanner(System.in);
        int highest = 0;
        String highestScorer = "";

        System.out.println("Enter the number of students: ");
        int num = value.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print("\nStudent " + i + ":\n");
            System.out.print("Name: ");

            String name = value.next();

            System.out.print("Score: ");

            int score = value.nextInt();

            if (score >= highest) {
                highest = score;
                highestScorer = name;
            }
        }
        System.out.println("\nThe highest scorer is: " + highestScorer);
    }

    public static void main(String[] args) {
        DisplayHighest ob = new DisplayHighest();
        ob.chooseHighest();
    }
}
