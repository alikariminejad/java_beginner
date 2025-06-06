import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // while loop = executes a block of code as long as it's condition remains true
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while(name.isBlank()){
            System.out.println("Please enter your name: ");
            name = scanner.nextLine();
        }
        // the following code will execute once no matter if the condition is true or false
//        do(name.isBlank()){
//            System.out.println("Please enter your name: ");
//            name = scanner.nextLine();
//        }while
        System.out.println("Your name is: " + name);
    }
}