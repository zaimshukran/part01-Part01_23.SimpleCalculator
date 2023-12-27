
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int input1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number: ");
        int input2 = Integer.parseInt(scanner.nextLine());
        System.out.println(input1 + " + " + input2 + " = " + (input1+input2));
        System.out.println(input1 + " - " + input2 + " = " + (input1-input2));
        System.out.println(input1 + " * " + input2 + " = " + (input1*input2));
        System.out.println(input1 + " / " + input2 + " = " + (1.0 * input1/input2));
    }
}
