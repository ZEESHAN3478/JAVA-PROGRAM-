import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter asecond numbers: ");
        int num2 = scanner.nextInt();

        while(num2 != 0){
        int temp = num2;
        num2 = num1 % num2;
        num1 = temp;
        }
     System.out.println(" GCD is :" +num1);

     scanner.close();
    }  
}
