import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        System.out.println(z); // = 3.14
        double c = Math.sqrt(x);
        double b = Math.min(x, y);
        System.out.println(c); // = 1.772004514666935
        System.out.println(b); // = -10.0
        double m = Math.round(x);
        System.out.println(m); // = 3.0
        System.out.println(Math.ceil(x));  // = 4.0
        System.out.println(Math.floor(x)); // = 3.0

        // calculate hypotenuse
        double f;
        double g;
        double h;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side f: ");
        f = scanner.nextDouble();
        System.out.println("Enter side g: ");
        g = scanner.nextDouble();

        h = Math.sqrt((f*f) + (g*g));
        System.out.println("The hypotenuse is: " + h);
        scanner.close();
    }
}