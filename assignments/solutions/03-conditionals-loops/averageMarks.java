// Calculate Average Marks

import java.util.Scanner;

public class averageMarks {
    public static void main (String args[]) {
        int sum = 0, input = 0, count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Average Marks\n");
        System.out.println("Enter -1 to stop input");
        // int input = scan.nextInt();
        while ((input = scan.nextInt()) != -1) {
            sum += input;
            count++;
        }
        double average = sum / count;
        System.out.print("Average Marks: " + average + "\n");
    }
}

/*
Output:

Average Marks

Enter -1 to stop input
20
10
13
19
17
14
7
10
16
20
18
-1
Average Marks: 14.0
*/