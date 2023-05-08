// Import the Scanner class from the java.util package
import java.util.Scanner;

// Define a public class called GiftTax
public class GiftTax {

    // Define the main method, which is the entry point of the program
    public static void main(String[] args) {
        
        // Create a new Scanner object to read user input from the console
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the value of the gift
        System.out.println("Value of gift?");
        
        // Read the user's input as a string and convert it to an integer
        int valOfGift = Integer.valueOf(scan.nextLine());

        // Check if the value of the gift is less than 5000
        if (valOfGift < 5000) {
            System.out.println("No tax!");  // If so, print "No tax!"
        }
        // Check if the value of the gift is between 5000 and 25000 (inclusive)
        else if (valOfGift >= 5000 && valOfGift < 25000) {
            // Calculate the tax as 100 plus 8% of the value above 5000
            double tax = (100 + (valOfGift - 5000) * 0.08);
            System.out.println("Tax: " + tax);  // Print the tax amount
        }
        // Check if the value of the gift is between 25000 and 55000 (inclusive)
        else if (valOfGift >= 25000 && valOfGift < 55000) {
            // Calculate the tax as 1700 plus 10% of the value above 25000
            double tax = (1700 + (valOfGift - 25000) * 0.10);
            System.out.println("Tax: " + tax);  // Print the tax amount
        }
        // Check if the value of the gift is between 55000 and 200000 (inclusive)
        else if (valOfGift >= 55000 && valOfGift < 200000) {
            // Calculate the tax as 4700 plus 12% of the value above 55000
            double tax = (4700 + (valOfGift - 55000) * 0.12);
            System.out.println("Tax: " + tax);  // Print the tax amount
        }
        // Check if the value of the gift is between 200000 and 1000000 (inclusive)
        else if (valOfGift >= 200000 && valOfGift < 1000000) {
            // Calculate the tax as 22100 plus 15% of the value above 200000
            double tax = (22100 + (valOfGift - 200000) * 0.15);
            System.out.println("Tax: " + tax);  // Print the tax amount
        }
        // If the value of the gift is 1 million or more
        else if (valOfGift >= 1000000) {
            // Calculate the tax as 142100 plus 17% of the value above 1000000
            double tax = (142100 + (valOfGift - 1000000) * 0.17);
            System.out.println("Tax: " + tax);  // Print the tax amount
        }

    }
}
