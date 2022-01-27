package HMS;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.*;
import java.awt.*;
public class Customerinfo2 extends JFrame implements ActionListener {
    JTable t1;
    JButton b1,b2;
    
    
    Customerinfo2(){
        t1= new JTable();
        t1.setBounds(0,50,1140,500);
        add(t1);
        
        JLabel l1 = new JLabel("Type");
        l1.setBounds(40,10,70,20);
        add(l1);
        
        
        JLabel l2 = new JLabel("Number");
        l2.setBounds(185,10,70,20);
        add(l2);
        
        JLabel l3 = new JLabel("Name");
        l3.setBounds(320,10,70,20);
        add(l3);
        
        JLabel l4 = new JLabel("gender");
        l4.setBounds(480,10,70,20);
        add(l4);
        
         JLabel l5 = new JLabel("Country");
        l5.setBounds(610,10,70,20);
        add(l5);
        
         JLabel l6 = new JLabel("Room Num");
        l6.setBounds(750,10,70,20);
        add(l6);
        
         JLabel l7 = new JLabel("Check IN");
        l7.setBounds(880,10,70,20);
        add(l7);
        
        
        
        JLabel l8 = new JLabel("Deposit");
        l8.setBounds(1050,10,70,20);
        add(l8);
        
    
        
      
        
        
        b1 = new JButton("Load Data");
        b1.addActionListener(this);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,560,120,30);
        add(b1);

        b2 = new JButton("back");
        b2.addActionListener(this);
        b2.setBackground(Color.LIGHT_GRAY);
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
                    String str = "select * from customer3";
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
      new  Customerinfo2().setVisible(true);
    }
    
    
}
