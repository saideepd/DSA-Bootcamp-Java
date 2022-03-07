/*
Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 
*/

import java.util.Scanner;

public class gradeByMarks {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Find Grade by Marks of Student");
        System.out.print("\nEnter marks score by student: ");
        int marks = scan.nextInt();
        System.out.println("Grade: " + getGrade(marks));
    }

    private static String getGrade(int marks) {
        if (marks <= 40)
            return "Fail";
        else if (marks <= 50)
            return "DD";
        else if (marks <= 60)
            return "CD";
        else if (marks <= 70)
            return "BC";
        else if (marks <= 80)
            return "BB";
        else if (marks <= 90)
            return "AB";
        else if (marks <= 100)
            return "AA";
        else
            return "Extra Marks for good handwriting :)";
    }
}

/**
 * Output:
 * 
 * Find Grade by Marks of Student
 * Enter marks score by student: 50
 * Grade: DD
 * 
 * Enter marks score by student: 87
 * Grade: AB
 * 
 * Enter marks score by student: 94
 * Grade: AA
 * 
 * Enter marks score by student: 38
 * Grade: Fail
 */