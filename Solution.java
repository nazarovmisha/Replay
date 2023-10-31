
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
max(25,54456,-5,0);
    }

    public static void max(int a, int b, int c, int d){
        int [] arr = new int[4];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        Arrays.sort(arr);
        System.out.println(arr[3]);

    }
}
