package matrix;

public class Search2DMatrxiRowColSorted {

    public static void main (String[] args) {
        int matrix[][] = {{1 ,5, 10, 20},
                          {3, 9, 15, 21},
                          {6, 12, 18, 24},
                          {8, 16, 32, 64}};
        int m = matrix.length;
        int n = matrix[0].length;
        int element = 19;
        boolean findElement = linearSearchMatrix(matrix, m, n, element);
        System.out.println(findElement);
    }

    private static boolean linearSearchMatrix(int[][] matrix, int m, int n, int k) {

        int i = 0, j = n-1;

        while(i < m && j >= 0) {

            if(matrix[i][j] == k) return true;

            else if (matrix[i][j] > k) j--;

            else i++;
        }
        return false;
    }
}
