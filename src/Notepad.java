import javax.swing.*;
import java.awt.*;

public class Notepad {


    private JTextArea text;
    private JButton button;


    public static void main(String args[]){
        JFrame frame = new JFrame("Note18pad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JTextArea text = new JTextArea();
        JButton button = new JButton("Press");
        frame.getContentPane().add(text);
        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}

