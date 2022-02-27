// Surface Area Programs

import java.util.*;

public class surfaceAreaPrograms {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Surface Area Programs\n");
        System.out.println("1. Curved Surface Area Of Cylinder");
        System.out.println("2. Total Surface Area Of Cube");
        System.out.print("\nEnter choice number from above: ");

        int choice = scan.nextInt();
        System.out.println();

        surfaceAreaCalculator(choice);
    }

    static void surfaceAreaCalculator (int choice) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14;

        switch (choice) {
            case 1: System.out.println("1. Curved Surface Area Of Cylinder");
                System.out.print("Enter radius of base of Cylinder: ");
                float radius = scan.nextFloat();
                System.out.print("Enter height of Cylinder: ");
                float height = scan.nextFloat();
                System.out.printf("Curved Surface Area Of Cylinder with radius: %.2f & height: %.2f = %.2f\n", radius, height, (2 * pi * radius * height));
                break;

            case 2: System.out.println("2. Total Surface Area Of Cube");
                System.out.print("Enter length of side of Cube: ");
                float sideLength = scan.nextFloat();
                System.out.printf("Total Surface Area Of Cube with side of length: %.2f = %.2f\n", sideLength, (6 * sideLength * sideLength));
                break;
                
            default: System.out.println("Invalid choice!");
                break;
        }
    }
}

/*
Output:

Surface Area Programs

1. Curved Surface Area Of Cylinder
2. Total Surface Area Of Cube

Enter choice number from above: 1

1. Curved Surface Area Of Cylinder
Enter radius of base of Cylinder: 2
Enter height of Cylinder: 6
Curved Surface Area Of Cylinder with radius: 2.00 & height: 6.00 = 75.36

2. Total Surface Area Of Cube
Enter length of side of Cube: 8
Total Surface Area Of Cube with side of length: 8.00 = 384.00

Enter choice number from above: 6

Invalid choice!
*/