import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        
    
    JFrame frame=new JFrame("Area calculator");
    JPanel panel =new JPanel();
    JLabel l1=new JLabel("Lenght:");
    JLabel l2=new JLabel("Width:");
    JLabel l3=new JLabel("Area:");
    JTextField tf1=new JTextField(20);
    JTextField tf2=new JTextField(20);
    JTextField tf3=new JTextField(20);
    JButton b=new JButton("Calculate");
    tf3.setEditable(false);
    panel.add(l1);
    panel.add(l2);
    panel.add(l3);
    panel.add(tf1);
    panel.add(tf2);
    panel.add(tf3);
    panel.add(b);

    b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event){
            if(event.getSource()==b){
                try {
                    double a=Double.parseDouble(tf1.getText());
                    double b=Double.parseDouble(tf2.getText());
                    double area=a*b;
                    tf3.setText(String.format("%.2f",area));
                    
                } catch (Exception e) {
                    System.out.println(e);
                }
            }


        }
    });

    frame.add(panel);
    frame.setSize(250,200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    
}}
