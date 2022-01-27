

package HMS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;



public  class Homepage3 extends JFrame implements ActionListener{ 
    JMenuBar bar1;
    JMenu m1, m2, m3, m4;
    JMenuItem it1, it2, it3, it4, it5, it6, it7, it8, it9;



    Homepage3(){
        bar1 = new JMenuBar();
        add(bar1);

        m1 = new JMenu("HotelManagemntSystem");
        m1.setForeground(Color.BLUE);
        bar1.add(m1);

       
        
     
        
        it1 = new JMenuItem("RECEPTION");
        it1.addActionListener(this);
        m1.add(it1);

       
        bar1.setBounds(0,0,1920,30);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/hotel22.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1920,1080,500);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel lbl1 = new JLabel(i3);
        lbl1.setBounds(0,0,1920,1080);
        add(lbl1);


        JLabel lbl2 = new JLabel("Ajay welcome's you To Hotel; ");
        lbl2.setBounds(420,50,1000,100);
        lbl2.setForeground(Color.white);

        lbl2.setFont(new Font("serief",Font.ITALIC,60));
        lbl1.add(lbl2);

        setLayout(null);
        setBounds(0,0,1920,1080);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getActionCommand().equals("HotelManagemntSystem")){
            
            }else if(ae.getActionCommand().equals("RECEPTION")){
            new Reception3().setVisible(true);
            
            }
    }
    public static void main(String[]args){
        new Homepage3();
    }
}


