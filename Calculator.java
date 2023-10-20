import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        calc();
    }
    public static void calc() {
        int count = 0;
        boolean on = true;
        int result = 0;
        int firstOperand ;
        while (on) {
            if (count == 0) {
                System.out.println("First operand");
                Scanner sc1 = new Scanner(System.in);
                firstOperand = sc1.nextInt();
            } else {
                firstOperand = result;
            }

            Scanner sc2 = new Scanner(System.in);
            System.out.println("Operand");
            String operand = sc2.next();
            if (operand.equals("c")) {
                on=false;
                break;
            } else if (operand.equals("s")) {
                calc();
            } else {

                Scanner sc3 = new Scanner(System.in);
                System.out.println("Second operand");
                int secondOperand = sc3.nextInt();

                count++;
                switch (operand) {
                    case "+":
                        result = firstOperand + secondOperand;
                        System.out.println(firstOperand + secondOperand);
                        break;
                    case "-":
                        result = firstOperand - secondOperand;
                        System.out.println(firstOperand - secondOperand);
                        break;
                    case "*":
                        result = firstOperand * secondOperand;
                        System.out.println(firstOperand * secondOperand);
                        break;
                    case "/":
                        result = firstOperand / secondOperand;
                        System.out.println(firstOperand / secondOperand);
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            }
        }
    }
}