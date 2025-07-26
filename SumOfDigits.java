import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Numbers:");
        int num = Math.abs(scanner.nextInt());
        int sumOfODigits = 0;

        while(num != 0){
            SumOfDigits += num % 10;
            num /= 10;
        }

        System.out.println("Sum od digits is: " +SumOfDigits);
        scanner.close();
    }
    
}
