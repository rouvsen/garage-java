package az.garage.lesson4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,15,5,100,75,95,47};
        int target = 75;
        Arrays.sort(arr);
//        int res = findBinary(arr, target);
//        System.out.println(res == -1 ? "Not found!" : "at index: " + res);
        int res = findBinaryRecursive(arr, 0, arr.length - 1, target);
        if (res == -1) {
            System.out.println("Not Found!");
        } else {
            System.out.println("Found index at: " + res);
        }
    }

    public static int findBinaryRecursive(int[] arr, int low, int high, int target) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] > target) return findBinaryRecursive(arr, low, mid - 1, target);
        else return findBinaryRecursive(arr, mid + 1, high, target);
    }

    public static int findBinary(int[] arr, int num) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == num) return mid;
            else if (arr[mid] > num) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
