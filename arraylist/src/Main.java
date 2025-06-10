import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList = a resizable array.
        //             Elements can be added and removed after compilation phase
        //             store reference data types
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hotdog");
        food.set(0, "Sushi");
        food.remove(2);
        food.clear();
        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }

        // 2D ArrayList = a dynamic list of lists
        // You can change the size of these lists during runtime
        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("Pizza");
        bakeryList.add("Hamburger");
        bakeryList.add("Hotdog");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList); // = [[Pizza, Hamburger, Hotdog], [tomatoes, zucchini, peppers], [soda, coffee]]
        System.out.println(groceryList.get(0).get(2)); // = Hotdog
    }
}