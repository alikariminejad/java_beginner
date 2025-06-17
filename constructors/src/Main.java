public class Main {
    public static void main(String[] args) {
        // constructor = special method that is called when an object is instantiated(created)
        Human human1 = new Human("Rick", 65, 70);
        Human human2 = new Human("Ali", 27, 74);
        System.out.println(human1.name); // = Rick
        System.out.println(human2.name); // = Ali
        human1.eat(); // = Rick is eating
        human2.drink(); // = Ali is drinking
    }
}