package assignment7;

import java.io.*;
import java.util.Scanner;

public class NameAddressOfTenStudents {

    public String name[][] = new String[10][10];
    void getDetails(int n)
    {
        Scanner get = new Scanner(System.in);
        int limit=n;

        for(int i=0;i<limit;i++)
        {
            System.out.println("Enter Student #"+(i+1)+" Name & Address:");
            for(int j=0;j<2;j++)
            {
                name[i][j] = get.nextLine();
            }
        }

        display(limit);
    }

    void display(int limit)
    {
        System.out.println("\n");
        System.out.println("Student Name"+"\t\t"+"Address");
        for(int i=0;i<limit;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(name[i][j]+"\t\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) throws IOException
    {
        Scanner in  =  new Scanner(System.in);
        System.out.print("Enter Number of Students:");
        int n = in.nextInt();
        NameAddressOfTenStudents std = new NameAddressOfTenStudents();
        std.getDetails(n);


        PrintStream output = new PrintStream(new File("StudentDetails.txt"));
        output.println("Student Name"+"\t\t"+"Address");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                output.print(std.name[i][j]+"\t\t");
            }
            output.println();
        }
        output.close();
        FileReader fr = new FileReader("StudentDetails.txt");
        BufferedReader br = new BufferedReader(fr);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name you want address of: ");
        String enteredName = input.nextLine();
        String len;


    }
}
