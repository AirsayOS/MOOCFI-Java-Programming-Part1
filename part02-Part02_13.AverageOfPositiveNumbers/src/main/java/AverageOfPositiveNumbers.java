
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveNum = 0;
        int sumOfPositiveNum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num != 0 && num > 0) {
                positiveNum = positiveNum + 1;
                sumOfPositiveNum = sumOfPositiveNum + num;
            }
            
            if (num == 0) {
                break;
            }
        }
        if (sumOfPositiveNum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sumOfPositiveNum / positiveNum);
        }

    }
}
