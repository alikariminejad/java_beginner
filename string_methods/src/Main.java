import javax.naming.Name;

public class Main {
    public static void main(String[] args) {
        // string = a reference data type that can store one or more characters
        //          reference data types have access to useful methods
        String name = "Bro";
//        boolean result = name.equals("Bro"); // = true
//        boolean result = name.equalsIgnoreCase("bro"); // = true
//        int result = name.length(); // = 3
//        char result = name.charAt(0); // = B
//        int result = name.indexOf("o"); // = 2
//        boolean result = name.isEmpty(); // = false
//        String result = name.toUpperCase(); // = BRO
//        String result = name.toLowerCase(); // bro
//        String name = "   Bro   ";
//        String result = name.trim(); // = Bro (it removes spaces before and after the string
        String result = name.replace("r", "R"); // BRo

        System.out.println(result);
    }
}