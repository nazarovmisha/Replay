public class Ex {
    public static void main(String[] args) {
        int[] array1 = new int[100];
        int[] array2 = new int[100];

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                array1[i]= (int) (Math.random()*100);
                array2[j]=(int) (Math.random()*100);

                try {
                  int a= array1[i] / array2[j];
                } catch (ArithmeticException e) {
                    System.out.println("Не делим на на ноль");
                }
            }
        }
    }
}