package assignment7;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        StringBuilder value = new StringBuilder();
        value.append(str);
        value.reverse();
        System.out.println("The original string is: " + str);
        System.out.println("The reverse of a string is: " + value);
    }
}
