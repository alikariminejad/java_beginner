public class Main {
    public static void main(String[] args) {
        // static = modifier. A single copy of a variable/method is created and shared.
        //          The class "owns" the static member
        Friend friend1 = new Friend("Friend1");
        Friend friend2 = new Friend("Friend2");
        System.out.println(Friend.numberOfFriends); // = 2
        System.out.println(friend1.numberOfFriends); // = 2 (It's not recommended)

        Friend.displayFriends(); // = You have 2 friends

    }
}