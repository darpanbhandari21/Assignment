package assignment7;

import java.util.Scanner;

public class TrimNames {

    public static void trimName(String str) {
        //Alternative Way
        /*name = " " + name;
        int pos = name.lastIndexOf(' ');
        for (int i = 0; i < pos; i++) {
            if (name.charAt(i) == ' ') {
                System.out.print(name.charAt(i + 1) + ". ");
            }
        }
        System.out.println(name.substring(pos));*/
        int len = str.length();

        // to remove any leading or trailing spaces
        str = str.trim();

        // to store extracted words
        String t = "";
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {

                // forming the word
                t = t + ch;
            }

            // when space is encountered and thereby extracted
            else {
                // printing the first letter of the name in capital letters
                System.out.print(Character.toUpperCase(t.charAt(0))
                        + ". ");
                t = "";
            }
        }

        String temp = "";

        // for the surname, we have to print the entire surname and not just the initial string "t" has the surname now
        for (int j = 0; j < t.length(); j++) {

            // first letter of surname in capital letter
            if (j == 0)
                temp = temp + Character.toUpperCase(t.charAt(0));

                // rest of the letters in small
            else
                temp = temp + Character.toLowerCase(t.charAt(j));
        }

        // printing surname
        System.out.println(temp);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String name = input.nextLine();
        trimName(name);
    }
}
