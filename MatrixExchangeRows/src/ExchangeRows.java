import java.util.Arrays;

public class ExchangeRows {
    public static void main(String[] args){
        int[][] L = {{21,25,98,98,25,36,98,58},{1,2,8,9,2,6,0,0},{0,0,9,98,26,33,9,28}
                ,{61,95,23,8,5,3,100,96},{1,25,97,98,5,3,93,8},{2,2,98,0,25,6,8,5}};
        int[] copy = Arrays.copyOf(L[1],L[1].length);
        for (int i = 0 ; i<L[1].length ; i++){
            L[1][i]=L[4][i];
            L[4][i]=copy[i];
        }
        System.out.println(Arrays.deepToString(L));
    }
}
