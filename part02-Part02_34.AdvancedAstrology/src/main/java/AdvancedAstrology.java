
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int count = 0; count < number; count++) {
            System.out.print("*");
        }
        System.out.println("");
        
    }

    public static void printSpaces(int number) {
        for (int count = 0; count < number; count++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int count = 1; count <= size; count++) {
            printSpaces(size - count);
            printStars(count);
        }
    }

    public static void christmasTree(int height) {
        for (int count = 1; count <= height; count++) {
            printSpaces(height-count);
            printStars(2 * count-1);
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
