package matrix;

public class SetMatrixZeros {

    public static void main (String[] args) {
        int matrix[][] = {{1 ,1, 1},
                          {1, 0, 1},
                          {1, 1, 1}};
        setMatrix0s(matrix);
        for(int[] num_arr : matrix) {
            for(int num : num_arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static void setMatrix0s(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int col0 = -1;
        for(int i = 0; i < n; i++) {
            if(matrix[i][0] == 0) col0 = 0;
            for(int j = 1; j < m; j++)
                if(matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }
        for(int i = n-1; i >= 0; i--) {
            for(int j = m-1; j >= 1; j--)
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if(col0 == 0) matrix[i][0] = 0;
        }
    }
}
