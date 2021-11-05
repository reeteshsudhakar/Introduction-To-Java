package unit3_user;

import java.util.Scanner;

public class user_inputs {

    public static void main(String[] args) {
        /*System.out.println(4.5 - 2.7);
        System.out.format("When Formatted: %.1f", 4.5-2.7);*/

        Scanner scanner = new Scanner (System.in);

        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.println( userName + " is a nice name!");
        System.out.println();

        System.out.println("How old are you, " + userName + "?");
        int userAge = scanner.nextInt();
        System.out.println("Your name is " + userName + " and you are " + userAge + " years old.");
        System.out.println();

        System.out.println("How tall are you, in meters?");
        double userHeight = scanner.nextDouble();
        System.out.println("Wow, you are " + userHeight + " meters tall.");
        System.out.println();

        System.out.println("What is one word that defines you?");
        String userIdentity = scanner.next();

        System.out.println("You name is " + userName + ", you are " + userAge + " years old, and you think that the word that defines you is " + userIdentity + ".");

        double averageMaleHeightDifference = userHeight - 1.75;
        double averageFemaleHeightDifference = userHeight - 1.62;
        System.out.println("\nThe difference between your height and the average is: ");
        System.out.format("%.2f meters if you are male.\n", averageMaleHeightDifference);
        System.out.format("%.2f meters if you are female.", averageFemaleHeightDifference);
        System.out.println();



    }

}
