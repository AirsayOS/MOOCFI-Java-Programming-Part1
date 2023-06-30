
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int bigNum = 0;
        if (number1 > number2 && number1 > number3) {
            bigNum = number1;
        } else if (number2 > number3) {
            bigNum = number2;
        } else {
            bigNum = number3;
        }

        return bigNum;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
