public class Years {
    public static void main(String[] args) {
        years(2028);
    }

    public static void years(int year) {
        if (year % 400 == 0 || year % 4 == 0) {
            System.out.println("This year is a leap year");
        } else if (year % 100 == 0) {
            System.out.println("This year is a leap year");
        } else {
            System.out.println("This year is not a leap year");
        }
    }
}
