// Calculate Batting Average

import java.util.Scanner;

public class battingAverage {
    public static void main (String args[]) {
        int totalRuns = 0, innings = 0, notOut = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Batting Average\n");
        
        System.out.print("Enter Player's Name: ");
        String name = scan.nextLine();
        
        System.out.print("\nEnter Total Runs scored by " + name + ": ");
        totalRuns = scan.nextInt();
        
        System.out.print("\nEnter Total Innings played by " + name + ": ");
        innings = scan.nextInt();
        
        System.out.print("\nEnter No of Innings for which " + name + " was Not Out: ");
        notOut = scan.nextInt();

        double battingAvg = totalRuns / (innings - notOut);
        System.out.println("Batting Average of " + name + ": " + battingAvg);
    }
}

/*
Output:

Batting Average

Enter Player's Name: MS Dhoni

Enter Total Runs scored by MS Dhoni: 500

Enter Total Innings played by MS Dhoni: 12

Enter No of Innings for which MS Dhoni was Not Out: 1
Batting Average of MS Dhoni: 45.0
*/