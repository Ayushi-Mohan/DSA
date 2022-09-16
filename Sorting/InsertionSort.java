// Here we also devide the array to sorted and unsorted array but performance is better. From index 1 we consider as insertion_value and compare to sorted array before it.
// If 

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {23, 66, 32, 98, 12, 54};
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] sorted_arr = insertionSort(arr);
        for(int i = 0; i < sorted_arr.length; i++) {
            System.out.print(sorted_arr[i] + " ");
        }
        System.out.println();
    }

    private static int[] insertionSort(int[] arr) {

        for(int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i-1;
            while( j >= 0 && arr[j] > curr) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
        return arr;
    }
}