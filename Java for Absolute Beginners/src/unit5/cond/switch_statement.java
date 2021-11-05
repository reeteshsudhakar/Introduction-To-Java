package unit5.cond;

import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number. ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("You entered one.");
                break;
            case 2:
                System.out.println("You entered two.");
                break;
            default:
                System.out.println("Invalid number.");
                break;
        }
        /*if (num == 1) {
            System.out.println("You entered one.");
        }
        else if (num == 2) {
            System.out.println("You entered two.");
        }
        else {
            System.out.println("Invalid number.");
        }*/
    }
}
