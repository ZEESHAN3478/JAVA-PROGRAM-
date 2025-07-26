import java.util.Scanner;
public class DaysInMonth {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int year = scanner.nextInt();

        System.out.println("Enter a Month (1-12):");
        int month = scanner.nextInt();
        int days;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 30;
                    break;
            case 2:
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                return true;
            } else {
                return false;
            }
        }
    }

    
}
