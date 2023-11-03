public class FindFactorial {
    public static void main(String[] args) {
findFactorial(10);
    }
    public static void findFactorial(int n ){
        int result=1;
        for (int i = 1; i <=n ; i++) {
            result*=i;
        }
        System.out.println(result);
    }
}
