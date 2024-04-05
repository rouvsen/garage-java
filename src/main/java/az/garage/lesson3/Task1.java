package az.garage.lesson3;

import java.util.Scanner;

public class Task1 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter pow: ");
        int pow = sc.nextInt();
        findPow(num, pow);
    }
    public static void findPow(int num, int pow) {
        int res = 1;
        for (int i = 1; i <= pow; i++) {
            res = res * num;
        }
        System.out.println(res);
    }
}
