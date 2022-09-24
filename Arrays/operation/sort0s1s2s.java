//Dutch National Flag Algorithm

//Time Complexity: O(N)
//Space Complexity: O(1)

//Intuition is to have 3 pointers low at end of sorted 0s, mid at end of sorted 1s(the one being traversed)
//and high at starting sorted 2s
//when we encounter a 0, we swap with end 0 ie low
//when we encounter a 1, we just move forward mid++
//when we encounter a 2, we swap with start of 2 ie high

package operation;

public class sort0s1s2s {

    public static void main(String args[]) {
        int[] arr = {2,0,1,0,2,2,0,1,0,0};
        sortArray(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void sortArray(int[] arr) {

        int low = 0, mid = 0, high = arr.length - 1;

        while(mid <= high) {
            switch(arr[mid]) {
                case 0: swap(arr, low, mid); low++; mid++;
                        break;
                case 1: mid++;
                        break;
                case 2: swap(arr, mid, high);
                        high--;
                        break;
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
