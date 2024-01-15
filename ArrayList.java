import java.util.LinkedList;
import java.util.List;


public class ArrayList {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println(list);
        for (int i = 0, j = 99; i < 50 && j >= 50; i++, j--) {
            int start = list.get(i);
            int finish = list.get(j);
            list.set(j, start);
            list.set(i, finish);
        }
        System.out.println(list);
    }
}
