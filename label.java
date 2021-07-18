import javax.swing.*;
import java.awt.*;

public class label {
    public static void main(String[] args) {
        JFrame f= new JFrame("Label Example");

        ImageIcon imageIcon = new ImageIcon("download.png");

        JLabel l1,l2;
        l1=new JLabel("First Label.");
        l1.setBounds(50,50, 250,250);
        l1.setIcon(imageIcon);
        l1.setBackground(Color.green);
        l1.setOpaque(true);
        l2=new JLabel("Second Label.");
        l2.setBounds(50,300, 100,30);
        f.add(l1);
        f.add(l2);

        f.getContentPane().setBackground(Color.black);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }
}
