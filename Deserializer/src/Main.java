import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Steps to deserialize
        // 1. Declare your object(don't instantiate)
        // 2. Your class should implement Serializable interface
        // 3. add import java.io.Serializable;
        // 4. FileInputStrem fileIn = new FileInputStream(file path);
        // 5. ObjectInputStream in = new ObjectInputStream(fileIn);
        // 6. objectNam = (Class) in.readObject();
        // 7. in.Close(); fileIn.Close();

        User user = null;
        FileInputStream fileIn = new FileInputStream("F:\\projects\\java_beginner\\Serialization\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user =  (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();

        // important notes
        // 1. children classes of a parent class that implements Serializable will do so as well
        // 2. static fields are not serialized (they belong to the class, not an individual object)
        // 3. the class's definition ("class file") itself is not recorded, cast it as the object type
        // 4. Fields declared as "transient" aren't serialized, they're ignored
        // 5. SerialVersionUID is a unique version ID for a class that is serializable

        // SerialVersionUID
        // is a unique ID that functions like a version number
        // verifies that the sender and receiver of a serialized object,
        // have loaded classes for that object that match exactly
        // Ensures object will be compatible between machines
        // Number must match. otherwise this will cause an InvalidClassException
        // A SerialVersionUID will be calculated based on class properties, members, etc.
        // A serializable class can declare its own serialVersionUID explicitly (recommended)
        // you can get it by something like this:
         long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
         System.out.println(serialVersionUID);
    }
}