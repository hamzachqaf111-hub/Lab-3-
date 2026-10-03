import java.util.Arrays;

public class MatrixAdd {
    public static int[][] matrixAdd(int[][] A, int[][] B ){
        int[][] C = new int[A.length][A[0].length];
        for (int i = 0 ; i < A.length ; i++ ){
            for ( int j = 0 ; j < A[0].length ; j++){
                C[i][j]= A[i][j] + B[i][j];
            }
        }
        return C;
    }
    public static void main(String[] args){
        int[][] A = {{2,5},{1,5}};
        int[][] B = {{6,2},{3,4}};
        System.out.println(Arrays.deepToString(matrixAdd(A,B)));
    }
}
