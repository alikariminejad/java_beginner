public class Main {
    public static void main(String[] args) {
        // abstract = abstract classes cannot be instantiated, but they can have a subclass
        //            abstract methods are declared without an implementation
        //            but the subclass must have an implementation of the abstract method
//        Vehicle vehicle = new Car();
        Car car = new Car();
        car.go();
    }
}