

package HMS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;



public  class Homepage1 extends JFrame implements ActionListener{ 
    JMenuBar bar1;
    JMenu m1, m2, m3, m4;
    JMenuItem it1, it2, it3, it4, it5, it6, it7, it8, it9;
    JButton b6,b1,b2,b3,b7;



    Homepage1(){
        bar1 = new JMenuBar();
     //   bar1.setBounds(100,200,1000,30);
        add(bar1);

        m1 = new JMenu("HotelManagemntSystem");
        m1.setForeground(Color.BLUE);
        bar1.add(m1);

        m2 = new JMenu("Admin");
        m2.setForeground(Color.BLUE);
        bar1.add(m2);
        
        m3 = new JMenu("RESTURANT");
        m3.setForeground(Color.BLUE);
        bar1.add(m3);
        
        m4 = new JMenu("BAR");
        m4.setForeground(Color.BLUE);
        bar1.add(m4);

        it1 = new JMenuItem("RECEPTION");
        it1.addActionListener(this);
        m1.add(it1);
        
        it9 = new JMenuItem("ClIENT RECEPTION");
        it9.addActionListener(this);
        m1.add(it9);

        it2 = new JMenuItem("ADD EMPLOYE");
        it2.addActionListener(this);
        m2.add(it2);

        it3 = new JMenuItem("ADD DRIVER");
        it3.addActionListener(this);
        m2.add(it3);

        it4 = new JMenuItem("ADD ROOMS");
        it4.addActionListener(this);
        m2.add(it4);
        
        it5= new JMenuItem("ADD AIRCRAFTS");
        it5.addActionListener(this);
        m2.add(it5);
        
        it7= new JMenuItem("CLIENTS ROOM");
        it7.addActionListener(this);
        m2.add(it7);
        
        
        
        it6= new JMenuItem("OPEN Resturant");
        it6.addActionListener(this);
        m3.add(it6);
      
        bar1.setBounds(0,0,1920,30);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/background.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1920,1080,500);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel lbl1 = new JLabel(i3);
        lbl1.setBounds(0,0,1920,1080);
        add(lbl1);
        
        
         ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/Reception.jpg"));
       Image i6 = i4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
       ImageIcon i5 = new ImageIcon(i6);
        b6 = new JButton(i5);
        b6.addActionListener(this);
       b6.setBounds(1500,80,30,30);
       add(b6);
       b6.setBackground(Color.white);
       
       
        b2 = new JButton("Reception");
        b2.addActionListener(this);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.setBounds(1530,80,110,30);
        add(b2);
        
       /* 
        
            ImageIcon i9 = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/admin1.png"));
       Image i8 = i9.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
       ImageIcon i7 = new ImageIcon(i6);
        b7 = new JButton(i7);
        b7.addActionListener(this);
       b7.setBounds(1315,80,30,30);
       add(b7);
       b7.setBackground(Color.white);
        */
       
     /*  
        b1 = new JButton("Admin");
        b1.addActionListener(this);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(1350,80,80,30);
        add(b1);
*/


        JLabel lbl2 = new JLabel("WELCOME TO HOTEL");
        lbl2.setBounds(520,50,1000,100);
        lbl2.setForeground(Color.BLACK);

        lbl2.setFont(new Font("serief",Font.ITALIC,60));
        lbl1.add(lbl2);

        setLayout(null);
        setBounds(0,0,1920,1080);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("ADMIN")){
          
        }else if(ae.getActionCommand().equals("ADD EMPLOYE")){
            new Employess().setVisible(true);
            
        }else if(ae.getActionCommand().equals("ADD ROOMS")){
            new Room().setVisible(true);
        }else if(ae.getActionCommand().equals("CLIENTS ROOM")){
            new Room2().setVisible(true);
            
        }else if(ae.getActionCommand().equals("ADD DRIVER")){
            new Drivers().setVisible(true);
        }else if(ae.getActionCommand().equals("ADD AIRCRAFTS")){
            new Aircraft().setVisible(true);
        
        
        }  
       
       if(ae.getActionCommand().equals("RESTURANT")){
            }else if(ae.getActionCommand().equals("OPEN Resturant")){
            new Login1().setVisible(true);
            
       }
        if(ae.getActionCommand().equals("HotelManagemntSystem")){
            }else if(ae.getActionCommand().equals("RECEPTION")){
            new Reception().setVisible(true);
            
   
    } else if(ae.getActionCommand().equals("ClIENT RECEPTION")){
            new Reception4().setVisible(true);
    }
            
        else if(ae.getSource()==b2){
        new Reception().setVisible(true);
        this.setVisible(false);
        }
    }
    public static void main(String[]args){
        new Homepage1();
    }
}

