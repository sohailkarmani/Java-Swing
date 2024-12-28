import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingEx2 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400,400);

        JTextField t=new JTextField();
        t.setBounds(50,50,150,20);

        JButton b=new JButton("Click me");
        b.setBounds(50,100,95,30);
         b.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){  
                t.setText("Welcome to Javatpoint.");  
            }  
         });

         
        frame.add(t);
        frame.add(b);

        

                                                  

    }
}
