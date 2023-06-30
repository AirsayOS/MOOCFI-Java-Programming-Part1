
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int sum = 0;
        int numbers = 0;
        double mean = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            if (input != -1) {
                sum += input;
                numbers++;
                
                if (input % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }

            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + (mean = ((double) sum) / numbers));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
