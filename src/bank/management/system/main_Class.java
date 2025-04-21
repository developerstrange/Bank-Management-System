package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {

    String pin;
    JButton b1,b2,b3,b4,b5,b6,b7;

    main_Class(String pin){
        super("Bank Management System");
        this.pin = pin;


        JLabel level1 = new JLabel("Please Enter Your Choice: ");
        level1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        level1.setForeground(Color.WHITE);
        level1.setBounds(550,320,500,25);
        add(level1);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(390,395,230,27);
        b1.setFont(new Font("Times New Roman", Font.BOLD,20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CASH WITHDRAW");
        b2.setBounds(745,395,230,27);
        b2.setFont(new Font("Times New Roman", Font.BOLD,20));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("FAST CASH");
        b3.setBounds(390,428,230,27);
        b3.setFont(new Font("Times New Roman", Font.BOLD,20));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("MINI STATEMENT");
        b4.setBounds(745,428,230,27);
        b4.setFont(new Font("Times New Roman", Font.BOLD,20));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        add(b4);

        b5 = new JButton("PIN CHANGE");
        b5.setBounds(390,460,230,27);
        b5.setFont(new Font("Times New Roman", Font.BOLD,20));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setBounds(745,460,230,27);
        b6.setFont(new Font("Times New Roman", Font.BOLD,20));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        add(b6);

        b7 = new JButton("EXIT");
        b7.setBounds(745,493,230,27);
        b7.setFont(new Font("Times New Roman", Font.BOLD,20));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.addActionListener(this);
        add(b7);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm-icon.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(-90,-35,1550,900);
        add(l3);

        setLayout(null);
        setLocation(0,0);
        setSize(1550,1060);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            new Deposite(pin);
            setVisible(false);
        }else if (e.getSource()==b7){
            System.exit(0);
        } else if (e.getSource()==b2) {
            new withdrawl(pin);
            setVisible(false);
        }else if (e.getSource()==b6) {
            new BalanceEnquiry(pin);
            setVisible(false);
        } else if (e.getSource()==b3) {
            new FastCash(pin);
            setVisible(false);
        }else if (e.getSource()==b5) {
            new Pin(pin);
            setVisible(false);
        }else if (e.getSource()==b4) {
            new mini(pin);
        }
    }

    public static void main(String[] args) {
        new main_Class("");
    }
}
