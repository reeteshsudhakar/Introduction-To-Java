package unit9_methods;

public class passing_data_to_methods {
    public static void main(String[] args) {
        int var;
        var = 5;
        foo(var, 57.5, "caramel");
    }

    public static void foo(int a, double b, String c) {
        System.out.println(a + b + c);
    }
}
