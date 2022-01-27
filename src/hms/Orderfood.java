package HMS;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.*;
import java.awt.*;

public class Orderfood extends JFrame implements ActionListener {

JTextField t1,t2,t3,t4,t5;
JButton b1,b2;

Choice c1, c2,c3;

Orderfood(){
    JLabel l1 = new JLabel("Order food or drinks");
    l1.setForeground(Color.BLUE);
    l1.setBounds(100,20,600,30);
    l1.setFont(new Font("Tahoma",Font.BOLD,25));
    add(l1);
    
    
    JLabel l2 = new JLabel("food");
    l2.setBounds(35,68,60,30);
    add(l2);
    

  
  c2 = new Choice();
    try{
        conn c = new conn();
        String strb ="Select * from addfood";
        ResultSet rs = c.s.executeQuery(strb);
        while(rs.next()){
            c2.add(rs.getString("name"));
        }
               
        
    }catch(Exception e){
        
    }
    c2.setBounds(120,70,120,40);
    add(c2);
    
     
  c3 = new Choice();
    try{
        conn c = new conn();
        String strb ="Select * from adddrinks";
        ResultSet rs = c.s.executeQuery(strb);
        while(rs.next()){
            c3.add(rs.getString("name"));
        }
               
        
    }catch(Exception e){
        
    }
    c3.setBounds(120,120,120,40);
    add(c3);
    
      JLabel l3 = new JLabel("drinks");
    l3.setBounds(35,118,60,30);
    add(l3);
    
         JLabel l4 = new JLabel("Customer-ID");
        l4.setBounds(30,170,90,30);
        add(l4);

        c1 = new Choice();
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from customer");
            while (rs.next()){
                c1.add(rs.getString("number"));
            }

        }catch (Exception e){

        }

        c1.setBounds(120,170,120,40);
        add(c1);
        
        
          JLabel l5 = new JLabel("Deposit");
        l5.setBounds(30,220,90,30);
        add(l5);
        
          t1 = new JTextField();
          t1.setBounds(120,220,120,25);
          add(t1);
        
    
   

   
    
  

    getContentPane().setBackground(Color.white);
    setLayout(null);
    setBounds(500,200,900,600);
    
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/Customer.jpeg"));
       // Image i2 = i1.getImage().getScaledInstance();
       // Image i3 = new ImageIcon(i2);
        JLabel lbl1 = new JLabel(i1);
        lbl1.setBounds(360,50,500,470);
        add(lbl1);

    
    
      b1 = new JButton("Add Items");
      b1.addActionListener(this);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.WHITE);
        b1.setBounds(25,430,120,30);
       
        add(b1);

       
      b2 = new JButton("Back");
       b2.addActionListener(this);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.WHITE);
        b2.setBounds(170,430,120,30);
        b2.addActionListener(this);
        add(b2);

}public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
    String id =  c1.getSelectedItem();
    String food = c2.getSelectedItem();
    String drinks = c3.getSelectedItem();
    String deposit = t1.getText();
    
   
        conn c = new conn();
       String str = "insert into Items values('"+id+"','"+food+"','"+drinks+"','"+deposit+"')";
       


        
        try{
           
             c.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null,"Food and drinks added");
         setVisible(false);
           
        }
        catch (Exception a) {
                        a.printStackTrace();
        	    }
            
        
            new Reception().setVisible(true);
            this.setVisible(false);

        } if(e.getSource()==b1){
            new Reception().setVisible(true);
            this.setVisible(false);
            
        } else if(e.getSource() == b2){
                new Reception().setVisible(true);
                this.setVisible(false);
        
      
    }
}


public static void main(String[]args){
    new Orderfood().setVisible(true);
}
}
