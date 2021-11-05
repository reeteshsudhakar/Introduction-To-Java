package unit5.cond;

import java.util.Scanner;

public class conditional_statements {
    public static void main(String[] args) {
        /*
        >   greater than
        <   less than
        >=  greater than or equal to
        <=  less than or equal to
        ==  equal to
        !=  not equal to



        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        if (10 > 5) ;
        {

            System.out.println(4);
            System.out.println(5);
            System.out.println(6);

        }

        System.out.println(7);
        System.out.println(8);
        System.out.println(9);

        */

        Scanner scanner = new Scanner (System.in);
        System.out.println("Welcome to SuperFast Rollercoaster!");
        System.out.println("Please enter your height in centimeters.");

        int height = scanner.nextInt ();

        if (height >= 130 && height <= 210) {
            System.out.println("Your height is accepted. Go ahead.");
        }
        else {
            System.out.println("Sorry, you are too short to ride.");
        }


    }
}
