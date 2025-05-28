package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2;
    JCheckBox c1,c2,c3,c4;
    JButton s,c;
    String formno;
    Signup3(String formno){
        this.formno=formno;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank (1).png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(130,10,100,100);
        add(image);

        JLabel l1=new JLabel("Page 3:");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,20,100,100);
        add(l1);


        JLabel l2=new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,50,200,100);
        add(l2);


        JLabel l3=new JLabel("Account Type:");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,110,200,100);
        add(l3);

        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(215,252,252));
        r1.setBounds(100,190,200,30);
        add(r1);

        r2=new JRadioButton("Current Account");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(215,252,252));
        r2.setBounds(300,190,200,30);
        add(r2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l4=new JLabel("Card Number :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,200,200,100);
        add(l4);

        JLabel l5=new JLabel("( Your 16-digit card number ) :");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,270,200,30);
        add(l5);

        JLabel l6=new JLabel("XXXXX-XXXX139-7");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(400,240,200,30);
        add(l6);

        JLabel l7=new JLabel("( it would appear on ATM card/Cheque Book and statement ) ");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(350,270,500,30);
        add(l7);

        JLabel l8=new JLabel("PIN :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,290,200,100);
        add(l8);

        JLabel l9=new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(350,290,200,100);
        add(l9);

        JLabel l10=new JLabel("( 4-digit password ) ");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,355,500,30);
        add(l10);

        JLabel l11=new JLabel("Services Required :");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,375,200,100);
        add(l11);

        c1=new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBackground(new Color(215,252,252));
        c1.setBounds(100,450,150,30);
        add(c1);

        c2=new JCheckBox("Fund Transfer");
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBackground(new Color(215,252,252));
        c2.setBounds(300,450,200,30);
        add(c2);

        c3=new JCheckBox("Loan Management");
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBackground(new Color(215,252,252));
        c3.setBounds(100,490,200,30);
        add(c3);

        c4=new JCheckBox("Bill Payment");
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBackground(new Color(215,252,252));
        c4.setBounds(300,490,200,30);
        add(c4);

        JLabel l12=new JLabel("Form No:");
        l12.setFont(new Font("Raleway",Font.BOLD,12));
        l12.setBounds(650,10,200,30);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(700,10,100,30);
        add(l13);

        s=new JButton("Submit");
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.white);
        s.setBounds(280,580,100,30);
        s.addActionListener(this);
        add(s);

        c=new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.white);
        c.setBounds(450,580,100,30);
        c.addActionListener(this);
        add(c);


        getContentPane().setBackground(new Color(215,252,252));
        setLayout(null);
        setSize(850,700);
        setLocation(360,40);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String Atype=null;
        if(r1.isSelected()){
            Atype="Saving Account";
        } else if (r2.isSelected()) {
            Atype="Current Account";
        }
        Random rand = new Random();
        long firstPart = 1000000000000L + (long)(rand.nextDouble() * 9000000000000L); // Range: 1000000000000 to 9999999999999
        String cardno = String.valueOf(firstPart);

        long first3=(rand.nextLong()%9000L+1000L);
        String pin=""+Math.abs(first3);

        String fac="";
        if(c1.isSelected()){
            fac +="ATM CARD";
        } else if (c2.isSelected()) {
            fac +="Fund Transfer";
        } else if (c3.isSelected()) {
            fac +="Loan Management";
        } else if (c4.isSelected()) {
            fac +="Bill Payment";
        }
        try{
            if(e.getSource()==s) {
                if (Atype.equals("")) {
                    JOptionPane.showMessageDialog(null, "Account Type field must be filled");
                } else {
                    Con c1 = new Con();
                    String q1 = "insert into signupthree values('" + formno + "','" + Atype + "','" + cardno + "','" + pin + "','" + fac + "')";
                    String q2 = "insert into login values('" + formno + "','" + cardno + "','" + pin + "')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number :" + cardno + "\nPin :" + pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==c) {
                System.exit(0);
            }

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        new Signup3(" ");
    }
}
