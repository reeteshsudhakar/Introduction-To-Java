package unit9_methods;

public class returning_data_from_methods {
    public static void main(String[] args) {
        foo(3);
        int val = bar();
        System.out.println(val);
        System.out.println(bars());
    }

    public static void foo(int a) {
        if (a < 5) {
            return;
        }

        System.out.println(a);
    }

    public static int bar() {
        return 49;
    }

    public static double bars() {
        return 49.5;
    }
}
