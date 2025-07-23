import java.util.Scanner;

public class ProductOfFloatingPoints {
    public static void main (String [] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter the First Floating Points Numbers: ");
        int num1= scanner.nextInt();

        System.out.println("Enter the Second Floating Points Numbers: ");
        int num2= scanner.nextInt();

        System.out.println("Product: " +(num1 * num2));
    }
    
}
