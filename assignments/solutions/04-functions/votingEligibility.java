// A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;
public class votingEligibility {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Check Voting Eligibility");
        System.out.print("\nEnter age of person: ");
        int age = scan.nextInt();

        boolean isEligibile = isEligibile(age);
        if (isEligibile)
            System.out.println("Congratulations! You're eligibile to vote.");
        else
            System.out.println("Unfortunately you're not eligibile to vote. You should be either 18 years old or older than 18 years to be eligible to vote.");
    }

    static boolean isEligibile(int age) {
        return age >= 18;
    }

}

/*
Output:

Check Voting Eligibility

Enter age of person: 14
Unfortunately you're not eligibile to vote. You should be either 18 years old or older than 18 years to be eligible to vote.

Enter age of person: 20
Congratulations! You're eligibile to vote.

Enter age of person: 18
Congratulations! You're eligibile to vote.
*/