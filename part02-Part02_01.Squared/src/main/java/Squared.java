
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input integer to be squared");
        
        int inputSquared = Integer.valueOf(scanner.nextLine());
        int squared = inputSquared * inputSquared;
        
        System.out.println(squared);

    }
}
