package HMS;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.*;
import java.awt.*;

public class UpdateRoom extends JFrame implements ActionListener {
    
    Choice c1;
    JTextField t1,t2,t3;
    JButton b1,b2,b3;

    UpdateRoom(){
          

        JLabel l2 = new JLabel("Guest ID");
        l2.setBounds(30,70,120,30);
        add(l2);
        
        c1 = new Choice();
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from customer");
            while (rs.next()){
                c1.add(rs.getString("number"));
            }
            
        }catch (Exception e){
            
        }
        
        c1.setBounds(200,70,140,40);
        add(c1);
        

        JLabel l3 = new JLabel("Room Number");
        l3.setBounds(30,120,500,30);
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(200,120,140,30);
        add(t1);

        JLabel l4 = new JLabel("Availability");
        l4.setBounds(30,170,500,30);
        add(l4);
        
         t2 = new JTextField();
        t2.setBounds(200,170,140,30);
        add(t2);

        JLabel l5 = new JLabel("Clean status");
        l5.setBounds(30,220,500,30);
        add(l5);
        
         t3 = new JTextField();
        t3.setBounds(200,220,140,30);
        add(t3);
        
      
        
        b1 = new JButton("Check");
        b1.addActionListener(this);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.WHITE);
        b1.setBounds(30,370,120,30);
        add(b1);

        b2 = new JButton("Update");
        b2.addActionListener(this);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.WHITE);
        b2.setBounds(200,370,120,30);
        add(b2);
        
        b3 = new JButton("Back");
        b3.addActionListener(this);
        b3.setBackground(Color.LIGHT_GRAY);
        b3.setForeground(Color.WHITE);
        b3.setBounds(115,435,120,30);
        add(b3);
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/bed2.jpg"));
       Image i2 = i1.getImage().getScaledInstance(650,450,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel l6 = new JLabel(i3);
       l6.setBounds(400,50,550,400);
       add(l6);
       
        setLayout(null);
        setBounds(500,200,1100,550);
        setVisible(true);
        
        getContentPane().setBackground(Color.WHITE);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String room = (null);
            String s1 = c1.getSelectedItem();
            conn c = new conn();
            try{
            ResultSet rs = c.s.executeQuery("select * from customer where number = '"+s1+"'"); 
                       while (rs.next()){
                t1.setText(rs.getString("room"));
               room = rs.getString("room");
                              
              }   
            ResultSet rs2 = c.s.executeQuery("select * from room where room = '"+room+"'");  
                      while(rs2.next()){
                t2.setText(rs2.getString("available"));
                t3.setText(rs2.getString("status"));
   
            }
            }catch(Exception e ){
                System.out.println(e);
             
            
            }
            
            
        
    }else if(ae.getSource()==b2){
        try{
            conn c = new conn();
            String room = t1.getText();
            String available =t2.getText();
            String status =t3.getText();
            
            String str ="update room set available ='"+available+"',status ='"+status+"' where room='"+room+"'";
            c.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null,"Room updated");
            
            
            
        }catch(Exception e){
            
        }
        
        
    }else if(ae.getSource()==b3){
        new Reception().setVisible(true);
        this.setVisible(false);
        
        
    }
        
    }
    
    public static void main(String[]args){
        new UpdateRoom().setVisible(true);
    }
}

