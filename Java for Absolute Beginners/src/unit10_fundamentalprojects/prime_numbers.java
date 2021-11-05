package unit10_fundamentalprojects;

import java.util.Scanner;

public class prime_numbers {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Enter a number, and this program will return all prime numbers up through your input. ");
        num = scanner.nextInt();

        for (int i = 2; i < num; i++) {
            boolean isPrime = true;

            for (int div = 2; div < i; div++) {

                if(i % div == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }

    }
}
