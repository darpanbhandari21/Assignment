package assignment5;

import java.util.Scanner;

public class NumberToDayTranslator {

    public void dayTranslator() {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the number you want(1-7): ");
        int num = value.nextInt();

        NumberToDayTranslator obj = new NumberToDayTranslator();
        String answer = obj.translatedDay(num);
        System.out.println("The translated day to number is: " + answer);
    }

    public String translatedDay(int n) {
        String dayName = null;
        switch (n) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                System.out.println("Enter valid choice.");
        }
        return dayName;
    }

    public static void main(String[] args) {
        NumberToDayTranslator ob = new NumberToDayTranslator();
        ob.dayTranslator();
    }
}
