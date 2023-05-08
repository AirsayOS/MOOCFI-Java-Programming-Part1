
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of gift?");
        int valOfGift = Integer.valueOf(scan.nextLine());

        if (valOfGift < 5000) {
            System.out.println("No tax!");
        } else if (valOfGift >= 5000 && valOfGift < 25000) {
            double tax = (100 + (valOfGift - 5000) * 0.08);
            System.out.println("Tax: " + tax);

        } else if (valOfGift >= 25000 && valOfGift < 55000) {
            double tax = (1700 + (valOfGift - 25000) * 0.10);
            System.out.println("Tax: " + tax);

        } else if (valOfGift >= 55000 && valOfGift < 200000) {
            double tax = (4700 + (valOfGift - 55000) * 0.12);
            System.out.println("Tax: " + tax);

        } else if (valOfGift >= 200000 && valOfGift < 1000000) {
            double tax = (22100 + (valOfGift - 200000) * 0.15);
            System.out.println("Tax: " + tax);
        } else if (valOfGift >= 1000000) {
            double tax = (142100 + (valOfGift - 1000000) * 0.17);
            System.out.println("Tax: " + tax);
        }

    }
}
