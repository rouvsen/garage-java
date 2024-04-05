package az.garage.lesson1;

import java.util.Scanner;

public class Task2 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter Current Currency: ");
            String currentCur = SCANNER.next().toUpperCase();
            System.out.print("Enter Target Currency: ");
            String targetCur = SCANNER.next().toUpperCase();
            System.out.print("Enter Amount: ");
            double amount = SCANNER.nextDouble();
            findCurrency(currentCur, targetCur, amount);
        }
    }

    public static void findCurrency(String currentCur, String targetCurrency, double amount) {
        switch (currentCur) {
            case "USD" -> {
                switch (targetCurrency) {
                    case "AZN" -> System.out.println(amount * 1.7d);
                    case "EUR" -> System.out.println(amount * 0.9266d);
                    case "GBP" -> System.out.println(amount * 0.7923d);
                    case "TL" -> System.out.println(amount * 32.0962d);
                }
            }
            case "AZN" -> {
                switch (targetCurrency) {
                    case "USD" -> System.out.println(amount * 0.5882d);
                    case "EUR" -> System.out.println(amount * 0.5459d);
                    case "GBP" -> System.out.println(amount * 0.466d);
                    case "TL" -> System.out.println(amount * 19.084d);
                }
            }
            case "EUR" -> {
                switch (targetCurrency) {
                    case "AZN" -> System.out.println(amount * 1.832d);
                    case "USD" -> System.out.println(amount * 1.0792d);
                    case "GBP" -> System.out.println(amount * 0.8542d);
                    case "TL" -> System.out.println(amount * 34.7712d);
                }
            }
            case "TL" -> {
                switch (targetCurrency) {
                    case "AZN" -> System.out.println(amount * 0.0524d);
                    case "EUR" -> System.out.println(amount * 0.0288d);
                    case "GBP" -> System.out.println(amount * 0.0244d);
                    case "USD" -> System.out.println(amount * 0.0312d);
                }
            }
            case "GBP" -> {
                switch (targetCurrency) {
                    case "AZN" -> System.out.println(amount * 2.1459d);
                    case "EUR" -> System.out.println(amount * 1.1706d);
                    case "USD" -> System.out.println(amount * 1.2622d);
                    case "TL" -> System.out.println(amount * 40.9523d);
                }
            }
        }
    }
}
