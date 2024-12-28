import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class swingEx3 {
    public static void main(String[] args) {
             

        JFrame f=new JFrame("Button ex");
        JTextField t=new JTextField();
        t.setBounds(50,50,150,20);
        JButton b=new JButton("click me");
        b.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t.setText("WelCome");
            }
        });
        f.add(b);f.add(t);
        f.setLayout(null);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        

         
    }
}
