import javax.swing.*;
import java.awt.*;

public class SSwing extends JFrame{
    public SSwing(){
        //        JFrame is  = a gui window to add component to
        
           this.setTitle("Hello wolrd");
           ImageIcon imgaeIcon = new ImageIcon("download.png"); //set an image icon of  and to cahnge the logo           of the java frame
            this.setIconImage(imgaeIcon.getImage()); //change the icon of frame

//        to chanege the background colour of the frame
        this.getContentPane().setBackground(new Color(0xfffff)); //to change the background colour of the background

       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close the window when clocked on x

        JLabel jLabel = new JLabel("This my label");
        jLabel.setBounds(100,100,100,40);
        jLabel.setBackground(Color.black);

        this.add(jLabel);

           this.setSize(420, 420);
            this.setVisible(true);
//            this.setResizable(true);
           this.setLayout(null);
        

    }

    public static void main(String[] args) {
        new SSwing();
    }
}