package assignment7;

import java.util.Locale;
import java.util.Scanner;

public class DetermineDuplicateWord {

    public static void duplicateWord(String str) {
        //int count = 0;
        str = str.toLowerCase();
        String[] words = str.split(" ");
        System.out.println("The duplicate words in a string are: ");
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (count > 0 && words[i] != "0") {
                System.out.print(words[i] + " ");
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String str = input.nextLine();
        duplicateWord(str);
    }
}

