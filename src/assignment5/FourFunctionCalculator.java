package assignment5;

import java.util.Scanner;

public class FourFunctionCalculator {

    public void arithmeticCalculator() {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNum = value.nextDouble();
        System.out.println("Enter second number: ");
        double secondNum = value.nextDouble();
        System.out.println("Enter the arithmetic operator you want to perform(+-*/): ");
        char op = value.next().charAt(0);

        FourFunctionCalculator opChoice = new FourFunctionCalculator();
        double answer = opChoice.operationChoice(op, firstNum, secondNum);

        System.out.println("The answer of the arithmetic operation is: " + answer);

    }

    public double operationChoice(char op, double fNum, double sNum) {
        double ans = 0;
        switch (op) {
            case '+':
                ans = fNum + sNum;
                break;
            case '-':
                ans = fNum - sNum;
                break;
            case '*':
                ans = fNum * sNum;
                break;
            case '/':
                ans = fNum / sNum;
                break;
            default:
                System.out.println("Enter valid choice.");
        }
        return ans;
    }

    public static void main(String[] args) {
        FourFunctionCalculator ob = new FourFunctionCalculator();
        ob.arithmeticCalculator();
    }
}
