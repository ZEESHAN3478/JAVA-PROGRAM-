import java.util.Scanner;

public class PrimeCheck {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        int num = scanner.nextInt();
        boolean isPrime = num > 1;

        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println(num + " is " + (isPrime ? " a prime number " : " not a prime number"));
        scanner.close();
    }
    
}
