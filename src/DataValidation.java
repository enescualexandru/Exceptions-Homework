/**
 * 3. Input Data Validation
 * - write a program that asks the user what time it is, by printing on the console What time is it.
 * Then the user must enter two numbers – one for hours and one for minutes.
 * If the input data represents a valid time, the program must output the message  The time is hhmm now.,
 * where hh respectively means the hours, and mm – the minutes. If the entered hours or minutes are not valid,
 * the program must print the message  Incorrect time!. The validation must be implemented in a separate method.
 * <p>
 * Additionally, I've implemented a method called formatTime(), which returns the correct time format,
 * always as hh:mm.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataValidation {
    static private byte hour, minute;

    public static void main(String[] args) {
        getUserInput();
        if (validateTime(hour, minute)) {
            System.out.println("The time is " + formatTime(hour, minute) + " now.");
        } else {
            System.out.println("Incorrect time !");
        }
    }

    private static void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter hour:");
            hour = scanner.nextByte();
            System.out.println("Please enter minutes:");
            minute = scanner.nextByte();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Wrong input ! Enter again !");
            getUserInput();
        } finally {
            scanner.close();
        }
    }

    private static boolean validateTime(byte hour, byte minute) {
        return hour >= 0 && hour < 24 && minute >= 0 && minute < 60;
    }

    private static String formatTime(byte hour, byte minute) {
        return String.format("%02d:%02d", hour, minute);
    }
}