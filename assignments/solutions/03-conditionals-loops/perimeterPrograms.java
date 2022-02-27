// Perimeter Programs

import java.util.*;

public class perimeterPrograms {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Perimeter Programs\n");
        System.out.println("1. Perimeter of Circle");
        System.out.println("2. Perimeter of Equilateral Triangle");
        System.out.println("3. Perimeter of Parallelogram");
        System.out.println("4. Perimeter of Rectangle");
        System.out.println("5. Perimeter of Square");
        System.out.println("6. Perimeter of Rhombus");
        System.out.print("\nEnter choice number from above: ");

        int choice = scan.nextInt();
        System.out.println();

        perimeterCalculator(choice);
    }

    static void perimeterCalculator (int choice) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14;

        switch (choice) {
            case 1: System.out.println("1. Perimeter of Circle");
                System.out.print("Enter radius of circle: ");
                float radius = scan.nextFloat();
                System.out.printf("Perimeter of Circle with radius: %.2f = %.2f\n", radius, (2 * pi * radius));
                break;

            case 2: System.out.println("2. Perimeter of Equilateral Triangle");
                System.out.print("Enter side of triangle: ");
                float side = scan.nextFloat();
                System.out.printf("Perimeter of Equilateral Triangle with side: %.2f = %.2f\n", side, (3 * side));
                break;
                
            case 3: System.out.println("3. Perimeter of Parallelogram");
                System.out.print("Enter length of 1st side of parellelogram: ");
                float side1 = scan.nextFloat();
                System.out.print("Enter length of 2nd side of parellelogram: ");
                float side2 = scan.nextFloat();
                System.out.printf("Perimeter of Parallelogram with sides: %.2f & %.2f = %.2f\n", side1, side2, (2 * (side1 + side2)));
                break;
                
            case 4: System.out.println("4. Perimeter of Rectangle");
                System.out.print("Enter length of side of Rectangle: ");
                float length = scan.nextFloat();
                System.out.print("Enter breadth of side of Rectangle: ");
                float breadth = scan.nextFloat();
                System.out.printf("Perimeter of Rectangle with length: %.2f & breadth: %.2f = %.2f\n", length, breadth, (2 * (length + breadth)));
                break;
                
            case 5: System.out.println("5. Perimeter of Square");
                System.out.print("Enter length of side of Square: ");
                float sq_side = scan.nextFloat();
                System.out.printf("Perimeter of Square with sides of length: %.2f = %.2f\n", sq_side, (4 * sq_side));
                break;
                
            case 6: System.out.println("6. Perimeter of Rhombus");
                System.out.print("Enter length of side of Rhombus: ");
                float rh_side = scan.nextFloat();
                System.out.printf("Perimeter of Rhombus with sides of length: %.2f = %.2f\n", rh_side, (4 * rh_side));
                break;
                
            default: System.out.println("Invalid choice!");
                break;
        }
    }
}

/*
Output:
Perimeter Programs

1. Perimeter of Circle
2. Perimeter of Equilateral Triangle
3. Perimeter of Parallelogram
4. Perimeter of Rectangle
5. Perimeter of Square
6. Perimeter of Rhombus
Enter choice number from above: 1

1. Perimeter of Circle
Enter radius of circle: 3
Perimeter of Circle with radius: 3.00 = 18.84

2. Perimeter of Equilateral Triangle
Enter side of triangle: 5.5
Perimeter of Equilateral Triangle with side: 5.50 = 16.50

3. Perimeter of Parallelogram
Enter length of 1st side of parellelogram: 12
Enter length of 2nd side of parellelogram: 8
Perimeter of Parallelogram with sides: 12.00 & 8.00 = 40.00

4. Perimeter of Rectangle
Enter length of side of Rectangle: 10
Enter breadth of side of Rectangle: 7
Perimeter of Rectangle with length: 10.00 & breadth: 7.00 = 34.00

5. Perimeter of Square
Enter length of side of Square: 15
Perimeter of Square with sides of length: 15.00 = 60.00

6. Perimeter of Rhombus
Enter length of side of Rhombus: 8 
Perimeter of Rhombus with sides of length: 8.00 = 32.00

Enter choice number from above: 8

Invalid choice!

*/