import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx {
    JFrame frame;
    RadioButtonEx(){
        frame=new JFrame();
        JRadioButton b1=new JRadioButton("A) Male");
        JRadioButton b2=new JRadioButton("B) Female");
        b1.setBounds(75,50,100,30);
        b2.setBounds(75,100,100,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(b1);bg.add(b2);
        frame.add(b1);
        frame.add(b2);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new RadioButtonEx();
    }
}
