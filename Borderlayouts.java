import javax.swing.*;
import java.awt.*;

public class Borderlayouts {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();


        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        JPanel jPanel4 = new JPanel();
        JPanel jPanel5 = new JPanel();




        jPanel1.setBackground(Color.green);
        jPanel2.setBackground(Color.red);
        jPanel3.setBackground(Color.blue);
        jPanel4.setBackground(Color.yellow);
        jPanel5.setBackground(Color.gray);

//        To set the size of the panels
        jPanel1.setPreferredSize(new Dimension(100,100));
        jPanel2.setPreferredSize(new Dimension(100,100));
        jPanel3.setPreferredSize(new Dimension(100,100));
        jPanel4.setPreferredSize(new Dimension(100,100));
        jPanel5.setPreferredSize(new Dimension(100,100));

//        .................... sub panels...................
        JPanel jPanel6 = new JPanel();
        JPanel jPanel7 = new JPanel();
        JPanel jPanel8 = new JPanel();
        JPanel jPanel9 = new JPanel();
        JPanel jPanel10 = new JPanel();


        jPanel6.setBackground(Color.black);
        jPanel7.setBackground(Color.darkGray);
        jPanel8.setBackground(Color.blue);
        jPanel9.setBackground(Color.yellow);
        jPanel10.setBackground(Color.lightGray);

//        To set the size of the panels
        jPanel6.setPreferredSize(new Dimension(100,100));
        jPanel7.setPreferredSize(new Dimension(100,100));
        jPanel8.setPreferredSize(new Dimension(100,100));
        jPanel9.setPreferredSize(new Dimension(100,100));
        jPanel10.setPreferredSize(new Dimension(100,100));


     jPanel5.setLayout(new BorderLayout());
     jPanel5.add(jPanel6,BorderLayout.NORTH);
        jPanel5.add(jPanel7,BorderLayout.SOUTH);
        jPanel5.add(jPanel8,BorderLayout.EAST);
        jPanel5.add(jPanel9,BorderLayout.WEST);
        jPanel5.add(jPanel10,BorderLayout.CENTER);

//............................................End of Sub Panels.................



//Pass the argument to New Border Layout to give the margins with the button
        jFrame.setLayout(new BorderLayout(10,10));
        jFrame.setVisible(true);
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(jPanel1, BorderLayout.NORTH);
        jFrame.add(jPanel2, BorderLayout.SOUTH);
        jFrame.add(jPanel3, BorderLayout.EAST);
        jFrame.add(jPanel4, BorderLayout.WEST);
        jFrame.add(jPanel5, BorderLayout.CENTER);



    }
}
