import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("what is your name?");
        JOptionPane.showMessageDialog(null, "Welcome " + name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("what is your age?"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");
        double height = Double.parseDouble(JOptionPane.showInputDialog("what is your height?"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm");
        }
    }