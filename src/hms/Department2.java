 package HMS;
 
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import net.proteanit.sql.DbUtils;



public class Department2 extends JFrame implements ActionListener {
    JComboBox c1;
    Choice c3;
    JCheckBox c2;
    JButton b1, b2;
    JTable t1;


    Department2(){
        t1 = new JTable();

        JLabel l1 = new JLabel("Department");
        l1.setFont(new Font("Tahoma",Font.PLAIN,25));
        l1.setForeground(Color.BLUE);
        l1.setBounds(30,5,500,30);
        add(l1);

        t1 = new JTable();
        t1.setBounds(0,75,1000,300);
        add(t1);
        
        JLabel l3  = new JLabel("Department");
        l3.setBounds(100,40,120,30);
        add(l3);
        
        JLabel l4  = new JLabel("Budget");
        l4.setBounds(600,40,120,30);
        add(l4);
        
        
       
        
        b2 = new JButton("back");
        b2.addActionListener(this);
        b2.setBounds(150, 400, 120, 30);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.WHITE);
        add(b2);

        b1 = new JButton("Summit");
        b1.addActionListener(this);
        b1.setBounds(500, 400, 120, 30);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.WHITE);
        add(b1);
        
        







        setLayout(null);
        setBounds(550,210,800,500);
        setVisible(true);


    } 
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() ==b1){
            
            
            try{
                String str = "select * from  department";
                conn c = new conn();
                ResultSet rs = c.s.executeQuery(str);
              t1.setModel(DbUtils.resultSetToTableModel(rs));
               
      
    }catch (Exception ee){
        System.out.println(ee);
    }
            
             
        }else if(ae.getSource()== b2){
            new Reception4().setVisible(true);
            this.setVisible(false);
            
        }

        
    
    }
    public static void main (String[]args){
        new Department2().setVisible(true);


    }

}



    


