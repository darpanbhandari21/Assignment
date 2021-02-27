package assignment5;

import java.util.Scanner;

public class SumProductOfNumber {

    public void sumProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        SumProductOfNumber obj = new SumProductOfNumber();
        int sumAnswer = obj.sumNumber(num);
        int prodAnswer = obj.prodNumber(num);

        System.out.println("Sum of digits of number is: " + sumAnswer);
        System.out.println("Product of digits of number is: " + prodAnswer);
    }

    public int sumNumber(int num){
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int prodNumber(int num){
        int prod = 1;
        while (num != 0) {
            prod *= num % 10;
            num /= 10;
        }
        return prod;
    }

    public static void main(String[] args) {
        SumProductOfNumber ob = new SumProductOfNumber();
        ob.sumProduct();
    }
}
