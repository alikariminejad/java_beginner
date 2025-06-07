public class Main {
    public static void main(String[] args) {
        // array = used to store multiple values in single variable

        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
        cars[0] = "Mustang";
        System.out.println(cars[0]); // Mustang
        // there is another way to store values
        String[] newcars = new String[3]; // newcars variable can assign 3 strings
        newcars[0] = "Mustang";
        newcars[1] = "Corvette";
        newcars[2] = "Tesla";
        System.out.println(newcars[2]);
        for(int i=0;i<newcars.length; i++){
            System.out.println(newcars[i]);
        }

        // 2D = an array of arrays
        String[][] new_cars = {
                {"Camaro", "Corvette", "Tesla"},
                {"Mustang", "Ranger", "F-150"},
                {"Ferrari", "Lambo", "Tesla"}
        };
        for(int i=0; i<new_cars.length; i++){
            System.out.println();
            for(int j=0; j<new_cars[i].length; j++){
                System.out.print(new_cars[i][j] + " ");
            }
        }
    }
}