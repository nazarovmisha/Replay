public class Balance {
    int l;
    int r;
    public static void main(String[] args) {

    }
    public void addRight(int n){
        r+=n;
    }
    public void addLeft(int n){
        l+=n;
    }
    public String getSituation(){
        if (r>l)
            return "r";
       else if (l>r) return "l";
           return "=";
    }
}
