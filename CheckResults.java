public class CheckResults {
    private static int counter=0;

    public static void main(String[] args) {
        new Thread(){
            public void run(){
                for (int i = 0; i < 100; i++) {
                    CheckResults.counter++;

                }
            }
        }.start();
        while (CheckResults.counter<100){
            System.out.println("Not ready");
        }
        System.out.println("Ready");
    }
}
