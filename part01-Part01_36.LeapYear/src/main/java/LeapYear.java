// Importing the Scanner class to read user input
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        // Creating a new Scanner object to read user input from the console
        Scanner scan = new Scanner(System.in);

        // Asking the user to give a year
        System.out.println("Give a year");

        // Reading the user input and converting it to an integer
        int year = Integer.valueOf(scan.nextLine());

        // Checking if the year is divisible by 100 and 400
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("The year is a leap year");
        } 
        // Checking if the year is divisible by 100 but not by 400
        else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("This year is not a leap year");
        } 
        // Checking if the year is divisible by 4
        else if (year % 4 == 0) {
            System.out.println("The year is a leap year");
        } 
        // If none of the above conditions are met, the year is not a leap year
        else {
            System.out.println("The year is not a leap year");
        }
    }
}
