import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1. Calculate Max
 * - Create a method getMax() with two integer (int) parameters, that returns maximal of the two numbers.
 * - Write a program that reads three numbers from the console and prints the biggest of them.
 * Use the getMax() method you just created.
 */

public class CalculateMax {
    private static int a, b, c;

    public static void main(String[] args) {
        getUserInput();
        System.out.println("The biggest number is: " + getMax(getMax(a, b), c));
    }

    private static void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter first integer number: ");
            a = scanner.nextInt();
            System.out.println("Enter the second integer number: ");
            b = scanner.nextInt();
            System.out.println("Enter the third integer number: ");
            c = scanner.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Wrong input ! Enter again !");
            getUserInput();
        } finally {
            scanner.close();
        }
    }

    private static int getMax(int a, int b) {
        return a < b ? b : a;
    }
}
