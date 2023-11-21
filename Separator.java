public class Separator {
    int[] arr;

    public Separator(int[] arr) {
        this.arr = arr;
    }

    public int[] even() {
        int[] evenArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArray[i] = arr[i];
            }
        }
        return evenArray;
    }

    public int[] odd() {
        int[]oddArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddArray[i] = arr[i];
            }
        }
        return oddArray;
    }
}
