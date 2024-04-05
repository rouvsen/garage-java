package az.garage.lesson2;

import java.util.Scanner;

public class Task1234 {
    /**
     * TODO: Task-1 DONE!
        *
       ***
      *****
     *******
     * TODO: Task-2 DONE!
        *
       ***
      *****
     ******* Big version

     * TODO: Task-3 DONE!
         1
        222
       33333
      4444444
     555555555

     * TODO: Task-4 DONE!
         *
        * *
       *   *
      *     *
     *********
     * */

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        asteriskTask4(sc.nextInt());
    }

    private static void asteriskTask1And2(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1) System.out.print("*");
                else if (j == 2 * i - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void asteriskTask3(int num) {
        int constantVal = 1;
        for (int i = 1; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(constantVal);
            }
            constantVal++;
            System.out.println();
        }
    }

    private static void asteriskTask4(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == size)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
