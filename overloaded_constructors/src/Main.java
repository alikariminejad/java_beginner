public class Main {
    public static void main(String[] args) {
        // overloaded constructors = multiple constructors within a class with the same name,
        //                           but have different parameters
        //                           name + parameters = signature
        Pizza pizza = new Pizza("thicc crust", "tomato", "mozzerella", "pepperoni");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.toppings);

        Pizza pizza2 = new Pizza("thicc crust", "tomato", "mozzerella");
        System.out.println(pizza2.toppings); // = null
        Pizza pizza3 = new Pizza("thicc crust", "tomato");
        Pizza pizza4 = new Pizza("thicc crust");
    }
}