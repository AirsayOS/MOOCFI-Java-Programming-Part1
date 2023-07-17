
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int readInt = Integer.valueOf(scanner.nextLine());
        int ans;
        if (readInt < 0) {
            ans = readInt * -1;
            System.out.println(ans);
        } else {
            System.out.println(readInt);
        }

    }
}
