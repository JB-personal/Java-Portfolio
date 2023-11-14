package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    /* JFrame creates a graphics configuration of a
        device screen
         */
    JLabel welcomeLabel, cardNumberLabel, pinNumberLabel;
    JTextField cardNUmberField;
    JPasswordField pinNumberField;

    JButton signInButton, clearButton, signUpButton;
    Login(){
        // the frame that we will be operating inside

        // the images used for the GUI
        super("JB's Bank Ltd");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel bankImage = new JLabel(i3);
        bankImage.setBounds(350,10,100,100);
        add(bankImage);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel cardImage = new JLabel(ii3);
        cardImage.setBounds(630,350,100,100);
        add(cardImage);

        // the labels that are used to denote the different fields and buttons
        welcomeLabel = new JLabel("WELCOME TO ATM");
        welcomeLabel.setForeground(Color.WHITE);
        welcomeLabel.setFont(new Font("AvantGarde", Font.BOLD, 38));
        welcomeLabel.setBounds(230,125,450,40);
        add(welcomeLabel);

        cardNumberLabel = new JLabel("Card No:");
        cardNumberLabel.setFont(new Font("Ralway", Font.BOLD, 28));
        cardNumberLabel.setForeground(Color.WHITE);
        cardNumberLabel.setBounds(150,190,375,30);
        add(cardNumberLabel);

        cardNUmberField = new JTextField(15);
        cardNUmberField.setBounds(325,190,230,30);
        cardNUmberField.setFont(new Font("Arial", Font.BOLD,14));
        add(cardNUmberField);

        pinNumberLabel = new JLabel("Pin:");
        pinNumberLabel.setFont(new Font("Ralway", Font.BOLD, 28));
        pinNumberLabel.setForeground(Color.WHITE);
        pinNumberLabel.setBounds(150,250,375,30);
        add(pinNumberLabel);

        pinNumberField = new JPasswordField(15);
        pinNumberField.setBounds(325,250,230,30);
        pinNumberField.setFont(new Font("Arial", Font.BOLD,14));
        add(pinNumberField);

        signInButton = new JButton("SIGN IN");
        signInButton.setFont(new Font("Arial", Font.BOLD, 14));
        signInButton.setForeground(Color.BLACK);
        signInButton.setBounds(325, 300, 100, 30);
        signInButton.addActionListener(this);
        add(signInButton);

        clearButton = new JButton("CLEAR");
        clearButton.setFont(new Font("Arial", Font.BOLD, 14));
        clearButton.setForeground(Color.BLACK);
        clearButton.setBounds(455, 300, 100, 30);
        clearButton.addActionListener(this);
        add(clearButton);

        signUpButton = new JButton("SIGN UP");
        signUpButton.setFont(new Font("Arial", Font.BOLD, 14));
        signUpButton.setForeground(Color.BLACK);
        signUpButton.setBounds(325, 350, 230, 30);
        signUpButton.addActionListener(this);
        add(signUpButton);


        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel backgroundImage = new JLabel(iii3);
        backgroundImage.setBounds(0,0,850,480);
        add(backgroundImage);





        setLayout(null);
        setSize(850,480);
        setLocation(450, 200);
        setVisible(true);

    }

    // make the buttons do something by implementing the ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource() == signInButton){
                
            } else if (e.getSource() == signUpButton) {
                
            } else if (e.getSource() == clearButton) {
                cardNUmberField.setText("");
                pinNumberField.setText("");
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new Login();
    }
}
