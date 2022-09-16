import java.util.*;
public class RemoveDuplicates {

    public static void main (String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4,5,5,6,6,6};
        for(int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int res_len = removeDuplicates(arr);
        for(int i = 0; i < res_len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static int removeDuplicates(int[] arr) {
        int i = 0;
        for(int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

}