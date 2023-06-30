
public class Smallest {

    public static int smallest(int number1, int number2) {
        int returnValue = 0;
        if (number1 < number2) {
            returnValue = number1;
        } else {
            returnValue = number2;
        }
        return returnValue;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
