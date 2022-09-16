// The idea in selection is to divide array into sorted and unsorted array.
// With each pass we choose the leftmost element, then run an inner loop to find the smallest element
// Then we swap these elements, if no min element is swapped with itself
// O(n2) time and O(1) space

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 11, 6};
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] sorted_arr = selectionSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(sorted_arr[i] + " ");
        }
        System.out.println();
    }

    private static int[] selectionSort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++ ) {
            int min = i;
            for(int j = i + 1; j < arr.length ; j++ ) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            swap(arr, i, min);
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