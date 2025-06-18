public class Main {
    public static void main(String[] args) {
        // Encapsulation = attributes of a class will be hidden or private,
        //                 Can be accessed only through methods (getters & setters)
        //                 You should make attributes private if you don't have a reason to make them public/protected

        Car car = new Car("Chevrolet", "Camaro", 2024);
//        System.out.println(car.make); // = error: make has private access in Car
        System.out.println(car.getMake()); // = Chevrolet
        System.out.println(car.getModel()); // = Camaro
        System.out.println(car.getYear()); // = 2024
//        car.year = 2024; // = error: year has private access in Car
        car.setYear(2025);
        System.out.println(car.getYear());
    }
}