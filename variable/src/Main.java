//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//            int x;       // declaration
//            x = 123;     // assignment
        int i = 123; // initialization
        System.out.println("the number is: " + i);

        long e = 1423412341234123412L; // long number must end with "L"
        byte z = 120; // byte can be -128 to 128
        float t = 3.14F; // float number must end with "F"
        double d = 3.14323; // more precision than float
        boolean b = true; // can only store true or false
        char c = 'c'; // just one character, and must use single quote
        String s = "hello"; // can have more than one character, must use double quote
        System.out.println(s);

        String x = "water";
        String y = "kool-aid";
        String temp;

        temp = x;
        x = y;
        y = temp;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        }
    }