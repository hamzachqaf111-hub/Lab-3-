public class stdev {
    public static double stdv (int[] L) {
        double sum = 0;
        double avg;
        double rslt = 0 ;
        double S ;
        for (int i = 0; i < L.length; i++) {
            sum += L[i];
        }
        avg = sum / L.length;
        for (int j = 0; j < L.length; j++) {
            rslt += Math.pow((L[j]-avg), 2);
        }
        S = Math.pow((rslt / (L.length-1)),0.5);
        return S ;
    }
    public static void main(String[] args){
        int[] L = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.println(stdv(L));
    }
}
