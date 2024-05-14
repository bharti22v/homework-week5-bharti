package calculate;
/**
 * Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator obj1 = new Calculator();
        char choice;
        do{
            System.out.println("Enter first Number: ");
            int a = scanner.nextInt();
            System.out.println("Enter second Number: ");
            int b = scanner.nextInt();
            System.out.println("Please enter one of symbol +,-,*,/: ");
            char symbol = scanner.next().charAt(0);
            obj1.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation? Please enter 'Y' or 'N' : ");
            choice = scanner.next().charAt(0);
        }
        //while-loop
        while(choice == 'Y' || choice == 'y');
        System.out.println("Program terminated.");
        scanner.close();
    }
}
