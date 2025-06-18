public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("Chevrolet", "Camaro", 2024);
//        Car car2 = new Car("Ford", "Mustang", 2025);
//        car2.copy(car1); // it's not a good practice to copy car1 like this: car2 = car1, it saves car1 and car2 at the same address with different names
        // another way is:
        Car car2 = new Car(car1);
        System.out.println(car1.getMake()); // = Chevrolet
        System.out.println(car1.getModel()); // = Camaro
        System.out.println(car1.getYear()); // = 2024
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}