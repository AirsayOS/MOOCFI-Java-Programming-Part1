

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    
    public static void printFromNumberToOne(int number) {
        int i = 0;
        for (; i < number; number--) {
            System.out.println(number);
        }
        
    }

}
