import java.util.Scanner;  

public class StringManipulation {  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        String input;  
        char choice;  

        System.out.println("Welcome to the String Manipulation Program!");  
        
        do {  
            System.out.print("Enter a string: ");  
            input = scanner.nextLine();  

            System.out.println("Choose an operation:");  
            System.out.println("1. Reverse the string");  
            System.out.println("2. Convert to uppercase");  
            System.out.println("3. Convert to lowercase");  
            System.out.println("4. Check if the string is a palindrome");  
            System.out.println("5. Exit");  
            System.out.print("Enter your choice (1-5): ");  
            choice = scanner.nextLine().charAt(0);  

            switch (choice) {  
                case '1':  
                    System.out.println("Reversed String: " + reverseString(input));  
                    break;  
                case '2':  
                    System.out.println("Uppercase: " + input.toUpperCase());  
                    break;  
                case '3':  
                    System.out.println("Lowercase: " + input.toLowerCase());  
                    break;  
                case '4':  
                    if (isPalindrome(input)) {  
                        System.out.println("The string is a palindrome.");  
                    } else {  
                        System.out.println("The string is not a palindrome.");  
                    }  
                    break;  
                case '5':  
                    System.out.println("Exiting the program.");  
                    break;  
                default:  
                    System.out.println("Invalid choice! Please choose a number between 1 and 5.");  
                    break;  
            }  
            System.out.println(); // Print a blank line for better readability  
        } while (choice != '5');  

        scanner.close();  
    }  

    // Method to reverse a string  
    private static String reverseString(String input) {  
        char[] charArray = input.toCharArray();  
        String reversed = "";  

        for (int i = charArray.length - 1; i >= 0; i--) {  
            reversed += charArray[i]; // Concatenating in reverse order  
        }  

        return reversed;  
    }  

    // Method to check if a string is a palindrome  
    private static boolean isPalindrome(String input) {  
        String reversed = reverseString(input);  
        return input.equalsIgnoreCase(reversed); // Ignore case for palindrome check  
    }  
}


    

