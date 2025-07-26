import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int reserved = 0;

        while (num != 0){
            int digit = num % 10;
            reserved = reserved * 10 + digit;
            num /= 10;
        }
        System.out.println("Reserved number is: " +reserved);
        scanner.close();
    }
    
}
