public class Friend {
    String name;
    // static variable
    static int numberOfFriends;


    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }

    // static method
    static void displayFriends(){
        System.out.println("You have " + Friend.numberOfFriends + " friends");
    }
}
