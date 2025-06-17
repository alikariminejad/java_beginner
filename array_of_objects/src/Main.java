public class Main {
    public static void main(String[] args) {

//        Food[] refrigerator = new Food[3];
        Food food1 = new Food("Pizza");
        Food food2 = new Food("Hamburger");
        Food food3 = new Food("Hotdog");
        // method 1
        Food[] refrigerator =  {food1, food2, food3};
        // method 2
//        refrigerator[0] = food1;
//        refrigerator[1] = food2;
//        refrigerator[2] = food3;
        System.out.println(refrigerator[0].name); // = Pizza

    }
}