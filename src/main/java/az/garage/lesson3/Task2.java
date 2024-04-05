package az.garage.lesson3;

import java.util.Scanner;

public class Task2 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        calculateFunc();
    }

    private static void calculateFunc() {
        while (true) {
            System.out.print("""
                Simple Calculator
                -----------------
                Choose an operation:
                1. Add
                2. Subtract
                3. Multiply
                4. Divide
                Enter choice (1-4):""");
            int choice = sc.nextInt();
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();
            switch (choice) {
                case 1 -> System.out.println("Result: " + num1 + " + " + num2 + " = " + (num1 + num2));
                case 2 -> System.out.println("Result: " + num1 + " - " + num2 + " = " + (num1 - num2));
                case 3 -> System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
                case 4 -> System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1 / num2));
                default -> throw new IllegalArgumentException("Invalid operation!");
            }
            System.out.print("Do another calculation? (yes/no): ");
            if(sc.next().equals("no")) {
                System.out.print("Goodbye!");
                break;
            }
        }
    }
}
