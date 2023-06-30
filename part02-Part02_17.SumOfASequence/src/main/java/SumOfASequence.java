
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int lastNum = Integer.valueOf(scanner.nextLine());
        int i = 0;
        int result = 0;
        
        while (i <= lastNum) {
            result += i;
            i++;
        }
        System.out.println(result);

    }
}
