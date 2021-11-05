package unit2_variables;

public class Variables {

    public static void main(String[] args) {
        // 8 primitive data types
        // byte, short, int, long, float, double, boolean, char
        // value ranges in order of the list above: -128 to 127, -32768 to 32767, -214783648 to 2147483647, -9223372036854775808 to 9223372036854775807, varies, varies, true/false, 0 to 65535
        // you can't use a variable before it is defined
        // i.e. you can't print x if you haven't defined it

        int a = 2;
        int b = 3;
        a = a + b + a;
        System.out.println(a);
        System.out.println(15 / 6);

        // 15/6 will output 2, but you have to put 15.0 if you want 2.5 to show up
        System.out.println(15.0/6);

        // the line above will print the right answer
        // int will have an output of 3 for 17/5 , but to get 3.4 ONE OR THE OTHER, DOESN'T HAVE TO BE BOTH, SHOULD BE A DOUBLE INSTEAD OF INT
        double c = 17;
        int d = 5;
        System.out.println(c / d);

        boolean e = false;
        System.out.println(e);
        char f = '\u005A' ;
        System.out.println(f);

        String g = "England is snowy!";
        System.out.println("Wow, " + g);

        // naming system: no spaces, first word is never capitalized, you should have it reflect whatever the variable represents i.e. "boolean hasDriversLicense"

        int foo = 5;
        double bar = foo;
        // this is an implicit tyoecast, but by using double the print for bar will be 5.0

        System.out.println(foo);
        System.out.println(bar);

        double yoo = 2.95;
        int tar = (int)yoo;

        System.out.println(yoo);
        System.out.println(tar);

        // the print for tar rounds down because the int for yoo takes the lowest whole number associated with the integer
        // thus, int tar = 2, and doube yoo = 2.95

        // let's say that you want an explicit answer but your variables have to be int, you can do this:

        int too = 17;
        int far = 4;

        System.out.println((double) too / far);

        // this typecasts the too variable and makes it into a double when the function occurs so that you get the most accurate answer

    }
}
