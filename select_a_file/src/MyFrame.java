import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser filechooser = new JFileChooser();
        filechooser.setCurrentDirectory(new File("."));
        int response = filechooser.showOpenDialog(null); // select file to open
        //int response = filechooser.showSaveDialog(null); // select file to open
        if (response == JFileChooser.APPROVE_OPTION) {
            File file = new File(filechooser.getSelectedFile().getAbsolutePath());
            System.out.println(file);
            System.exit(0);
        }
    }
}
