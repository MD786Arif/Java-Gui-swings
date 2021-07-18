import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sum {
    public Sum(){
        Frame frame = new Frame("Sum of two numbers ");

        Label label = new Label("FirstNumber");
        label.setBounds(20,60,70,30);
        label.setBackground(Color.yellow);
        label.setForeground(Color.BLACK);
        frame.add(label);

        TextField textField = new TextField();
        textField.setBounds(90,60,80,30);
        textField.setBackground(Color.blue);
        textField.setForeground(Color.red);
         frame.add(textField);

         Label label2 = new Label("Second Number");
         label2.setBounds(190,60,90,30);
         label2.setBackground(Color.yellow);
         label2.setForeground(Color.BLACK);
         frame.add(label2);

         TextField textField1 = new TextField();
         textField1.setBounds(280,60,80,30);
         textField1.setBackground(Color.blue);
         textField1.setForeground(Color.red);
         frame.add(textField1);


         Label label1 = new Label();
         label1.setBounds(150,100,60,30);
         label1.setBackground(Color.blue);
         label1.setForeground(Color.red);
         frame.add(label1);

         Button button = new Button("Click");
         button.setBounds(150,150,60,30);
         button.setBackground(Color.green);
         button.setForeground(Color.yellow);
         button.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 int s = Integer.parseInt(textField.getText().toString());
                 int  t = Integer.parseInt(textField1.getText().toString()) ;
                 int sum = s+t;
                 label1.setText(String.valueOf(sum));
             }
         });
         frame.add(button);

         frame.addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
              frame.dispose();
             }
         });


        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);




    }
    public static void main(String[] args) {
    new Sum();

    }
}
