import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        while (a <= n) {
            System.out.println(a + " ");
                int next = a + b;
                
                a = b;
                b = next;
        }

        scanner.close();
    }
    
}
