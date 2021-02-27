package assignment5;

import java.util.Scanner;

public class ReverseNum {

    public void reverseNumber() {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = value.nextInt();

        int revNum = 0;
        while (num != 0) {
            revNum *= 10;
            revNum += (num % 10);
            num = num / 10;
        }
        System.out.println("Reverse of input number is: " + revNum);
    }

    public static void main(String[] args) {
        ReverseNum ob = new ReverseNum();
        ob.reverseNumber();
    }
}
