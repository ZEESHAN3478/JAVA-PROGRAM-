import java.util.Scanner;

public class SimpleInterst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Principal Amount: ");
        double Principal = scanner.nextDouble();

        System.out.println("Enetr the rate of the interest: ");
        double rate = scanner.nextDouble();

        System.out.println("Enter the time in year: ");
        double time = scanner.nextDouble();

        double SimpleInterst = (Principal * rate * time) / 100;
        System.out.println("SimpleInterest: " + SimpleInterst);
        
    }
    
}
