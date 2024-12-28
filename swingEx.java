import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class swingEx {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // creating panel
        JPanel panal=new JPanel();

        JLabel l1=new JLabel("Enter your name");
        JTextField t1=new JTextField(20);
        JButton b1=new JButton("submit");

        // add component to panel
        panal.add(l1);
        panal.add(t1);
        panal.add(b1);

        // add panal to frame
        frame.add(panal);



    }
}
