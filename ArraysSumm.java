import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysSumm {
    public static void main(String[] args) {
        List<String>listStrings= Arrays.asList("1","2","3","4","5");
        List<Integer>integerList=new ArrayList<>();
        for (String s :listStrings){
            integerList.add(Integer.valueOf(s));
        }
        int myl=1;
        for (Integer i:integerList){
            myl*=i;
        }
        System.out.println(myl);
    }
}
