import javax.swing.*;
import java.awt.*;

public class Panel {
    public static void main(String[] args) {

//        J panel is a container used to hold other components
        JFrame jFrame = new JFrame("My frame");

        ImageIcon imageIcon = new ImageIcon("thumbsup.png");


        JLabel redLabel = new JLabel();
          redLabel.setIcon(imageIcon);
//          redLabel.setVerticalAlignment(JLabel.CENTER);
//          redLabel.setHorizontalAlignment(JLabel.CENTER);
          redLabel.setBounds(24,40,100,100);


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
//        redPanel.setLayout(new BorderLayout());    //to make the thimgs inside the panel center we will use borderLayouts
         redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
       bluePanel.setBounds(250,0,250,250);

       JPanel greenPanel = new JPanel();
       greenPanel.setBackground(Color.green);
       greenPanel.setBounds(0,250,250,250);

       JPanel blackPanel = new JPanel();
       blackPanel.setBackground(Color.black);
       blackPanel.setBounds(250,250,250,250);


        jFrame.setSize(750,750);
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        redPanel.add(redLabel);

        jFrame.add(redPanel);
        jFrame.add(bluePanel);
        jFrame.add(greenPanel);
        jFrame.add(blackPanel);
    }

}
