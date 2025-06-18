import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // exception = an event that occurs during the execution of a program that,
        //              disrupts the normal flow of instructions
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("Result is: " + z);
        }
        catch (ArithmeticException e) {
            System.out.println("You have entered an invalid number.");
        }
        catch (InputMismatchException e) {
            System.out.println("You have entered an invalid value.");
        }
        catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        finally {
            System.out.println("Bye!");
            scanner.close();
        }
    }
}