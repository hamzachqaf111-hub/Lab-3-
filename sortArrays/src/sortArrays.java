
import java.util.Arrays;

public class sortArrays {
    public static int[] sortIntegers(int[] L) {
        int[] sortedL = Arrays.copyOf(L, L.length);
        for (int i = 0; i < sortedL.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < sortedL.length; j++) {
                if (sortedL[j] > sortedL[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = sortedL[i];
            sortedL[i] = sortedL[maxIndex];
            sortedL[maxIndex] = temp;
        }
        return sortedL;
    }
    public static void main(String[] args) {
        int[] L = {106, 2, 5, 200, 34};
        System.out.println(Arrays.toString(sortIntegers(L)));
    }
}