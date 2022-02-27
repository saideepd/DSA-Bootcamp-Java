// Volume Programs

import java.util.*;

public class volumePrograms {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Perimeter Programs\n");
        System.out.println("1. Volume Of Cone");
        System.out.println("2. Volume Of Prism");
        System.out.println("3. Volume Of Cylinder");
        System.out.println("4. Volume Of Sphere");
        System.out.println("5. Volume Of Pyramid");
        System.out.print("\nEnter choice number from above: ");

        int choice = scan.nextInt();
        System.out.println();

        volumeCalculator(choice);
    }

    static void volumeCalculator (int choice) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14;

        switch (choice) {
            case 1: System.out.println("1. Volume Of Cone");
                System.out.print("Enter radius of Cone: ");
                float radius = scan.nextFloat();
                System.out.print("Enter height of Cone: ");
                float height = scan.nextFloat();
                System.out.printf("Volume Of Cone with radius: %.2f & height: %.2f = %.2f\n", radius, height, (0.3333 * pi * radius * radius * height));
                break;

            case 2: System.out.println("2. Volume Of Prism");
                System.out.print("Enter base of triangular part of Prism: ");
                float pr_base = scan.nextFloat();
                System.out.print("Enter height of triangular part of Prism: ");
                float pr_height = scan.nextFloat();
                System.out.print("Enter length of Prism: ");
                float pr_length = scan.nextFloat();
                System.out.printf("Volume Of Prism with length: %.2f, triangular base: %.2f & height: %.2f = %.2f\n", pr_length, pr_base, pr_height, ((0.5 * pr_base * pr_height) * pr_length));
                break;
                
            case 3: System.out.println("3. Volume Of Cylinder");
                System.out.print("Enter radius of Cylinder: ");
                float cy_radius = scan.nextFloat();
                System.out.print("Enter height of Cylinder: ");
                float cy_height = scan.nextFloat();
                System.out.printf("Volume Of Cylinder with radius: %.2f & hieght: %.2f = %.2f\n", cy_radius, cy_height, (pi * cy_radius * cy_radius * cy_height));
                break;
                
            case 4: System.out.println("4. Volume Of Sphere");
                System.out.print("Enter radius of Sphere: ");
                float sph_radius = scan.nextFloat();
                System.out.printf("Volume Of Sphere with radius: %.2f = %.2f\n", sph_radius, (1.3333 * pi * sph_radius * sph_radius * sph_radius));
                break;
                
            case 5: System.out.println("5. Volume Of Pyramid");
                System.out.print("Enter base of triangular part of Pyramid: ");
                float py_base = scan.nextFloat();
                System.out.print("Enter slant height of Pyramid: ");
                float py_slant_height = scan.nextFloat();
                System.out.print("Enter height of Pyramid: ");
                float py_height = scan.nextFloat();
                System.out.printf("Volume Of Pyramid with base: %.2f, slant height: %.2f & height: %.2f = %.2f\n", py_base, py_slant_height, py_height, (0.3333 * (0.5 * py_base * py_height) * py_slant_height));
                break;
                
            default: System.out.println("Invalid choice!");
                break;
        }
    }
}

/*
Output:

Volume Programs

1. Volume Of Cone
2. Volume Of Prism
3. Volume Of Cylinder
4. Volume Of Sphere
5. Volume Of Pyramid

Enter choice number from above: 1

1. Volume Of Cone
Enter radius of Cone: 7
Enter height of Cone: 9
Volume Of Cone with radius: 7.00 & height: 9.00 = 461.53

2. Volume Of Prism
Enter base of triangular part of Prism: 3
Enter height of triangular part of Prism: 5
Enter length of Prism: 8
Volume Of Prism with length: 8.00, triangular base: 3.00 & height: 5.00 = 60.00

3. Volume Of Cylinder
Enter radius of Cylinder: 5
Enter height of Cylinder: 9
Volume Of Cylinder with radius: 5.00 & hieght: 9.00 = 706.50

4. Volume Of Sphere
Enter radius of Sphere: 6
Volume Of Sphere with radius: 6.00 = 904.30

5. Volume Of Pyramid
Enter base of triangular part of Pyramid: 4
Enter slant height of Pyramid: 10
Enter height of Pyramid: 12
Volume Of Pyramid with base: 4.00, slant height: 10.00 & height: 12.00 = 81.60

Enter choice number from above: 8

Invalid choice!
*/