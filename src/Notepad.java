import javax.swing.*;
import java.awt.*;

public class Notepad {


    public static void main(String args[]){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JTextPane text = new JTextPane();
        JButton button = new JButton("Press");
        frame.getContentPane().add(text);
        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}

