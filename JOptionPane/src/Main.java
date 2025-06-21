import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // JOptionPane = pop up a standard dialog box that prompts users for a value
        //               or informs them of something.

//        JOptionPane.showMessageDialog(null,"Hello World", "title", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Hello World", "title", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Hello World", "title", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Hello World", "title", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Hello World", "title", JOptionPane.ERROR_MESSAGE);

        //int answer = JOptionPane.showConfirmDialog(null, "bro, do you even code?", "Title", JOptionPane.YES_NO_CANCEL_OPTION);
        //String name = JOptionPane.showInputDialog("What is your name?");

        String[] responses = {"No, you're awesome!", "thank you!", "*Blush*"};
        ImageIcon icon = new ImageIcon("Untitled.png");
        JOptionPane.showOptionDialog(null, "You are awesome!!!", "secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
    }
}