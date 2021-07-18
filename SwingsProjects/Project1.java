package SwingsProjects;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//........................My First Project Sum of two numbers Using Java Swing................
class TheSum extends JFrame implements ActionListener {
    JFrame jFrame;
    JButton jButton;
    JButton jButton1;
    JTextField jTextField;
    JTextField jTextField1;
    JLabel jLabel2;
    public TheSum() {
        jFrame = new JFrame("...THE SUM... ");
        ImageIcon imageIcon = new ImageIcon("Sum.png");

        JLabel jLabel = new JLabel("Enter First Number ");
        jLabel.setBounds(30, 60, 130, 60);
        jLabel.setBackground(Color.blue);
        jLabel.setForeground(Color.black);
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setBorder(BorderFactory.createEtchedBorder());
        jLabel.setOpaque(true);

        jTextField = new JTextField();
        jTextField.setBounds(160, 60, 130, 60);
        jTextField.setBorder(BorderFactory.createEtchedBorder());


        JLabel jLabel1 = new JLabel("Enter Sec. Number ");
        jLabel1.setBounds(300, 60, 130, 60);
        jLabel1.setBackground(Color.BLUE);
        jLabel1.setForeground(Color.black);
        jLabel1.setHorizontalAlignment(JLabel.CENTER);
        jLabel1.setBorder(BorderFactory.createEtchedBorder());
        jLabel1.setOpaque(true);

        jTextField1 = new JTextField();
        jTextField1.setBounds(430, 60, 130, 60);
        jTextField1.setBorder(BorderFactory.createEtchedBorder());


        jLabel2 = new JLabel();
        jLabel2.setBounds(230, 150, 130, 60);
        jLabel2.setBackground(Color.lightGray);
        jLabel2.setForeground(Color.black);
        jLabel2.setHorizontalAlignment(JLabel.CENTER);
        jLabel2.setBorder(BorderFactory.createEtchedBorder());
        jLabel2.setOpaque(true);

        jButton = new JButton("+");
        jButton.setBounds(230, 230, 130, 60);
        jButton.setBackground(Color.CYAN);
        jButton.setForeground(Color.BLACK);
        jButton.setBorder(BorderFactory.createEtchedBorder());
        jButton.setFont(new Font("Comic Sans",Font.BOLD,25));
        jButton.setFocusable(false);


        jButton1 = new JButton("*");
        jButton1.setBounds(230, 290, 130, 60);
        jButton1.setBackground(Color.CYAN);
        jButton1.setForeground(Color.BLACK);
        jButton1.setBorder(BorderFactory.createEtchedBorder());
        jButton1.setFont(new Font("Comic Sans",Font.BOLD,25));
        jButton1.setFocusable(false);



//        Action Listener
      jButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              int a = Integer.parseInt(jTextField.getText()) ;
              int b = Integer.parseInt(jTextField1.getText()) ;
              long Sum = (long)a+b;
              jLabel2.setText("Sum = "+Sum);
          }
      });

          jButton1.addActionListener(this);



//...................--------------..........................


        jFrame.setIconImage(imageIcon.getImage());

        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 500);
        jFrame.getContentPane().setBackground(Color.green);
        jFrame.setVisible(true);
        jFrame.setResizable(false);


        jFrame.add(jLabel);
        jFrame.add(jTextField);
        jFrame.add(jLabel1);
        jFrame.add(jTextField1);
        jFrame.add(jLabel2);
        jFrame.add(jButton);
        jFrame.add(jButton1);
    }


    @Override
    public void actionPerformed(ActionEvent e)  {

        int a = Integer.parseInt(jTextField.getText()) ;
        int b = Integer.parseInt(jTextField1.getText()) ;
        long Product = (long) a *b;
        jLabel2.setText("Product = "+Product);
    }
}


public class Project1 {
    public static void main(String[] args) {
        new TheSum();
    }
}

