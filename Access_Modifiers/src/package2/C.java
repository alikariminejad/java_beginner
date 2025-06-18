package package2;
import package1.*;

public class C {
    public String publicMessage = "This is a public message"; // accessible to all classes in different packages
    protected String protectedMessage = "This is a protected message"; // accessible to the classes that are subclasses to this class
    String defaultMessage = "This is the default message"; // accessible to the classes in the package
    private String privateMessage = "This is the private message"; // only accessible within the class
}
