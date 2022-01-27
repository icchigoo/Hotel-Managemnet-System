package HMS;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.*;
import java.awt.*;
public class Empinfo3 extends JFrame implements ActionListener {
    JTable t1;
    JButton b1,b2;
    
    
    Empinfo3(){
        t1= new JTable();
        t1.setBounds(0,50,1140,500);
        add(t1);
        
        JLabel l1 = new JLabel("Name");
        l1.setBounds(40,10,70,20);
        add(l1);
        
        
        JLabel l2 = new JLabel("Country");
        l2.setBounds(170,10,70,20);
        add(l2);
        
        JLabel l3 = new JLabel("Age");
        l3.setBounds(290,10,70,20);
        add(l3);
        
        JLabel l4 = new JLabel("gender");
        l4.setBounds(410,10,70,20);
        add(l4);
        
         JLabel l5 = new JLabel("Job");
        l5.setBounds(545,10,70,20);
        add(l5);
        
         JLabel l6 = new JLabel("Salary");
        l6.setBounds(650,10,70,20);
        add(l6);
        
         JLabel l7 = new JLabel("Phone num");
        l7.setBounds(790,10,70,20);
        add(l7);
        
         JLabel l8 = new JLabel("Phone num");
        l8.setBounds(920,10,70,20);
        add(l8);
        
        JLabel l9 = new JLabel("Email");
        l9.setBounds(1050,10,70,20);
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
                    String str = "select* from employess";
                    ResultSet rs = c.s.executeQuery(str);
                    t1.setModel(DbUtils.resultSetToTableModel(rs));
                    
            }catch(Exception e){
                
            }
            
            
        }else if(ae.getSource()==b2){
            new Reception3().setVisible(true);
            this.setVisible(false);
            
            
        }
        
        
        
    }
    public static void main(String[]args){
      new  Empinfo3().setVisible(true);
    }
    
    
}
