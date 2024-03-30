package az.ingress.lesson1;

import java.util.Scanner;

public class Task2 {

    private static final Scanner SCANNER = new Scanner(System.in);

    private static final Double AZN = 1.7d;
    private static final Double USD = 0.5891d;
    private static final Double EUR = 0.5459d;
    private static final Double GBP = 0.4667d;
    private static final Double TL = 19.1124d;

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter Target Currency: ");
            String targetCur = SCANNER.next().toUpperCase();

            System.out.print("Enter Amount: ");
            double amount = SCANNER.nextDouble();

            findCurrency(targetCur, amount);
        }
    }

    public static void findCurrency(String targetCurrency, double amount) {
        switch (targetCurrency) {
            case "AZN" -> System.out.println(AZN * amount);
            case "USD" -> System.out.println(USD * amount);
            case "EUR" -> System.out.println(EUR * amount);
            case "GBR" -> System.out.println(GBP * amount);
            case "TL" ->  System.out.println(TL * amount);
        }
    }
}
