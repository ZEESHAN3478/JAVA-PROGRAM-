import java.util.Scanner;

public class ArithmaticOperators {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a 1st  number: ");
        double num1 =scanner.nextDouble();

        System.out.println("enter a 2nd number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Addition : " + (num1 + num2));
        System.out.println("Subtraction : " + (num1 - num2));
        System.out.println("Multiplication : " + (num1 * num2));
        System.out.println("Division : " + (num1 / num2));
        System.out.println("Modulus : " + (num1 % num2));

    }
}
