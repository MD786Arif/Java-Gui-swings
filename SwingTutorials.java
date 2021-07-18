
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Swing {
    //        JFrame is  = a gui window to add component to


    public Swing() {
        JFrame jFrame = new JFrame("My frame");
        ImageIcon imgaeIcon = new ImageIcon("download.png"); //set an image icon of jFrame and to cahnge the logo           of the java frame
        //        Creating Border
        Border border = BorderFactory.createDashedBorder(Color.blue,10,1);
        Border border1 = BorderFactory.createLineBorder(Color.BLACK,10);

        jFrame.setIconImage(imgaeIcon.getImage()); //change the icon of frame

//        to chanege the background colour of the frame
        jFrame.getContentPane().setBackground(new Color(0xfffff)); //to change the background colour of the background


//Creating label
        JLabel jLabel = new JLabel();
        jLabel.setBounds(40,90,50,50);
        jLabel.setText("Bro you are the best person");
        jLabel.setIcon(imgaeIcon);  //setting an image in a label
        jLabel.setHorizontalTextPosition(JLabel.CENTER); //setting the position of the text relative to imge
        jLabel.setVerticalTextPosition(JLabel.NORTH); // set image icon top bottom
        jLabel.setForeground(Color.red); // to change the color of font
        jLabel.setFont(new Font("MV Boli",Font.ITALIC,20)); //Set Font text of text
        jLabel.setIconTextGap(20);//set the gap betwwwn image and text
        jLabel.setBackground(Color.magenta);
        jLabel.setOpaque(true); // this will allow to change the background color of the label
        jLabel.setBorder(border1);
        jLabel.setVerticalAlignment(JLabel.CENTER);//set vertical positon of icon plus text within label
        jLabel.setHorizontalAlignment(JLabel.CENTER); //set horizontal positon of icon plus text within label
        jLabel.setBounds(200,200,400,250);
        jFrame.add(jLabel);



        jFrame.setSize(500, 500);
        jFrame.setVisible(true);
        jFrame.setResizable(true);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close the window when clocked on x

    }


}

public class SwingTutorials {
    public static void main(String[] args) {
        new Swing();
// new SSwing();

    }

}
