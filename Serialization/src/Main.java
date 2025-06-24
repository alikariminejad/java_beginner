import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {
    public static void main (String[] args) throws IOException {
        // Serialization = The process of converting an object into a byte strem.
        //                 Persists (saves the state) the object after program exits
        //                 This byte stream can be saved as a file or sent over a network
        //                 Can be sent to a different machine
        //                 Byte stream can be saved as a file (.ser) which is platform independent
        //                 (Think of this as if you're saving a file with the object's information)


        // Steps to serialize
        // 1. Your object class should implement Serializable interface
        // 2. add import java.io.Serializable;
        // 3. FileOutputStream fileout = new FileOutputStream(file path);
        // 4. ObjectOutputStream out = new ObjectOutputStream(fileout);
        // 5. out.writeObject(objectName);
        // 6. out.close(); fileout.close();
        User user = new User();
        user.name = "Ali";
        user.password = "123456";

        FileOutputStream fileout = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileout);
        out.writeObject(user);
        out.close();
        fileout.close();
        System.out.println("Serialized data is saved into file");


        // Deserialization = the reverse process of converting a byte stream into an object
        //                   (Think of this as if you're loading a saved file)
    }
}