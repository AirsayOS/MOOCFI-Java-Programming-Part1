
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for (int count = 0; count < number; count++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        for (int count = 0; count < size; count++) {
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        for (int count = 0; count < height; count++) {
            printStars(width);
        }
    }
    
    public static void printTriangle(int size) {
        /*count is assigned 1 here because if it's 0
        it'll run the first iteration without printing anything */
        for (int count = 1; count <= size; count++) {
            printStars(count);
        }
    }
}
