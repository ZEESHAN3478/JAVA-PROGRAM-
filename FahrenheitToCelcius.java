import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the Temperature of the Fahrenheit: ");
    double Fahrenheit = scanner.nextDouble();

     double celcius = (Fahrenheit - 32) * 5 / 9;

     System.out.println("Temperature in Celcius: " + celcius);
    }
}
