import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class SpinnerEx {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        SpinnerModel value=new SpinnerNumberModel(5,0,10,1);
        JSpinner sp=new JSpinner(value);
        sp.setBounds(100,100,50,30);
        frame.add(sp);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
