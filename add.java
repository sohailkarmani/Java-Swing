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
    JFrame  f;
    public add(){
        t1=new JTextField(20);
        t2=new JTextField(20);
        b1=new JButton("OK");
        l=new JLabel("Result");
       
        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.add(l);
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
