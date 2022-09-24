package find;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1};
        nextPermutation(arr);
        for(int num: arr) {
            System.out.print(num + " ");
        }
    }

    private static void nextPermutation(int[] arr) {

        int n = arr.length;
        if(n == 0 || n == 1) return;
        int i = n - 2, j = n-1;
        while(i >= 0 && arr[i] >= arr[i+1]) i--;
        if(i >= 0) {
            while( j > i && arr[j] <= arr[i]) j--;
            swap(arr, i, j);
        }
        reverse(arr, i+1, n-1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[] arr, int i, int j) {
        while(i < j) {
            swap(arr, i++, j--);
        }
    }
}
