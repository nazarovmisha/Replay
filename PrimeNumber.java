public class PrimeNumber {
    public static void main(String[] args) {
        int j=0;
        int [] arr = new int[2];
        for (int i = 2; i <=100 ; i++) {
            for (int k = 0; k >0; k--) {
                if (i%j==0){
                    arr[k]=i;
                    k++;
                }

            }

        }
    }
}
