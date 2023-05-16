
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer");
        int firstInt = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter second integer");
        int secondInt = Integer.valueOf(scanner.nextLine());
        int number = firstInt + secondInt;
        
        double squareRoot = Math.sqrt(number);
        
        System.out.println(squareRoot);
        
    }
}
