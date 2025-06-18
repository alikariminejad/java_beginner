import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // polymorphism = many shapes/forms
        // dynamic = after compilation (during runtime)
        // e.x A Corvette is a: corvette, and a car, and a vehicle, and an object
        Animal animal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What animal do you want?");
        System.out.print("(1=Dog) or (2=Cat): ");
        int choice = scanner.nextInt();
        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }
        else{
            animal = new Animal();
            System.out.println("Wrong choice");
            animal.speak();
        }
    }
}