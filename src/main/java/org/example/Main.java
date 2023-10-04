package org.example;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        try {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer numbers:");
        String str1 = scanner.nextLine();

        StringCalculator string_calc = new StringCalculator();
        System.out.println("The sum of entered numbers: " + string_calc.add(str1));
        scanner.close();}
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}