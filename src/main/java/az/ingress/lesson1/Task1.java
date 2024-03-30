package az.ingress.lesson1;

import java.util.Scanner;

public class Task1 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            lightFlag(SCANNER.next().toUpperCase());
        }
    }

    public static void lightFlag(String light) {
        switch (light) {
            case "YELLOW" -> System.out.println("Be ready!");
            case "RED" -> System.out.println("Stop!");
            case "GREEN" -> System.out.println("Move!");
            default -> System.out.println("Invalid action!");
        }
    }
}
