
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int lastNum = Integer.valueOf(scanner.nextLine());

        int i = firstNum;
        int result = 0;

        while (i <= lastNum) {
            result += i;
            i++;
        }
        System.out.println(result);
    }
}
