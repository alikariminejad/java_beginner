
public class Main {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon
//        String name = "Bro";
//        int age = 26;
//        hello(name, age);
//        int x = 3;
//        int y = 4;
//        int sum = add(x, y);
//        System.out.println(sum);
//        System.out.println(add(x,y));

        // overloaded methods = methods that share the same name but have different parameters
        //                      method name + parameters = method signature
        int x = add(1,2); // it's using method add #1
        int y = add(1,2, 3); // it's using method add #2
        int z = add(1,2, 3, 4); // it's using method add #3
        double r = add(1.0,2.0); // it's using method add #4
        double t = add(1.0,2.0, 3.0); // it's using method add #5
        double g = add(1.0,2.0, 3.0, 4.0); // it's using method add #6
    }
    static int add(int a, int b){
        System.out.println("This is overloaded method #1");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is overloaded method #2");
        return a+b+c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This is overloaded method #3");
        return a+b+c+d;
    }
    static double add(double a, double b){
        System.out.println("This is overloaded method #4");
        return a+b;
    }
    static double add(double a, double b, double c){
        System.out.println("This is overloaded method #5");
        return a+b+c;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("This is overloaded method #6");
        return a+b+c+d;
    }
//    static int add(int a, int b){
//        return a + b;
//    }
//    static void hello(String name, Integer age){
//        System.out.println("hello " + name + "You are " + age + " years old");
//    }
}