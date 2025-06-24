//public class Main {
//    public static void main(String[] args) {
//        // generics = enable types (classes and interfaces) to be parameters when defining:
//        //            classes, interfaces and methods
//        //            a benefit is to eliminate the need to create multiple versions
//        //            of methods or classes for various data types.
//        //            Use 1 version for all reference data types
//
////        Integer[] intArray = {1,2,3,4,5};
////        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
////        Character[] charArray = {'a','b','c','d','e'};
////        String[] stringArray = {"B", "Y", "E"};
////
//////        displayArray(intArray);
//////        displayArray(doubleArray);
//////        displayArray(charArray);
//////        displayArray(stringArray);
////        System.out.println(getFirst(intArray));
////        System.out.println(getFirst(doubleArray));
////        System.out.println(getFirst(charArray));
////        System.out.println(getFirst(stringArray));
////    }
////
////    public static <Thing> void displayArray(Thing[] array){
////        for (Thing x: array){
////            System.out.print(x+" ");
////        }
////        System.out.println();
////    }
////
////    public static <Thing> Thing getFirst(Thing[] array){
////        return array[0];
////    }
//
//
//        Player player = new Player();
//        Enemy enemy = new Enemy();
//        Item item = new Item();
//        Tree tree = new Tree();
//
//        draw(player);
//        draw(enemy);
//        draw(item);
//        draw(tree);
//
//
//    }
//    public static <Thing> void draw(Thing x){
//        x.draw();
//    }
//}

public class Main {
    public static void main(String[] args) {
        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1, 9);
        MyGenericClass<Double, Double> myDouble  = new MyGenericClass<>(1.0, 23.00);
        MyGenericClass<Character, Character> myChar  = new MyGenericClass<>('a', 'b');
        MyGenericClass<String, String> myString  = new MyGenericClass<>("abc", "He lloo ");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

        // bounded types = you can create the objects of a generic class to have data
        //                 of specific derived types ex.Number
        MyGenericClass2<Integer, Integer> myInt2 = new MyGenericClass2<>(122, 922);
        MyGenericClass2<Double, Double> myDouble2  = new MyGenericClass2<>(12.0, 232.00);

        System.out.println(myInt2.getValue());
        System.out.println(myDouble2.getValue());
    }
}