package unit9_methods;

public class class_and_static_numbers {

    static int x = 5;

    public static void main(String[] args) {

        System.out.println(x);
        foo();
        bar();
    }

    static void foo() {
        System.out.println(x);
        x = 10;
    }

    static void bar() {
        System.out.println(x);
    }
}
