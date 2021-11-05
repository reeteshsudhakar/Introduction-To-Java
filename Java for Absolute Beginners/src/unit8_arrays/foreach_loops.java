package unit8_arrays;

public class foreach_loops {
    public static void main(String[] args) {
        double [] da = new double[] {25.92, 1.34, -76.24, 833.11, 76.084};

        // the var types need to match at the top and bottom.

        for (double e : da) {
            System.out.println(e);
        }
    }
}
