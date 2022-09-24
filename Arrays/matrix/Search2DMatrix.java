package matrix;

public class Search2DMatrix {

    public static void main (String[] args) {
        int matrix[][] = {{1 ,2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        int m = matrix.length;
        int n = matrix[0].length;
        int element = 15;
        boolean findElement = binarySearchMatrix(matrix, m, n, element);
        System.out.println(findElement);
    }

    private static boolean binarySearchMatrix(int[][] matrix, int m, int n, int k) {

        int low = 0, high = m-1;

        while (low <= high) {

            int mid = (low + high)/2;

            if(matrix[mid][0] == k) return true;
            if(matrix[mid][n-1] == k) return true;

            if( k > matrix[mid][0] && k < matrix[mid][n-1]) {
                return binarySearch(matrix, m, n, k, mid);
            }

            if( k < matrix[mid][0]) high = mid - 1;
            if( k > matrix[mid][n-1]) low = mid + 1;
        }
        return false;
    }

    private static boolean binarySearch(int[][] matrix, int m, int n, int k, int mid) {

        int low = 0, high = n-1;

        while(low <= high) {
            int row_mid = (low + high)/2;

            if(matrix[mid][row_mid] > k) high = row_mid - 1;
            else if(matrix[mid][row_mid] < k) low = row_mid + 1;
            else return true;
        }
        return false;
    }
}
