package assignment4;

import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the ASCII code(0-128): ");
        int ascCode = value.nextInt();
        if (ascCode >= 0 && ascCode < 128) {
            char ascChar = (char) ascCode;
            System.out.println("The character for the ASCII value is: " + ascChar);
        } else {
            System.out.println("Please enter the valid ASCII code(0-128).");
        }
    }
}
