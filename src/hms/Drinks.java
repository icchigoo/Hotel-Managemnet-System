package HMS;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Drinks extends JFrame implements ActionListener {
    JTextField txt1, txt2, txt3,txt4, txt5, txt6, txt7, txt8;
    JComboBox cm1, cm2, cm3, cm4, cm5, cm6,cm7,cm8;;
    JButton btn1, btn2, btn3;

    Drinks(){
        JLabel birayani = new JLabel("HOT DRINKS");
        birayani .setFont(new Font("Tahoma", Font.PLAIN, 17));
        birayani.setBounds(60,50,120,30);
        add(birayani);

        txt1 = new JTextField("");
        txt1.setBounds(185,50,150,30);
        add(txt1);
        
        String str1[] ={"AVAILABLE","NOT AVAILABLE"};
        cm1 = new JComboBox(str1);
        cm1.setBackground(Color.white);
        cm1.setBounds(380,50,150,30);
        add(cm1);

        JLabel kababs  = new JLabel("SOFT DRINKS");
        kababs .setFont(new Font("Tahoma", Font.PLAIN, 17));
        kababs.setBounds(60,100,120,30);
        add(kababs);

        txt2 = new JTextField();
        txt2.setBounds(185,100,150,30);
        add(txt2);
        
        String str2[] ={"AVAILABLE","NOT AVAILABLE"};
        cm2 = new JComboBox(str2);
        cm2.setBackground(Color.white);
        cm2.setBounds(380,100,150,30);
        add(cm2);

        JLabel breds = new JLabel("COFFEE");
        breds .setFont(new Font("Tahoma", Font.PLAIN, 17));
        breds.setBounds(60,150,120,30);
        add(breds);

        txt3 = new JTextField();
        txt3.setBounds(185,150,150,30);
        add(txt3);
        
        String str3[] ={"AVAILABLE","NOT AVAILABLE"};
        cm3 = new JComboBox(str3);
        cm3.setBackground(Color.white);
        cm3.setBounds(380,150,150,30);
        add(cm3);

        JLabel gender = new JLabel("TEA");
        gender .setFont(new Font("Tahoma", Font.PLAIN, 17));
        gender.setBounds(60,200,120,30);
        add(gender);
        
        txt4 = new JTextField();
        txt4.setBounds(185,200,150,30);
        add(txt4);
        
        String str4[] ={"AVAILABLE","NOT AVAILABLE"};
        cm4 = new JComboBox(str4);
        cm4.setBackground(Color.white);
        cm4.setBounds(380,200,150,30);
        add(cm4);

       
       

        JLabel JOB = new JLabel("LIQUEUR");
        JOB .setFont(new Font("Tahoma", Font.PLAIN, 17));
        JOB.setBounds(60,250,120,30);
        add(JOB);
        
        
        txt5 = new JTextField();
        txt5.setBounds(185,250,150,30);
        add(txt5);
        
        String str5[] ={"AVAILABLE","NOT AVAILABLE"};
        cm5 = new JComboBox(str5);
        cm5.setBackground(Color.white);
        cm5.setBounds(380,250,150,30);
        add(cm5);

       

        JLabel Salary = new JLabel("WINE");
        Salary .setFont(new Font("Tahoma", Font.PLAIN, 17));
        Salary.setBounds(60,300,120,30);
        add(Salary);

        txt6 = new JTextField();
        txt6.setBounds(185,300,150,30);
        add(txt6);
        
        String str6[] ={"AVAILABLE","NOT AVAILABLE"};
        cm6 = new JComboBox(str6);
        cm6.setBackground(Color.white);
        cm6.setBounds(380,300,150,30);
        add(cm6);
        
        
         JLabel Beer = new JLabel("BEER");
         Beer.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Beer.setBounds(60,350,120,30);
        add(Beer);

        txt7 = new JTextField();
        txt7.setBounds(185,350,150,30);
        add(txt7);
        
        String str7[] ={"AVAILABLE","NOT AVAILABLE"};
        cm7 = new JComboBox(str6);
        cm7.setBackground(Color.white);
        cm7.setBounds(380,350,150,30);
        add(cm7);
        
           
         JLabel Cocktails = new JLabel("COCKTAILS");
         Cocktails.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Cocktails.setBounds(60,400,120,30);
        add(Cocktails);

        txt8 = new JTextField();
        txt8.setBounds(185,400,150,30);
        add(txt8);
        
        String str8[] ={"AVAILABLE","NOT AVAILABLE"};
        cm8 = new JComboBox(str6);
        cm8.setBackground(Color.white);
        cm8.setBounds(380,400,150,30);
        add(cm8);


      
        btn1 = new JButton("Done");
        btn1.setBackground(Color.LIGHT_GRAY);
        btn1.setForeground(Color.white);
        btn1.setBounds(200,480,120,30);
        btn1.addActionListener(this);
        add(btn1);
        
        
          btn2 = new JButton("Back");
        btn2.setBackground(Color.LIGHT_GRAY);
        btn2.setForeground(Color.white);
        btn2.setBounds(55,480,100,30);
        btn2.addActionListener(this);
        add(btn2);
        
          btn3 = new JButton("Add Drinks");
        btn3.setBackground(Color.LIGHT_GRAY);
        btn3.setForeground(Color.white);
        btn3.setBounds(390,480,120,30);
        btn3.addActionListener(this);
        add(btn3);

      // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/Drinks.jpg"));
       // Image i2 = i1.getImage().getScaledInstance();
        // Image i3 = new ImageIcon(i2);
        //JLabel lbl1 = new JLabel(i1);
        //lbl1.setBounds(400,30,600,600);
        //add(lbl1);
        
        
          ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("HMS/Images/Drinks.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l15 = new JLabel(i2);
        l15.setBounds(450,70,700,420);
        add(l15);


        JLabel lbl3 = new JLabel("STATUS ");
        lbl3.setForeground(Color.blue);
        lbl3 .setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbl3.setBounds(400,10,300,30);
        add(lbl3);
        
        JLabel lbl4 = new JLabel("ITEMS LIST ");
        lbl4.setForeground(Color.blue);
        lbl4 .setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbl4.setBounds(60,10,300,30);
        add(lbl4);
        
        JLabel lbl5 = new JLabel("PRICE");
        lbl5.setForeground(Color.blue);
        lbl5 .setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbl5.setBounds(220,10,300,30);
        add(lbl5);
        
        
        
        
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(300,160,1100,650);
        setVisible(true);
    }

      
    
    public void actionPerformed(ActionEvent e){
         if(e.getSource()==btn1){
     String Hotdrinks = txt1.getText();
        String Softdrinks = txt2.getText();
        String Coffee = txt3.getText();
        String Tea  = txt4.getText();
        String Liqueur = txt5.getText();
        String Wine = txt6.getText();
        String Beer = txt7.getText();
        String Cocktails = txt8.getText();
       
       

        String Hotdrinks1=(String) cm1.getSelectedItem();
        String Softdrinks1=(String) cm2.getSelectedItem();
        String Coffee1=(String) cm3.getSelectedItem();
        String Tea1=(String) cm4.getSelectedItem();
        String Liqueur1=(String) cm5.getSelectedItem();
        String Wine1=(String) cm6.getSelectedItem();
        String Beer1=(String) cm7.getSelectedItem();
        String Cocktails1=(String) cm8.getSelectedItem();
        
                conn c = new conn();
        String str = "insert into Drinks values('"+Hotdrinks+"','"+Softdrinks+"','"+Coffee+"','"+Tea+"','"+Liqueur+"','"+Wine+"','"+Beer+"','"+Cocktails+"')";

        try{
           
             c.s.executeUpdate(str);
         JOptionPane.showMessageDialog(null,"Drinks Successfully Added");
         setVisible(false);
           
        }
        catch (Exception a) {
                        a.printStackTrace();
        	    }
            
        
            new Homepage().setVisible(true);
            this.setVisible(false);


       
           } if(e.getSource()==btn3){
            new AddDrinks().setVisible(true);
            this.setVisible(false);
            
        } if(e.getSource()==btn2){
            new Food().setVisible(true);
            this.setVisible(false);
        }
        
        
    }


    public static void main(String[]args){
        new Drinks();
    }
}

