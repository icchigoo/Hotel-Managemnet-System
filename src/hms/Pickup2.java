 package HMS;
 
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import net.proteanit.sql.DbUtils;



public class Pickup2 extends JFrame implements ActionListener {
    JComboBox c1;
    Choice c3;
    JCheckBox c2;
    JButton b1, b2;
    JTable t1;


    Pickup2(){
        t1 = new JTable();

        JLabel l1 = new JLabel("Pickup Service");
        l1.setFont(new Font("Tahoma",Font.PLAIN,25));
        l1.setForeground(Color.BLUE);
        l1.setBounds(30,15,500,30);
        add(l1);

        JLabel l2 = new JLabel("Type of car");
        l2.setBounds(30,70,120,30);
        add(l2);
        
        c3 = new Choice();
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from driver");
            while (rs.next()){
                c3.add(rs.getString("brand"));
            }
            c3.setBounds(150,70,120,30);
            add(c3);
            
            
            
        }catch (Exception e){
            
        }


      


        t1 = new JTable();
        t1.setBounds(0,170,1000,300);
        add(t1);
        
        JLabel l3  = new JLabel("Name");
        l3.setBounds(30,145,120,30);
        add(l3);
        
        JLabel l4  = new JLabel("Age");
        l4.setBounds(180,145,120,30);
        add(l4);
        
        JLabel l5  = new JLabel("Gender");
        l5.setBounds(320,145,120,30);
        add(l5);
        
        JLabel l6  = new JLabel("Companey");
        l6.setBounds(440,145,120,30);
        add(l6);
        
        JLabel l7  = new JLabel("Brand");
        l7.setBounds(620,145,120,30);
        add(l7);
        
        JLabel l8  = new JLabel("available");
        l8.setBounds(760,145,120,30);
        add(l8);
        
        JLabel l9  = new JLabel("Location");
        l9.setBounds(880,145,120,30);
        add(l9);
        
       
        
        b2 = new JButton("back");
        b2.addActionListener(this);
        b2.setBounds(350, 550, 120, 30);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.WHITE);
        add(b2);

        b1 = new JButton("Summit");
        b1.addActionListener(this);
        b1.setBounds(500, 550, 120, 30);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.WHITE);
        add(b1);
        
        







        setLayout(null);
        setBounds(235,150,1000,650);
        setVisible(true);


    } 
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() ==b1){
            
            
            try{
                String str = "select * from  driver where brand = '"+c3.getSelectedItem()+"'";
                conn c = new conn();
                ResultSet rs = c.s.executeQuery(str);
              t1.setModel(DbUtils.resultSetToTableModel(rs));
               
      
    }catch (Exception ee){
        System.out.println(ee);
    }
            
             
        }else if(ae.getSource()== b2){
            new Reception2().setVisible(true);
            this.setVisible(false);
            
        }

        
    
    }
    public static void main (String[]args){
        new Pickup2().setVisible(true);


    }

}



    

