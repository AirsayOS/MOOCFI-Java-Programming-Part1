
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);

        Scanner scanner = new Scanner(System.in);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        int i = beginning;
        while (i <= end) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

}
