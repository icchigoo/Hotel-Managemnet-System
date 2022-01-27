package HMS;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.*;
import java.awt.*;

public class Itemstotal extends JFrame implements ActionListener {

    JButton b1, b2, b3;
    Choice c1;
    JTextField t1, t2, t3, t4 ,t5;


    Itemstotal(){

        JLabel l1 = new JLabel("Billing for food");
        l1.setFont(new Font("Tahoma",Font.PLAIN,25));
        l1.setForeground(Color.BLUE);
        l1.setBounds(40,15,500,30);
        add(l1);




        JLabel l2 = new JLabel("Customer-ID");
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
        
        
        
        

        JLabel l3 = new JLabel("Room Numebr");
        l3.setBounds(30,110,120,30);
        add(l3);

        t1 = new JTextField();
        t1.setBounds(200,110,140,27);
        add(t1);


        JLabel l4 = new JLabel("Name");
        l4.setBounds(30,150,120,30);
        add(l4);

        t2 = new JTextField();
        t2.setBounds(200,150,140,27);
        add(t2);

        JLabel l5 = new JLabel("Check-In");
        l5.setBounds(30,190,120,30);
        add(l5);

        t3 = new JTextField();
        t3.setBounds(200,190,140,27);
        add(t3);



        JLabel l6 = new JLabel("Amount Paid");
        l6.setBounds(30,230,120,30);
        add(l6);

        t4 = new JTextField();
        t4.setBounds(200,230,140,27);
        add(t4);


        JLabel l7 = new JLabel("Remaining Amount");
        l7.setBounds(30,270,120,30);
        add(l7);

        t5 = new JTextField();
        t5.setBounds(200,270,140,27);
        add(t5);
        
          
        b1 = new JButton("Check");
       b1.addActionListener(this);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.WHITE);
        b1.setBounds(30,370,120,30);
        add(b1);

        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.WHITE);
        b2.setBounds(200,370,120,30);
        add(b2);
        
      
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/checkin.jpg"));
       Image i2 = i1.getImage().getScaledInstance(650,450,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel l8 = new JLabel(i3);
       l8.setBounds(400,50,550,400);
       add(l8);
     
        setLayout(null);
        setBounds(300,200,1050,550);
        setVisible(true);

    } public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            try{
            String food  = null;
            String drinks = null;
            Integer amountPaid = null;
            String price = null;
            conn c = new conn();
            String id = c1.getSelectedItem();
                       String str = ("select * from Items where Items = '"+id+"'"); 
                        ResultSet rs =c.s.executeQuery(str);
                 
              while(rs.next()){
               //   t1.setText(rs.getString("room"));
                  t2.setText(rs.getString("food"));
                  t3.setText(rs.getString("drinks"));
                  t4.setText(rs.getString("deposit"));
                  food = rs.getString("food");
                  drinks = rs.getString("drinks");
                  food = rs.getString("name");
                  
                  
              }
         
           
            }catch(Exception e ){
                
            }
        }else if(ae.getSource()==b2){
             new Reception().setVisible(true);
            this.setVisible(false);
            
        }
    }
        

    public static void main(String[]args){
        new Itemstotal().setVisible(true);
    }
}
            
         
   
       



