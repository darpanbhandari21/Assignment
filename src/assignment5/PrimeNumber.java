package assignment5;

import java.util.Scanner;

public class PrimeNumber {

    public void isPrimenumber(int n) {
        int flag = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number.\n");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println(n + " is a prime number.\n");
        }
    }

    public void firstNthPrime(int n) {
        System.out.println("\nFirst " + n + " prime numbers are: ");
        for (int i = 2; i <= n; i++) {
            int flag = 1;
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public void allPrimebetween(int start, int end) {
        String primeNums = "";
        int num = 0;
        for (int i = start; i <= end; i++) {
            int count = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                primeNums = primeNums + i + " ";
            }
        }
        System.out.println("\nPrime numbers between " + start + " and " + end + " are:");
        System.out.println(primeNums);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        PrimeNumber ob = new PrimeNumber();
        ob.isPrimenumber(num);

        System.out.println("Enter the nth number: ");
        int nth = input.nextInt();
        ob.firstNthPrime(nth);

        System.out.println("\n\nEnter a start number: ");
        int startPrime = input.nextInt();
        System.out.println("Enter a end number: ");
        int endPrime = input.nextInt();
        ob.allPrimebetween(startPrime, endPrime);

    }
}
