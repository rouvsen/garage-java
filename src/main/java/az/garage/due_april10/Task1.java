package az.garage.due_april10;

import java.util.Objects;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Reversed ver. is: " + findReverseStr(ClientInputHandler.getInputStr()));
    }
    public static String findReverseStr(String word) {
        if(Objects.isNull(word) || word.isEmpty())
            throw new IllegalArgumentException("Unexpected String Value!");
        if(word.length() == 1)
            return word;
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            stringBuilder.append(word.charAt(i));
        }
        return stringBuilder.toString();
    }
}
