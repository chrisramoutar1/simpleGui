//watch the following video to see
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class simple {
   
    JFrame frame;
    JTextField field;
    JPasswordField p;
    JLabel l;
    JButton b;
    
    simple(){
        frame = new JFrame("Simple");
        frame.setSize(500,200);
        frame.getContentPane().setBackground(Color.orange);
        frame.setLocation(450,200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        l = new JLabel("Enter Username");
        l.setLocation(10,10);
        l.setSize(l.getPreferredSize());
        frame.add(l);
        
        field = new JTextField();
        field.setColumns(15);
        field.setSize(field.getPreferredSize());
      
        
        field.setLocation(150,10);
        field.setToolTipText("Enter USer Name");
        frame.add(field);
        
        l = new JLabel("Enter password");
        l.setLocation(10,40);
        l.setSize(l.getPreferredSize());
        frame.add(l);
        
        p = new JPasswordField();
        p.setColumns(15);
        p.setSize(p.getPreferredSize());
      
        
        p.setLocation(150,40);
        p.setToolTipText("PAssword");
        frame.add(p);
        
        b = new JButton("OK");
        b.setSize(b.getPreferredSize());
        b.setLocation(150,75);
        frame.add(b);
        
        frame.setVisible(true);
        
    }
    
  
    public static void main(String args[]){
       new simple();
    }


    
}
