import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        JFrame obj =new JFrame();

        obj.setBounds(10, 10, 905, 700);
        obj.setBackground( Color.blue);
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
