import java.util.Arrays;

public class swap {
    public static int [] reverse(int[] L){
        int[] R = Arrays.copyOf(L,L.length);
        int index = 0 ;
        for (int i = 0 ; i<L.length/2+1 ;i++){
            int temp = L[index];
            R[i]=L[L.length-i-1];
            R[L.length-i-1]=temp;
            index ++;
        }
        return R;
    }
    public static void main(String[] args){
        int [] L = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(L)));
    }
}
