package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposite extends JFrame implements ActionListener {

    String pin;

    JTextField textField1;

    JButton d,b;

    Deposite(String pin){
        super("Bank Management System");
        this.pin = pin;

        JLabel level1 = new JLabel("Enter your amount you want to Deposit: ");
        level1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        level1.setForeground(Color.WHITE);
        level1.setBounds(460,320,500,25);
        add(level1);



        textField1 = new JTextField();
        textField1.setBackground(new Color(155,230,230));
        textField1.setForeground(Color.BLACK);
        textField1.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField1.setBounds(500,350,350,22);
        add(textField1);

        d = new JButton("DEPOSIT");
        d.setBounds(830,465,130,28);
        d.setFont(new Font("Times New Roman", Font.BOLD,20));
        d.setBackground(Color.BLACK);
        d.setForeground(Color.WHITE);
        d.addActionListener(this);
        add(d);

        b = new JButton("BACK");
        b.setBounds(830,495,130,28);
        b.setFont(new Font("Times New Roman", Font.BOLD,20));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.addActionListener(this);
        add(b);

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
        try {
            String amount = textField1.getText();
            Date date = new Date();
            if (e.getSource()==d){
                if (textField1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the Amount you want to Deposit");
                }else {
                    Con c = new Con();
                    c.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"','Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Your Tk. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }
            } else if (e.getSource()==b) {
                setVisible(false);
                new main_Class(pin);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Deposite("");
    }

}
