package az.garage.lesson3;

public class TaskInLesson {
    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }
    public static int findFactorial(int num) {
        if(num == 0 || num == 1) return 1;
        return num * findFactorial(num - 1);
    }
}
