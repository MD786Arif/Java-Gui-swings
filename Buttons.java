import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    ImageIcon imageIcon = new ImageIcon("thumbsup.png");
    ImageIcon imageIcon1 = new ImageIcon("download.png");
    JButton jButton;
    JLabel jLabel;

    public MyFrame() {

        jLabel = new JLabel();
        jLabel.setIcon(imageIcon1);
        jLabel.setBounds(150,250,150,100);

        jButton = new JButton("ClickOn");
        jButton.setBounds(200, 100, 300, 200);
        jButton.addActionListener(this);
// an alternate method to perform this action
//        jButton.addActionListener(e -> System.out.println("Hello you clicked me"));// lamda expression
      jButton.setFocusable(false);
      jButton.setIcon(imageIcon);
      jButton.setHorizontalTextPosition(JButton.CENTER);
      jButton.setVerticalTextPosition(JButton.BOTTOM);
      jButton.setFont(new Font("Comic Sans",Font.BOLD,25));
//      jButton.setIconTextGap(-15);
        jButton.setBackground(Color.green);
        jButton.setBorder(BorderFactory.createEtchedBorder(Color.yellow,Color.BLUE));


        this.setSize(500, 500);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(jButton);
        jButton.add(jLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jButton){
            System.out.println("Poo");
//    jButton.setEnabled(false); //disable button
        }
    }
}

public class Buttons {
    public static void main(String[] args) {

        new MyFrame();
    }
}
