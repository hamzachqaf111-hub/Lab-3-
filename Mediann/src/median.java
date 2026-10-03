import java.util.Arrays;

public class median {
    public static int[] sortIntegers(int[] L) {
            int[] sortedL = Arrays.copyOf(L, L.length);

            for(int i = 0; i < sortedL.length - 1; ++i) {
                int maxIndex = i;

                for(int j = i + 1; j < sortedL.length; ++j) {
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

        public static int median(int[] L) {
            int[] T = sortIntegers(L);
            return T[(L.length + 1) / 2 - 1];
        }

        public static void main(String[] args) {
            int[] P = new int[]{1, 9, 5, 3, 45, 7, 6};
            System.out.println(median(P));
        }
    }

