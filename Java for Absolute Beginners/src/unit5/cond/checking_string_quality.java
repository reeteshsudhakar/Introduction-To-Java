package unit5.cond;

import java.util.Scanner;
public class checking_string_quality {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("THE VIP LOUNGE");

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.println("Do you have a VIP Pass? yes/no: ");

        String vipPassReply = scanner.next ();

        // nested if statement

        if (age >= 18 && age <= 70) {
            if (vipPassReply.equals("yes")) {
                System.out.println("Thanks, go on in.");
            } else {
                System.out.println("Sorry, you must have a VIP Pass.");
            }
        }
        else if (age >= 70) {
            System.out.println("Thanks, go on in.");
        }
        else {
            System.out.println("Sorry, you are not allowed to enter.");
        }
     /* if (age >= 70 || (age >= 18 && vipPassReply.equals("yes"))) {
            System.out.println("Thanks, go on in.");
        }
        else {
            System.out.println("Sorry, no can do.");
        }*/
    }
}
