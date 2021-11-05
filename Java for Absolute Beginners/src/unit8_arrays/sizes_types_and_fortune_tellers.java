package unit8_arrays;

import java.util.Scanner;

public class sizes_types_and_fortune_tellers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] predictions = new String[3];
        predictions[0] = "a pioneer.";
        predictions[1] = "loved by many.";
        predictions[2] = "very wealthy.";

        System.out.println("I will predict your future. Type 1, 2, or 3: ");
        int choice = scanner.nextInt();

        System.out.println("In your future you will be " + predictions[choice - 1]);
    }
}
