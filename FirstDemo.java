import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


class FirstDemo{
    public static void main(String[] args) {
       Demo d1=new Demo();
         
        
    }
}
class Demo extends JFrame{
    public Demo(){
        setLayout(new FlowLayout());
        JLabel l=new JLabel("Demo");
        JLabel l2=new JLabel("WelCome");
        add(l);
        add(l2);

        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

}