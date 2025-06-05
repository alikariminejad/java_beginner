import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();

        int x = random.nextInt(5); // 5 is the bound
        System.out.println(x);
        int y = random.nextInt(6)+1; // this will generate a random integer number from 1 through 6
        System.out.println(y);

        double d = random.nextDouble(); // double between 0 and 1
        System.out.println(d);

        boolean b = random.nextBoolean();
        System.out.println(b);
    }
}
