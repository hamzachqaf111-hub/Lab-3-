import java.util.Arrays;

public class Triangle {
    public static void main(String[] args){
        int [][] L = new int[5][];
        int s = 1 ;
        for (int i = 0 ; i < 5 ; i++){
            L[i] = new int[i+1];
            for (int j = 0 ; j<= i; j++){
                L[i][j]=s;
                s++;
            }
        }
        System.out.println(Arrays.deepToString(L)); // Cherch what is this deepToString!!!!!!!!!!!!!!!!!!
    }

}
