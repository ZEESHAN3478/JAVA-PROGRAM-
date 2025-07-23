import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Lenght of the Rectangle: ");
        double Length = scanner.nextDouble();

        System.out.println("Entetr the Width of the Rectangle: ");
        double Width = scanner.nextDouble();

        double perimeter = 2 * (Length + Width);
        System.out.println("Perimeter of the Rectangle: " + perimeter);
    }
    
}
