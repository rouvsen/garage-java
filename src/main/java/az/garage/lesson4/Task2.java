package az.garage.lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int res = fibonacciWithinRecursive(new Scanner(System.in).nextInt());
        System.out.println(res);
//        int res = fibonacci(new Scanner(System.in).nextInt());
//        System.out.println(res);
    }
    public static int fibonacciWithinRecursive(int num) {
        if (num <= 1) return num;
        return fibonacciWithinRecursive(num - 1) + fibonacciWithinRecursive(num - 2);
    }
    public static int fibonacci(int num) {
        if (num <= 1) return num;
        int a = 0, b = 1, c;
        for (int i = 2; i <= num; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
