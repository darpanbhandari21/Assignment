package assignment3;

import java.util.Scanner;

public class PersonalInfo {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.println("Enter the roll number: ");
        int roll = value.nextInt();

        value.nextLine();

        System.out.println("Enter the name: ");
        String name = value.nextLine();


        System.out.println("Enter the nationality: ");
        String nationality = value.nextLine();

        System.out.println("\n\n***Personal Info***");
        System.out.println("Roll Number: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Nationality: " + nationality);


    }
}
