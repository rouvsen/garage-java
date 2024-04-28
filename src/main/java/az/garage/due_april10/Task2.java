package az.garage.due_april10;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("ovovo"));
    }
    public static boolean isPalindrome(String str) {
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString().equals(str);
    }
}
