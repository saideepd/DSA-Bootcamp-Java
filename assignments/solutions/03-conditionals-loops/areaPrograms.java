// Area Programs

import java.util.*;

public class areaPrograms {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Area Programs\n");
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Triangle");
        System.out.println("3. Area of Rectangle");
        System.out.println("4. Area of Isoceles Triangle");
        System.out.println("5. Area of Parallelogram");
        System.out.println("6. Area of Rhombus");
        System.out.println("7. Area of Equilateral Triangle");
        System.out.print("\nEnter choice number from above: ");

        int choice = scan.nextInt();
        System.out.println();

        areaCalculator(choice);
    }

    static void areaCalculator (int choice) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14;
        switch (choice) {
            case 1: System.out.println("1. Area of Circle");
                System.out.print("Enter Radius: ");
                float radius = scan.nextFloat();
                System.out.printf("Area of Circle with radius %.2f = %.2f\n", radius, (2 * pi * radius * radius));
                break;
            
            case 2: System.out.println("2. Area of Triangle");
                System.out.print("Enter base: ");
                float tri_base = scan.nextFloat();
                System.out.print("Enter height: ");
                float tri_height = scan.nextFloat();
                System.out.printf("Area of Triangle with base: %.2f and height: %.2f = %.2f\n", tri_base, tri_height, (0.5 * tri_base * tri_height));
                break;
            
            case 3: System.out.println("3. Area of Rectangle");
                System.out.print("Enter length: ");
                float length = scan.nextFloat();
                System.out.print("Enter breadth: ");
                float breadth = scan.nextFloat();
                System.out.printf("Area of Rectangle with length: %.2f and breadth: %.2f = %.2f\n", length, breadth, (length * breadth));
                break;
            
            case 4: System.out.println("4. Area of Isoceles Triangle");
                System.out.print("Enter base: ");
                float iso_base = scan.nextFloat();
                System.out.print("Enter height: ");
                float iso_height = scan.nextFloat();
                System.out.printf("Area of Isoceles Triangle with base: %.2f and height: %.2f = %.2f\n", iso_base, iso_height, (0.5 * iso_base * iso_height));
                break;
            
            case 5: System.out.println("5. Area of Parallelogram");
                System.out.print("Enter base: ");
                float base = scan.nextFloat();
                System.out.print("Enter height: ");
                float height = scan.nextFloat();
                System.out.printf("Area of Parallelogram with base: %.2f and height: %.2f = %.2f\n", base, height, (base * height));
                break;
            
            case 6: System.out.println("6. Area of Rhombus");
                System.out.print("Enter Diagonal 1: ");
                float d1 = scan.nextFloat();
                System.out.print("Enter Diagonal 2: ");
                float d2 = scan.nextFloat();
                System.out.printf("Area of Rhombus with Diagonals: %.2f and %.2f = %.2f\n", d1, d2, (0.5 * d1 * d2));
                break;
            
            case 7: System.out.println("7. Area of Equilateral Triangle");
                System.out.print("Enter length of side: ");
                float side = scan.nextFloat();
                System.out.printf("Area of Equilateral Triangle with sides of length: %.2f = %.2f\n", side, ((Math.sqrt(3)/4) * side * side));
                break;


            default: System.out.println("Invalid choice!");
                break;
        }
    }
}

/*
Output:

Area Programs

1. Area of Circle
2. Area of Triangle
3. Area of Rectangle
4. Area of Isoceles Triangle
5. Area of Parallelogram
6. Area of Rhombus
7. Area of Equilateral Triangle

Enter choice number from above: 1

1. Area of Circle
Enter Radius: 4
Area of Circle with radius 4.00 = 100.48

2. Area of Triangle
Enter base: 4
Enter height: 7
Area of Triangle with base: 4.00 and height: 7.00 = 14.00

3. Area of Rectangle
Enter length: 4
Enter breadth: 2
Area of Rectangle with length: 4.00 and breadth: 2.00 = 8.00

4. Area of Isoceles Triangle
Enter base: 5
Enter height: 6.4
Area of Isoceles Triangle with base: 5.00 and height: 6.40 = 16.00

5. Area of Parallelogram
Enter base: 8
Enter height: 5
Area of Parallelogram with base: 8.00 and height: 5.00 = 40.00

6. Area of Rhombus
Enter Diagonal 1: 6  
Enter Diagonal 2: 3
Area of Rhombus with Diagonals: 6.00 and 3.00 = 9.00

7. Area of Equilateral Triangle
Enter length of side: 3
Area of Equilateral Triangle with sides of length: 3.00 = 3.90

Enter choice number from above: 8

Invalid choice!

*/