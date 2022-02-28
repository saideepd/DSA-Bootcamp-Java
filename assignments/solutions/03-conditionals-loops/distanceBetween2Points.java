// Calculate Distance Between Two Points 

import java.util.Scanner;

public class distanceBetween2Points {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Distance Between 2 Points");
        int x1, x2, y1, y2;
        System.out.print("Enter x1: ");
        x1 = scan.nextInt();
        System.out.print("Enter x2: ");
        x2 = scan.nextInt();
        System.out.print("Enter y1: ");
        y1 = scan.nextInt();
        System.out.print("Enter y2: ");
        y2 = scan.nextInt();

        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.printf("Distance between (%d, %d) and (%d, %d) = %f\n", x1, y1, x2, y2, distance);
    }
}

/*
Output:

Distance Between 2 Points
Enter x1: 5
Enter x2: 3
Enter y1: 7
Enter y2: 3
Distance between (5, 7) and (3, 3) = 4.472136
*/