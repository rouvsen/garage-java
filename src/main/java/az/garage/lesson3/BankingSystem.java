package az.garage.lesson3;

import java.util.Scanner;

public class BankingSystem {
    private final static Scanner sc = new Scanner(System.in);
    private static int BALANCE = 100;
    public static void main(String[] args) {
    }
    public static void showMenu() {
        System.out.print("""
                1. Depozit elave edin
                2. Pul cekin
                3. Balansa baxin
                Emeliyyati daxil edin: """);
        switch (sc.nextInt()) {
            case 1 -> addDepozit(sc.nextInt());
            case 2 -> pullMoney(sc.nextInt());
            case 3 -> showBalance();
            default -> System.out.println("Unsupported operation!");
        }
    }

    private static void showBalance() {
        System.out.printf("BALANCE %d%n",BALANCE);
    }

    private static void pullMoney(int num) {
        BALANCE -= num;
        System.out.println("Balansinizdan mebleg cekildi");
    }

    private static void addDepozit(int depozit) {
        BALANCE += depozit;
        System.out.println("Mebleg hesabiniza elave edildi.");
    }

}
