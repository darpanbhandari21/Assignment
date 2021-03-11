//Darpan Bhandari 03/07/2021
//Take out program project
package bhandariTakeOutProject;

import java.util.Scanner;

public class BhandariTakeOut {

    public static void displayMainMenu() {
        System.out.println("****Main Menu****");
        System.out.println("1. Italian");
        System.out.println("2. Chinese");
        System.out.println("3. American");

    }

    public static void displayItalianFoodMenu() {
        System.out.println("****Italian Menu*****");
        System.out.println("1. Lasagna Tray - Feeds 5 - $17.99");
        System.out.println("2. Pizza Pack - Feeds 7 - $15.99");
        System.out.println("3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - $12.99");
    }

    public static void displayChineseFoodMenu() {
        System.out.println("****Chinese Menu*****");
        System.out.println("1. Chicken and Broccoli Tray(includes 7 wonton soups, 7 egg rolls) - Feeds 7 - $18.99");
        System.out.println("2. Sweet and Sour Pork Tray(includes 7 hot and sour soups, 7 egg rolls) - Feeds 7 - $18.99");
        System.out.println("3. Shrimp Fried Rice Tray(includes 10 egg rolls) - Feeds 5 - $10.99");
    }

    public static void displayAmericanFoodMenu() {
        System.out.println("****American Menu*****");
        System.out.println("1. Hamburger and Hot Dog Tray(includes bun and condiments) - Feeds 8 - $21.99");
        System.out.println("2. Grilled Chicken Sandwich and Mozzarella Sticks Tray(includes dipping sauces) - Feeds 5 - $22.99");
        System.out.println("3. Barbeque Tray(includes buns and peach cobbler) - Feeds 10 - $26.99");
    }

    public static int determineTrays(int people, int feeds) {
        double trays = 0.00;
        double ppl = (double) people;
        double fds = (double) feeds;
        trays = Math.ceil(ppl / fds);
        int noTrays = (int) trays;
        return noTrays;
    }

    public static double getSubtotal(double price, int trays) {
        double subtotal = 0.00;
        subtotal = price * trays;
        return subtotal;
    }

    public static double getTax(double subtotal, double taxRate) {
        double tax = 0.00;
        tax = taxRate * subtotal;
        return tax;
    }

    public static double getTip(double subtotal, double tipRate) {
        double tip = 0.00;
        tip = tipRate * subtotal;
        return tip;
    }

    public static double getGrandTotal(double subtotal, double tax, double tip) {
        double grandTotal = 0.00;
        grandTotal = subtotal + tax + tip;
        return grandTotal;
    }

    public static double pricePerPerson(double grandTotal, int people) {
        double ppPerson = 0.00;
        ppPerson = grandTotal / people;
        return ppPerson;
    }

    public static int determineLeftOvers(int feeds, int trays, int people) {
        int leftOver = (trays * feeds) - people;
        return leftOver;
    }

    public static void main(String[] args) {
        BhandariTakeOut ob = new BhandariTakeOut();
        Scanner value = new Scanner(System.in);
        int feeds = 0;
        double price = 0.00;
        double taxRate = 0.07; // 7%
        double tipRate = 0.15; // 15%
        System.out.println("Enter the number of people ordering: ");
        int people = value.nextInt();
        if (people < 10) {
            System.out.println("Sorry, at least 10 people must order to justify a group order.");
        } else {
            ob.displayMainMenu();
            System.out.print("Choose the type of food you'd like to order: ");
            int foodType = value.nextInt();


            switch (foodType) {
                case 1:
                    ob.displayItalianFoodMenu();
                    System.out.print("Choose the type: ");
                    int trayType = value.nextInt();
                    switch (trayType) {
                        case 1:
                            feeds = 5;
                            price = 17.99;
                            break;
                        case 2:
                            feeds = 7;
                            price = 15.99;
                            break;
                        case 3:
                            feeds = 4;
                            price = 12.99;
                            break;
                        default:
                            System.out.println("Sorry, please enter the valid choice.");
                    }
                    break;
                case 2:
                    ob.displayChineseFoodMenu();
                    System.out.print("Choose the type: ");
                    trayType = value.nextInt();
                    switch (trayType) {
                        case 1:
                            feeds = 7;
                            price = 18.99;
                            break;
                        case 2:
                            feeds = 7;
                            price = 18.99;
                            break;
                        case 3:
                            feeds = 5;
                            price = 10.99;
                            break;
                        default:
                            System.out.println("Sorry, please enter the valid choice.");
                    }
                    break;
                case 3:
                    ob.displayAmericanFoodMenu();
                    System.out.print("Choose the type: ");
                    trayType = value.nextInt();
                    switch (trayType) {
                        case 1:
                            feeds = 8;
                            price = 21.99;
                            break;
                        case 2:
                            feeds = 5;
                            price = 22.99;
                            break;
                        case 3:
                            feeds = 10;
                            price = 26.99;
                            break;
                        default:
                            System.out.println("Sorry, please enter the valid choice.");
                    }
                    break;
                default:
                    System.out.println("Sorry, choose the correct option.");
            }
            if (feeds > 0) {
                int trays = ob.determineTrays(people, feeds);
                System.out.println("Trays: " + trays);
                System.out.println("Feeds: " + feeds);
                double subtotal = ob.getSubtotal(price, trays);
                System.out.println("Subtotal is: " + subtotal);
                double tax = ob.getTax(subtotal, taxRate);
                System.out.println("Tax amount is: " + tax);
                double tip = ob.getTip(subtotal, tipRate);
                System.out.println("Tip amount is: " + tip);
                double grandTotal = ob.getGrandTotal(subtotal, tax, tip);
                System.out.println("The total amount is(food, tax, tip): " + grandTotal);
                double ppPerson = ob.pricePerPerson(grandTotal, people);
                System.out.println("Price per person: " + ppPerson);
                int leftOvers = ob.determineLeftOvers(feeds, trays, people);
                System.out.println("Leftover servings for the delivery person: " + leftOvers);
            }
        }
    }
}
