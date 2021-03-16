package assignment7;

import java.util.Scanner;

public class DetermineDuplicateChar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        char[] carry = str.toCharArray();
        System.out.println("The original string is: " + str);
        System.out.print("The duplicate characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i + 1; j < str.length(); j++) {
                if (carry[i] == carry[j] && carry[i] != ' ') {
                    count++;
                    carry[j] = '0';
                }
            }
            if (count > 0 && carry[i] != '0'){
                System.out.print(carry[i] + " ");
            }
        }
        System.out.println("\n");
    }
}
