public class Main {
    public static void main(String[] args) {
        // inheritance = the process where one class acquries,
        //                the attributes and methods of another.
        Car car = new Car();
        car.go();

        Bicycle  bicycle = new Bicycle();
        bicycle.stop();

        System.out.println(car.doors); // = 4
        System.out.println(bicycle.pedals); // = 2
    }
}