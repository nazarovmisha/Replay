public class WooHoo {
    public static void main(String[] args) {
        String J="dsfgsdg";
        String S ="bhsdjhhgjksdhghj";
        String[] a1 = J.split("");
        String[] a2 = S.split("");
        int result = 0;
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i].equals(a2[j])) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
