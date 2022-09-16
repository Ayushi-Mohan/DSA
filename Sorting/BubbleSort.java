// Here we compare adjacent elements such that with every loop greatest element in unsorted array goes to rightmost position in unsorted array
// It is similar to selection sort as it divides array into unsorted and sorted, but here we first find the greatest element. Also number of swaps is more
// O(n2) time and O(1) space

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {23, 66, 32, 98, 12, 54};
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] sorted_arr = bubbleSort(arr);
        for(int i = 0; i < sorted_arr.length; i++) {
            System.out.print(sorted_arr[i] + " ");
        }
        System.out.println();
    }

    private static int[] bubbleSort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j< arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) 
                    swap(arr, j, j+1);
            }
        }
        return arr;
    }

    private static int[] swap(int[] arr, int a, int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
        return arr;
    }
}