/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questionone;

/**
 *
 * @author EK
 */


import java.util.Scanner;

/**
 * A program to check whether a given month is a leap month.
 */
public class LeapMonth {

    public static void main(String[] args) {
        // Declare the necessary variables
        int year;
        int month;
        boolean isLeapMonth;

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the year and month from the user
        System.out.print("Enter the year: ");
        year = scanner.nextInt();

        System.out.print("Enter the month (1-12): ");
        month = scanner.nextInt();

        // Check if the given month is a leap month
        isLeapMonth = isLeapMonth(year, month);

        // Display the result
        if (isLeapMonth) {
            System.out.println("The month " + month + " in the year " + year + " is a leap month.");
        } else {
            System.out.println("The month " + month + " in the year " + year + " is not a leap month.");
        }

        // Close the scanner
        scanner.close();
    }

    /**
     * Method to check if a given month in a specific year is a leap month.
    
     */
    public static boolean isLeapMonth(int year, int month) {
        // A month is a leap month if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Assume February (month 2) is the leap month
        if (isLeapYear && month == 2) {
            return true;
        } else {
            return false;
        }
    }
}
