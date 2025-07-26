import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;

        int sum = 0;
        int length = String.valueOf(num).length();

        while(num != 0){
            int digit = num % 10;
            sum += Math.pow(digit,length);
            num/= 10;
        }

        System.out.println(originalNum + " is " + (sum == originalNum ? " an Armstrong number " : "not an Armstrong numbrer"));
        scanner.close();
    }
    
}
