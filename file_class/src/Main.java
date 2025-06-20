import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        // file = An abstract representation of file and directory pathnames
        File file = new File("secret_message.txt");
        if (file.exists()){
            System.out.println("File exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile()); // checks if file is a file or a folder, if it's a folder it returns false
//            file.delete();

        }
        else{
            System.out.println("File does not exist");
        }

        // write content to a file
        try{
        FileWriter writer = new FileWriter("poem.txt");
        writer.write("Roses are red \nViolets are blue \nThis is my poem \nRockin' everywhere!");
        writer.append("\n(A poem by Ali)");
        writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

        // FileReader = read the contents of a file as a stream of characters. ony by one
        //              read() returns an int value which contains the byte value
        //              when read() returns -1, there is no more data to be read
        try{
            FileReader reader = new FileReader("poem.txt");
            int data = reader.read();
            while(data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}