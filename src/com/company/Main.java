package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean x = false;
        while (x == false) {
            Scanner scanner = new Scanner(System.in);
            final double VAT = (0.2);
            System.out.println("What is the cash amount?");
            double initialCash = scanner.nextDouble();
            double finlCash = (initialCash * VAT + initialCash);
            System.out.println("Your amount + VAT = " + finlCash);
            String again;
            System.out.println("Do you want to input another number, Y or N?");
            again = scanner.next();
            

            if (again == "N") {
                x = true;
            }
        }

    }
}
