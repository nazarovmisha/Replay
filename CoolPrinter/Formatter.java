package CoolPrinter;

public interface Formatter {
    default String format(String line) {
        return line = "** " + line + " **";
    }
}