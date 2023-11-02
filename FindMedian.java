import java.util.Arrays;

public class FindMedian {
    public static void main(String[] args) {
findMedian(3, 2, 1);
    }
    public static void findMedian(int a,int b, int c){
      int [] array = new int[3];
      array[0]=a;
      array[1]=b;
      array[2]=c;
        Arrays.sort(array);
        System.out.println(array[1]);

    }
}

