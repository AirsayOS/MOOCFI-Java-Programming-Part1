
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many times?");
        int callTimes = Integer.valueOf(scanner.nextLine());
        int count = 0;
        
        while (count < callTimes) {
            printText();
            count++;
        }
        
       /*
        for (; count < callTimes; count++) {
            printText();
        }
       */
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
