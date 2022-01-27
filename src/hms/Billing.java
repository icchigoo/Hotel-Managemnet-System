package HMS;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Billing extends JFrame implements ActionListener{
    JLabel l1, l2;
    JTextArea t1;
     JTextField   t3, t4 ,t5,t2;
          
    JButton b1;
    Choice c1;
    JPanel p1;
    String meter;
    Billing(){
        this.meter = meter;
        setSize(500,900);
        setLayout(new BorderLayout());
        
        p1 = new JPanel();
        
        l1 = new JLabel("Generate Bill");
        
        l2 = new JLabel(meter);
  
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
       p1.add(c1);
        

        
        t1 = new JTextArea(50,15);
        t1.setText("\n\n\t------- Click on the -------\n\t Generate Bill Button to get\n\tthe bill of the Selected Month\n\n");
        JScrollPane jsp = new JScrollPane(t1);
        t1.setFont(new Font("Senserif",Font.ITALIC,18));
        
        b1 = new JButton("Generate Bill");
        
        p1.add(l1);
        p1.add(l2);
        p1.add(c1);
        add(p1,"North");
        
        add(jsp,"Center");
        add(b1,"South");
        
        
        b1.addActionListener(this);

        
        setLocation(750,100);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            String room = null;
            String deposit = null;
            Integer amountPaid = null;
            String price = null;
            conn c = new conn();
   
            String id = c1.getSelectedItem();
            t1.setText("\tHotel Pani Puri\n      BILL FOR THE MONTH OF "+id+" ,2021\n\n\n");
            
            ResultSet rs = c.s.executeQuery("select * from customer where number ='"+id+"'");
            
            if(rs.next()){
                t1.append("\n    Customer Id:   "+rs.getString("id"));
                t1.append("\n    Id Number:     "+rs.getString("number"));
                t1.append("\n    Customer name:            "+rs.getString("name"));
                t1.append("\n    Gender:                 "+rs.getString("gender"));
                t1.append("\n    Country:                   "+rs.getString("country"));
                t1.append("\n    Room:                "+rs.getString("room"));
                t1.append("\n    Checked IN        "+rs.getString("status"));
                t1.append("\n    Total         "+rs.getString("deposit"));
                t1.append("\n-------------------------------------------------------------");
                t1.append("\n");
                
            }ResultSet rs2 = c.s.executeQuery("select * from room where room = '"+room+"'");
              while(rs2.next()){
                  
                  price = (rs2.getString("price"));
                  amountPaid =Integer.parseInt(price) - Integer.parseInt(deposit);
                  t1.setText(Integer.toString(amountPaid));
              }
           
    
        }catch(Exception e){
            e.printStackTrace();
        }
    }

  
    public static void main(String[] args){
        new Billing().setVisible(true);
    }
}



