package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    String pin;
    JButton b1,b2,b3,b4,b5,b6,b7;


    FastCash(String pin){
        super("Bank Management System");
        this.pin = pin;

        JLabel level1 = new JLabel("Please Select Your Amount: ");
        level1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        level1.setForeground(Color.WHITE);
        level1.setBounds(550,320,500,25);
        add(level1);

        b1 = new JButton("Tk. 500");
        b1.setBounds(390,395,230,27);
        b1.setFont(new Font("Times New Roman", Font.BOLD,20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Tk. 1000");
        b2.setBounds(745,395,230,27);
        b2.setFont(new Font("Times New Roman", Font.BOLD,20));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Tk. 1500");
        b3.setBounds(390,428,230,27);
        b3.setFont(new Font("Times New Roman", Font.BOLD,20));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("Tk. 2000");
        b4.setBounds(745,428,230,27);
        b4.setFont(new Font("Times New Roman", Font.BOLD,20));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        add(b4);

        b5 = new JButton("Tk. 2500");
        b5.setBounds(390,460,230,27);
        b5.setFont(new Font("Times New Roman", Font.BOLD,20));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton("Tk. 5000");
        b6.setBounds(745,460,230,27);
        b6.setFont(new Font("Times New Roman", Font.BOLD,20));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        add(b6);

        b7 = new JButton("BACK");
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

        if(e.getSource()==b7){
            setVisible(false);
            new main_Class(pin);
        }else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Con c = new Con();
            Date date = new Date();
            try{
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance = 0;
                while(resultSet.next()){
                    if(resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }

                if(e.getSource() != b7 && balance< Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }

                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Tk. "+ amount + "Withdraws Successfully!");

            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new main_Class(pin);
        }

    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
