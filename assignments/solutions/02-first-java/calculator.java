// Calculator program

import java.util.*;

public class calculator {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);

        float result = 0;
        
        while (true) {
            System.out.println("\nCalculator");
            System.out.println("Enter any of the operators: '+', '-', '*','/','%'\nEnter x to close the program");
            System.out.print("Enter operator: ");
            char operator = scan.next().trim().charAt(0);

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                System.out.print("Enter 1st number: ");
                float num1 = scan.nextFloat();
                System.out.print("Enter 2nd number: ");
                float num2 = scan.nextFloat();

                switch (operator) {
                    case '+': result = num1 + num2;
                        break;
                    case '-': result = num1 - num2;
                        break;
                    case '*': result = num1 * num2;
                        break;
                    case '/': if (num2 != 0) result = num1 / num2;
                        break;
                    case '%': result = num1 % num2;
                        break;
                    default: result = -1;
                        break;
                }
                System.out.println("Result: " + result);
            }
            else if (operator == 'x' || operator == 'X') {
                break;
            }
            else {
                System.out.println("Invalid Operator");
            }
        }
    }
}

/*
Output:

Calculator
Enter any of the operators: '+', '-', '*','/','%'
Enter x to close the program
Enter operator: 4
Invalid Operator

Calculator
Enter any of the operators: '+', '-', '*','/','%'
Enter x to close the program
Enter operator: +         
Enter 1st number: 3
Enter 2nd number: 5
Result: 8.0

Calculator
Enter any of the operators: '+', '-', '*','/','%'
Enter x to close the program
Enter operator: *        
Enter 1st number: 5
Enter 2nd number: 5
Result: 25.0

Calculator
Enter any of the operators: '+', '-', '*','/','%'
Enter x to close the program
Enter operator: 4
Invalid Operator

Calculator
Enter any of the operators: '+', '-', '*','/','%'
Enter x to close the program
Enter operator: x
*/