package HMS;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.*;
import java.awt.*;
public class drinksinfo3 extends JFrame implements ActionListener {
    JTable t1;
    JButton b1,b2;
    
    
    drinksinfo3(){
        t1= new JTable();
        t1.setBounds(0,50,1140,500);
        add(t1);
        
        JLabel l1 = new JLabel("Hotdrinks");
        l1.setBounds(40,10,70,20);
        add(l1);
        
        
        
        JLabel l3 = new JLabel("Softdrinks");
        l3.setBounds(175,10,70,20);
        add(l3);
        
         JLabel l2 = new JLabel("Coffee");
        l2.setBounds(330,10,70,20);
        add(l2);
        
        JLabel l4 = new JLabel("Tea");
        l4.setBounds(475,10,70,20);
        add(l4);
        
      
        
         JLabel l6 = new JLabel("Liquer");
        l6.setBounds(625,10,70,20);
        add(l6);
        
         JLabel l7 = new JLabel("Wine");
        l7.setBounds(750,10,70,20);
        add(l7);
        
        JLabel l8 = new JLabel("Beer");
        l8.setBounds(895,10,70,20);
        add(l8);
        
     
        
        JLabel l9 = new JLabel("Cocktails");
        l9.setBounds(1025,10,70,20);
        add(l9);
        
    
        
      
        
        
        b1 = new JButton("Load Data");
        b1.addActionListener(this);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,560,120,30);
        add(b1);

        b2 = new JButton("back");
        b2.addActionListener(this);
        b1.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.WHITE);
        b2.setBounds(590,560,120,30);
        add(b2);
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.WHITE);
        setBounds(450,200,1150,700);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
            try{
                    conn c = new conn();
                    String str = "select* from drinks";
                    ResultSet rs = c.s.executeQuery(str);
                    t1.setModel(DbUtils.resultSetToTableModel(rs));
                    
            }catch(Exception e){
                
            }
            
            
        }else if(ae.getSource()==b2){
            new Reception().setVisible(true);
            this.setVisible(false);
            
            
        }
        
        
        
    }
    public static void main(String[]args){
      new  drinksinfo3().setVisible(true);
    }
    
    
}
