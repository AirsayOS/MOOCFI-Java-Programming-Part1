
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numOfInputVal = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num < 0) {
                numOfInputVal = numOfInputVal + 1;
            }
            
            /* If the input number is positive,
            the code simply skips over the if block and continues
            with the next iteration of the loop, which will prompt
            the user for another number. This means that the count
            of negative numbers will still be accurate, and the loop
            will continue until the user enters a zero to exit the loop.*/
            
            if (num == 0) {
                break;
            }
        }
        System.out.println("Number of negative numbers: " + numOfInputVal);

    }
}
