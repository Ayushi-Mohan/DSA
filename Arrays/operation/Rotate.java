package operation;

public class Rotate {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 5;
        int n = arr.length;
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        rotateRight(arr, k, n);
        System.out.println("Right Rotated: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        rotateLeft(arr, 2, n);
        System.out.println("Left Rotated: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void rotateLeft(int[] arr, int k, int n) {
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    private static void rotateRight(int[] arr, int k, int n) {
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
        
    }

    private static int[] reverse(int[] arr, int start, int end) {
        while( start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}