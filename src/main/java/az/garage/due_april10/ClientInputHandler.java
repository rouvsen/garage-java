package az.garage.due_april10;

import java.util.Scanner;

/**
 * @author rovshan.maharramov
 * @github-user: rouvsen
 * */
public final class ClientInputHandler {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String GETTING_VALUE_CONST = "Enter a value: ";
    public static String getInputStr() {
        printConstToConsole();
        return SCANNER.next();
    }
    public static int getInputInteger() {
        printConstToConsole();
        return SCANNER.nextInt();
    }
    public static double getInputDouble() {
        printConstToConsole();
        return SCANNER.nextDouble();
    }
    public static char getInputChar() {
        printConstToConsole();
        return SCANNER.next().trim().charAt(0);
    }
    private static void printConstToConsole() {
        System.out.print(GETTING_VALUE_CONST);
    }
}
