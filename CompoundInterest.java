import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Principal Amount: ");
        double principal = scanner.nextDouble();

        System.out.println("Enetr the rate of the interest: ");
        double rate = scanner.nextDouble();

        System.out.println("Enter the time in year: ");
        double time = scanner.nextDouble();

        double CompoundInterst = principal * Math.pow((1 + rate / 100), time ) - principal;
        System.out.println("CompoundInterest: " + CompoundInterst);
        
    }
    
}
