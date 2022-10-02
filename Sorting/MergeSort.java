public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {23, 66, 32, 98, 12, 54};
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        MergeSort obj = new MergeSort();
        obj.mergeSort(arr, 0, arr.length- 1);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private void mergeSort(int[] arr, int l, int r) {
        if( l < r) {
            int mid = (l + r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }

    private void merge(int[] arr, int l, int mid, int r) {
        int i = l;
        int j = mid;
        int f = l;
        int[] temp = new int[100000];
        while(i <= mid && j <= r) {
            if( arr[i] < arr[j]) {
                temp[f] = arr[i++];
            }
            else {
                temp[f] = arr[j++];
            }
            f++;
        }
        if(i > mid) {
            while(j <= r) {
                temp[f] = arr[j++];
                f++;
            }
        }
        else {
            while(i <= mid) {
                temp[f] = arr[i++];
                f++;
            }
        }
        for( f = l; f <= r; f++) {
            arr[f] = temp[f];
        }
    }
}
