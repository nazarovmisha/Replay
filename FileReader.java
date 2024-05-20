import java.io.*;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("Input.txt");
        Scanner in = new Scanner(new FileInputStream(file));
        System.out.println(in.nextInt() + in.nextInt());

    }
}


