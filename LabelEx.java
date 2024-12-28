import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LabelEx extends Frame implements ActionListener {
    JButton button;
    JTextField tf;
    JLabel label;
    public LabelEx(){
        tf=new JTextField();
        tf.setBounds(50,50,150,20);
        label=new JLabel();
        label.setBounds(50,100,250,20);
        button=new JButton("Find IP");
        button.setBounds(50,150,95,30);
        button.addActionListener(this);
        add(button);
        add(tf);
        add(label);
    }
    public void actionPerformed(ActionEvent e){
        try {
            String host=tf.getText();
            String ip=java.net.InetAddress.getByName(host).getHostAddress();
            label.setText("IP of"+host+"is :"+ip);
        } catch (Exception ex) {
             
            System.out.println(ex);
        }
        

    }
    public static void main(String[] args) {
        new LabelEx();
    }
}
