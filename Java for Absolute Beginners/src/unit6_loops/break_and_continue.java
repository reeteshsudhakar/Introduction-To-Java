package unit6_loops;

public class break_and_continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i ++) {
            if (i == 3) {
                continue;
                // the 3 doesn't get printed because the continue returns to the top of the for loop.
            }
            System.out.println(i);
        }
    }
}
