public class Print {
    public static void main(String[] args) {

print("Print this", 2);
    }
    public static void print (String s, int n){
        int count = 0;
        while (count<n){
            System.out.println(s);
            count++;
        }
    }
}
