import java.util.Scanner;
public class SumOddNumbers {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a numbers:");
        int N = scanner.nextInt();
        int sumofOdds = 0;

        for (int i = 1; i <= N; i += 2){
            sumofOdds += i;
        }

        System.out.println("Sum of odd numbers from 1 to " + N + "is: " +sumofOdds);

        scanner.close();
    }
    
}
