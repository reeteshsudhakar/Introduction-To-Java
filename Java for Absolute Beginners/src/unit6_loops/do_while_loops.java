package unit6_loops;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class do_while_loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String again;
        do {
            int num = ThreadLocalRandom.current().nextInt(1, 7);
            System.out.println("You rolled a " + num + ".");
            System.out.println("Roll again? y/n: ");
            again = scanner.next();
        } while (again.equals("y"));
    }

}
