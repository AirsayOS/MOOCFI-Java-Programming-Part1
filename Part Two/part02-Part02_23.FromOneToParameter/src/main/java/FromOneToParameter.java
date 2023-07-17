
public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(3);
    }

    public static void printUntilNumber(int number) {
        int i = 1;
        for (; i <= number; i++) {
            System.out.println(i);
        }
    }

}
