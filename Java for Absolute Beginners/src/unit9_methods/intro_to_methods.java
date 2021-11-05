package unit9_methods;

public class intro_to_methods {
    public static void main(String[] args) {

        System.out.println(19);
        bar();
        foo();
        System.out.println(24);
    }

    public static void foo() {
        int x = 50;
        System.out.println(x);
        System.out.println(16);
    }

    public static void bar() {
        foo();
        System.out.println(12);
    }
}
