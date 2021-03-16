package assignment7;

import java.util.Scanner;

public class PalindromeCheck {

    public static boolean checkPalindrome(String givenString) {
        int i = 0;
        int j = givenString.length() - 1;

        while (i < j) {
            if (givenString.charAt(i) != givenString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String checkString = input.next();
        boolean answer = checkPalindrome(checkString);
        if (answer == true) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}
