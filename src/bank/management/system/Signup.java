package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Signup extends JFrame implements ActionListener{
/*
similarly to how I made the login page GUI,
i must now create the sign in page
 */
    JRadioButton r1, r2, rl1, rl2, rl3, rl4, rl5;
    JButton next;
    JTextField foreNameText, surNameText, emailAddressText, addressText, cityText, postcodeText;
    JDateChooser dateChooser;
    Random randy = new Random();
    long first4 = (randy.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);
    Signup(){
        super("Application Form");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel bankImage = new JLabel(i3);
        bankImage.setBounds(25,10,100,100);
        add(bankImage);

        JLabel applicationNumberLabel = new JLabel("Application form NO#" + first);
        applicationNumberLabel.setBounds(160,20,600,40);
        applicationNumberLabel.setFont(new Font("Raleway", Font.BOLD,38));
        add(applicationNumberLabel);

        JLabel page1Label = new JLabel("Page 1");
        page1Label.setFont(new Font("Raleway", Font.BOLD,22));
        page1Label.setBounds(330,70,600,30);
        add(page1Label);

        JLabel personalDetails = new JLabel("Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD,22));
        personalDetails.setBounds(290,90,600,30);
        add(personalDetails);

        JLabel foreName = new JLabel("Name: ");
        foreName.setFont(new Font("Raleway", Font.BOLD,20));
        foreName.setBounds(100,190,100,30);
        add(foreName);

        foreNameText = new JTextField();
        foreNameText.setFont(new Font("Raleway", Font.BOLD,14));
        foreNameText.setBounds(300,190,400,30);
        add(foreNameText);

        JLabel surName = new JLabel("Surname: ");
        surName.setFont(new Font("Raleway", Font.BOLD,20));
        surName.setBounds(100,240,190,30);
        add(surName);

        surNameText = new JTextField();
        surNameText.setFont(new Font("Raleway", Font.BOLD,14));
        surNameText.setBounds(300,240,400,30);
        add(surNameText);

        JLabel DOB = new JLabel("Date of Birth: ");
        DOB.setFont(new Font("Raleway", Font.BOLD,20));
        DOB.setBounds(100,290,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,400,30);
        add(dateChooser);

        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD,20));
        gender.setBounds(100, 340, 200, 30);
        add(gender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,340,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,340,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        JLabel emailAddress = new JLabel("Email: ");
        emailAddress.setFont(new Font("Raleway", Font.BOLD,20));
        emailAddress.setBounds(100,390,200,30);
        add(emailAddress);

        emailAddressText = new JTextField();
        emailAddressText.setFont(new Font("Raleway", Font.BOLD,14));
        emailAddressText.setBounds(300,390,400,30);
        add(emailAddressText);

        JLabel relationshipStatus = new JLabel("Relationship Status: ");
        relationshipStatus.setFont(new Font("Raleway", Font.BOLD,20));
        relationshipStatus.setBounds(100,440,200,30);
        add(relationshipStatus);

        rl1 = new JRadioButton("Single");
        rl1.setFont(new Font("Raleway", Font.BOLD,14));
        rl1.setBackground(new Color(222,255,228));
        rl1.setBounds(300,440,80,30);
        add(rl1);

        rl2 = new JRadioButton("Married");
        rl2.setFont(new Font("Raleway", Font.BOLD,14));
        rl2.setBackground(new Color(222,255,228));
        rl2.setBounds(380,440,90,30);
        add(rl2);

        rl3 = new JRadioButton("Divorced");
        rl3.setFont(new Font("Raleway", Font.BOLD,14));
        rl3.setBackground(new Color(222,255,228));
        rl3.setBounds(470,440,90,30);
        add(rl3);

        rl4 = new JRadioButton("Widowed");
        rl4.setFont(new Font("Raleway", Font.BOLD,14));
        rl4.setBackground(new Color(222,255,228));
        rl4.setBounds(560,440,90,30);
        add(rl4);

        rl5 = new JRadioButton("Other");
        rl5.setFont(new Font("Raleway", Font.BOLD,14));
        rl5.setBackground(new Color(222,255,228));
        rl5.setBounds(650,440,90,30);
        add(rl5);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(rl1);
        buttonGroup2.add(rl2);
        buttonGroup2.add(rl3);
        buttonGroup2.add(rl4);
        buttonGroup2.add(rl5);


        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway", Font.BOLD,20));
        address.setBounds(100,490,200,30);
        add(address);

        addressText = new JTextField();
        addressText.setFont(new Font("Raleway", Font.BOLD,14));
        addressText.setBounds(300,490,400,30);
        add(addressText);

        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway", Font.BOLD,20));
        city.setBounds(100,540,200,30);
        add(city);

        cityText = new JTextField();
        cityText.setFont(new Font("Raleway", Font.BOLD,14));
        cityText.setBounds(300,540,400,30);
        add(cityText);

        JLabel postcode = new JLabel("Postcode: ");
        postcode.setFont(new Font("Raleway", Font.BOLD,20));
        postcode.setBounds(100,590,200,30);
        add(postcode);

        postcodeText = new JTextField();
        postcodeText.setFont(new Font("Raleway", Font.BOLD,14));
        postcodeText.setBounds(300,590,400,30);
        add(postcodeText);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 710,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    public static void main(String[] args) {

        new Signup();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
