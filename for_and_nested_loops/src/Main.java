import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // for loop = executes a block of code a limited amount of time
//        for(int i=10;i>=0;i-=2){
//            System.out.println(i + " seconds!");
//        }
//        System.out.println("Happy new Year!!!!");


        // nested loop = a loop inside of a loop
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";
        System.out.println("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter the symbol: ");
        symbol = scanner.next();
        for(int i=1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=columns; j++){
                System.out.print(symbol);
            }
        }
    }
}