public class EmptyBucket {
    public static void main(String[] args) {
        int i = 0;
        int j = 30;
        while (j > 0) {
            i++;
            j--;
            if (i % 10 != 0) {
                System.out.println(i);
            }
            if (j%10!=0){
                System.out.println(j);
            }
        }
    }
}