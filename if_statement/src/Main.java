public class Main {
    public static void main(String[] args){
        // if statement = performs a block of code if it's condition evaluates to be true
        int age = 19;
        if(age>=75){
            System.out.println("OK Boomer!");
        }
        else if(age>=18){
            System.out.println("You are an adult");
        }
        else if(age>=13){
            System.out.println("You are a teenager");
        }
        else if(age==12){
            System.out.println("You are exactly 12 years old.");
        }
        else{
            System.out.println("You are not an adult");
        }
    }
}
