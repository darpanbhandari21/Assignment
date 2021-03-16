package labSolution;

import java.util.Random;
import java.util.Scanner;

public class BankAccount {
    String name;
    double initBalance = 0;
    int actNumber = 0;
    double finalBalance = 0;

    //    public void provideInfo(String n, double inBalance) {
//        this.name = n;
//        this.initBalance = inBalance;
//    }
    public BankAccount(String name) {
        Random rand = new Random();
        this.actNumber = rand.nextInt(99999999);
        String.format("%08d", actNumber);
        this.name = name;
        this.initBalance = 0.00;
    }

    public BankAccount(String name, double iBalance) {
        Random rand = new Random();
        this.actNumber = rand.nextInt(99999999);
        String.format("%08d", actNumber);
        this.name = name;
        this.initBalance = iBalance;
    }
    public double withdrawFunds(double intAmt, Scanner input) {
        //double finalAmt = 0.00;
        System.out.print("Enter the amount you want to withdraw: $");
        double withdrawalAmt = input.nextDouble();
        this.finalBalance= intAmt - withdrawalAmt;
        return finalBalance;
    }

    public double depositFunds(double intAmt, Scanner input) {
        double finalAmt = 0.00;
        System.out.print("Enter the amount you want to deposit: $");
        double depositedAmt = input.nextDouble();
        finalAmt = intAmt + depositedAmt;
        return finalAmt;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + this.actNumber);
        System.out.println("Balance: "+this.);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String fullName = input.nextLine();
        System.out.println("Enter your initial balance: ");
        double inBalance = input.nextInt();
        BankAccount ob1 = new BankAccount(fullName);
        ob1.displayInfo();
        BankAccount ob2 = new BankAccount(fullName, inBalance);
    }
}
