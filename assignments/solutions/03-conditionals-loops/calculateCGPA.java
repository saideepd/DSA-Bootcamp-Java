// Calculate CGPA Program

import java.util.Scanner;

public class calculateCGPA {
    public static void main (String args[]) {
        double marks = 0, sum = 0, grade = 0, count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("CGPA Calculator\n");
        System.out.println("Enter -1 to stop input");
        System.out.println("Enter marks:");

        while ((marks = scan.nextInt()) != -1) {
            sum += marks / 10;
            count++;
        }
        
        grade = sum / count;
        System.out.print("CGPA: " + grade + "\n");
        System.out.print("Percentage: " + (grade * 7.25 + 11) + "\n");
    }
}

/*
Output:

CGPA Calculator

Enter -1 to stop input
Enter marks:
80
74
40
65
72
-1
CGPA: 6.62
Percentage: 58.995
*/