
public class StarSign {

    public static void main(String[] args) {
        printSquare(4);
        printRectangle(7,4);
        printTriangle(5);
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            printStars(size);
        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
        System.out.println("");
    }

    public static void printTriangle(int size) {
        for (int i = 0; i <= size; i++) {
            printStars(i);
        }
    }
}
