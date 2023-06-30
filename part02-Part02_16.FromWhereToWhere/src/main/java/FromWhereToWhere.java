
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int inputTo = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int inputFrom = Integer.valueOf(scanner.nextLine());
        int i;
        for (i = inputFrom; i <= inputTo; i++) {
            System.out.println(i);
        }

    }
}
