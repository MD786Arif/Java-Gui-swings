import java.awt.*;
import java.awt.event.*;

//public class AwtTutorials extends Frame {


//    public AwtTutorials() {
//        setBackground(Color.green);
////        Setting the size of frame
////        if you we are not extending the frame class then we have to create the object of frame class
////        Frame myFrame = new Frame
//
////        Creating a button
//        Button b = new Button("Click Me");
//        b.setBounds(20, 60, 80, 30);
////        to cahnge the color of button
//        b.setBackground(Color.blue);
//        b.setForeground(Color.yellow);
//        add(b);
////        creating label
//        Label l = new Label("Hello friends chai peelo");
//        l.setBounds(20,40,70,20);
//        add(l);
//// Creating a text field
//        TextField textField = new TextField();
//        textField.setBounds(20,120,150,30);
//        add(textField);
//
//        setSize(400, 300);
////        myFrame.size(400,300);
//        setLayout(null);
//        setVisible(true);
////        myFrame.setVisible(true);
////        To close the window
////        myFrame.addWindowListener(new WindowAdapter(){}
//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                Frame frame = (Frame)e.getSource();
//               frame.dispose();
//            }
//        });
//
//
//    }
public class AwtTutorials implements ActionListener {
    Label label;

    public AwtTutorials() {
        Frame frame = new Frame("My frame");
//        Crating a label
        label = new Label("I am the Best");
        label.setBounds(20, 80, 100, 35);
        frame.add(label);
//        Creating a button
        Button button = new Button("Click one me");
        button.setBounds(20, 50, 40, 30);
        button.setBackground(Color.green);
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                label.setText("Button clicked successfully");
//            }
//        });
        button.addActionListener(this);
        frame.add(button);
//        Creating a text area
//        TextArea textArea = new TextArea("");
//        textArea.setBounds(20, 120, 100, 110);
//        textArea.setBackground(Color.black);
//        textArea.setForeground(Color.red);
//        frame.add(textArea);
        Checkbox checkbox = new Checkbox("Python");
        checkbox.setBounds(20, 110, 70, 50);
        Checkbox checkbox1 = new Checkbox("Java");
        checkbox1.setBounds(20, 150, 70, 50);
        frame.add(checkbox);
        frame.add(checkbox1);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Button clicked Sucessfully ");
    }

    public static void main(String[] args) {
//AwtTutorials a = new AwtTutorials();
        new AwtTutorials();

    }


}
