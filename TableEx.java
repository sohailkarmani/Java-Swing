import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableEx {
    JFrame f;
    TableEx(){
        f=new JFrame();
        String data[][]={{"1","Sohail","10000"},{"2","Haresh","10000"},{"3","Khushal","10000"}};
        String col[]={"ID","Name","Salary"};
        JTable jt=new JTable(data,col);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new TableEx();
    }
}
