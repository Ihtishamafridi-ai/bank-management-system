package bank.management.System;


import javax.swing.*; // for GUI components like JLabel, JFrame and ImageIcon
import java.awt.*; // for classes like color, font and image
import java.awt.event.ActionEvent; // for handling button click events
import java.awt.event.ActionListener; // for listening to action (like click buttons )

public class Login extends JFrame implements ActionListener {

    JLabel label1, label2, label3 ; // for displaying text : welcome ,card no,pin

    JTextField textField2; //for user to enter card number

    JPasswordField passwordField3; // for user to enter password

    JButton button1,button2,button3; //buttons for sign in ,clear and sign up

    // constructor for login class
    Login(){
        super("Bank Management System"); // call the parent class JFrame constructor with title

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png")); // load bank image icon from folder
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT); //scale the image nicely to fit it the frame
        ImageIcon i3=new ImageIcon(i2); // create a new imageIcon from scaled image so jLabel can show it on th frame
        JLabel image=new JLabel(i3); // create a JLabel to hold image bcz in swing we can't directly add image to frame and sets its position
        image.setBounds(350,10,100,100);
        add(image); // add the image label to the frame

        // sets the card image from icon folder in the frame                            all same procedure just like in the upper one
        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2=ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3=new ImageIcon(ii2);
        JLabel iimage=new JLabel(ii3); // JLabel main work is to show text on frame
        iimage.setBounds(630,350,100,100);
        add(iimage);

        // set text welcome to atm on the frame
        label1 =new JLabel("WELCOME TO ATM"); // since JLabel is used to show text on frame so here we did it
        label1.setForeground(Color.WHITE);// we set colors for the text with help of setForeground()
        label1.setFont(new Font("AvantTGARDE",Font.BOLD,38));// sets the font style,size and type
       label1.setBounds(230,125,450,40);// sets the position and size of the text frame
       add(label1); // add welcome text label to the frame

        // sets text card no on the frame                          same procedure as in welcome atm text
        label2=new JLabel("CARD NO :");
        label2.setFont(new Font("RALWAY",Font.BOLD,28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,30);
        add(label2);

        // sets the text field for card no
        textField2=new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("ARIAL",Font.BOLD,14));
        add(textField2);

        // sets text pin on the frame                         same procedure as in card and in welcome to atm text
        label3=new JLabel("PIN : ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setBounds(150,250,375,30);
        add(label3);

        // set password field for pin                                 same procedure as in upper ones but password is not visible
        passwordField3=new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

        // setting the first SIGN IN button on the frame
        button1=new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this); // make the button clickable
        add(button1);

        // setting clear button on the frame
        button2=new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.white);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);  // make the button clickable
        add(button2);

        // setting the SIGN UP button on the frame
        button3=new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this); // make the button clickable
        add(button3);

        // sets the background of the frame
        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2=iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel iiimage=new JLabel(iii3);  // create a JLabel to display background
        iiimage.setBounds(0,0,850,480); // fill the whole frame
        add(iiimage); // add background image last so it goes behind other elements

        // sets the frame
        setLayout(null);   // sets the layout to null to manually positions components using set bounds
        setSize(850,480); // set window size
        setLocationRelativeTo(null);  // set the position of frame on the screen
        setVisible(true); // make the frame visible

    }

    // method that gets called when a button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button1) {

            } else if (e.getSource() == button2) {
                textField2.setText("");
                passwordField3.setText("");
            } else if (e.getSource() == button3) {

            }
        } catch (Exception E) {
            E.printStackTrace(); // prints error if something goes wrong
        }
    }
    public static void main(String [] args){
        new Login();
    }
}