package assignment5;

import java.util.Scanner;

public class SumToNth {

    public void sumNth() {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the required number: ");
        int num = value.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("The sum of the number is: " + sum);
    }

    public static void main(String[] args) {
        SumToNth ob = new SumToNth();
        ob.sumNth();
    }
}
