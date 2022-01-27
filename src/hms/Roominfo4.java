package HMS;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.*;
import java.awt.*;

public class Roominfo4 extends JFrame implements ActionListener {
    JTable t1;
    JButton b1,b2;
    
    
    Roominfo4(){
        t1= new JTable();
        t1.setBounds(0,50,600,500);
        add(t1);
        
        JLabel l1 = new JLabel("Room Number");
        l1.setBounds(10,10,120,20);
        add(l1);
        
        
        JLabel l2 = new JLabel("Available");
        l2.setBounds(150,10,70,20);
        add(l2);
        
        JLabel l3 = new JLabel("Cleaning Status");
        l3.setBounds(250,10,120,20);
        add(l3);
        
        JLabel l4 = new JLabel("Price");
        l4.setBounds(395,10,70,20);
        add(l4);
        
         JLabel l5 = new JLabel("Bed Type");
        l5.setBounds(510,10,70,20);
        add(l5);
        
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/bed1.jpg"));
        Image i3 = i1.getImage().getScaledInstance(1000, 600,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l15 = new JLabel(i2);
        l15.setBounds(650,30,600,600);
        add(l15);
       
        
        b1 = new JButton("Load Data");
        b1.addActionListener(this);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.WHITE);
        b1.setBounds(140,560,120,30);
        add(b1);

        b2 = new JButton("back");
        b2.addActionListener(this);
        b1.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300,560,120,30);
        add(b2);
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.WHITE);
        setBounds(450,200,1300,700);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
            try{
                    conn c = new conn();
                    String str = "select * from room2";
                    ResultSet rs = c.s.executeQuery(str);
                    t1.setModel(DbUtils.resultSetToTableModel(rs));
                    
            }catch(Exception e){
                
            }
            
            
        }else if(ae.getSource()==b2){
            new Reception2().setVisible(true);
            this.setVisible(false);
            
            
        }
        
        
        
    }
    public static void main(String[]args){
      new  Roominfo4().setVisible(true);
    }
    
    
}

