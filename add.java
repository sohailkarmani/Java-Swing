import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class add extends JFrame implements ActionListener{
    JTextField t1,t2;
    JButton b1;
    JLabel l;
    public add(){
        t1=new JTextField(20);
        t2=new JTextField(20);
        b1=new JButton("OK");
        l=new JLabel("Result");
       
        add(t1);
        add(t2);
        add(b1);
        add(l);
b1.addActionListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public void actionformed(ActionEvent ae){
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int value=num1+num2;
        l.setText(value+ "");
    }

    
}
