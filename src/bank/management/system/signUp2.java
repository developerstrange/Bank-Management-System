package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signUp2 extends JFrame implements ActionListener {

    String formno;

    JComboBox comboBox1, comboBox2, comboBox3, comboBox4, comboBox5;

    JTextField textid;
    JRadioButton s1,s2,a1,a2;
    JButton next;

    signUp2(String formno){
        super("Sing Up");

        ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank-icon5.png"));
        Image j2 = j1.getImage().getScaledInstance(80,80, Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel image = new JLabel(j3);
        image.setBounds(430,-40,170,170);
        add(image);

        this.formno = formno;

        JLabel level12 = new JLabel("APPLICATION FORM");
        level12.setFont(new Font("Times New Roman", Font.BOLD, 20));
        level12.setBounds(400, -140, 500, 500);
        add(level12);

        JLabel level22 = new JLabel("Page No: 2");
        level22.setFont(new Font("Times New Roman", Font.BOLD, 20));
        level22.setBounds(480, -20, 300, 300);
        add(level22);


        JLabel level32 = new JLabel("Additional Details    :");
        level32.setFont(new Font("Times New Roman", Font.BOLD, 22));
        level32.setBounds(255,10, 300, 300);
        add(level32);

        JLabel levelreligion = new JLabel("Religion                         : ");
        levelreligion.setFont(new Font("Times New Roman", Font.BOLD, 21));
        levelreligion.setBounds(250, 42, 300, 300);
        add(levelreligion);


        String[] religion = {"Muslim", "Christian", "Buddha", "Hindu", "Other"};
        comboBox1 = new JComboBox(religion);
        comboBox1.setBackground(new Color(135,230,230));
        comboBox1.setFont(new Font("Times New Roman", Font.BOLD,19));
        comboBox1.setBounds(470,182,200,20);
        add(comboBox1);

        JLabel levelcategory = new JLabel("Category                       :");
        levelcategory.setFont(new Font("Times New Roman", Font.BOLD,21));
        levelcategory.setBounds(250,70,300,300);
        add(levelcategory);

        String[] category = {"General","OBC","ST","SC","Student","Others"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(135,230,230));
        comboBox2.setFont(new Font("Times New Roman", Font.BOLD, 19));
        comboBox2.setBounds(470,210,200,20);
        add(comboBox2);

        JLabel levelIncome = new JLabel("Income                          : ");
        levelIncome.setFont(new Font("Times New Roman", Font.BOLD,21));
        levelIncome.setBounds(251,98,300,300);
        add(levelIncome);

        String[] income = {"less than 1000", "<150000", "<200000","<500000","Up-to 1000000","Above 100000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(135,230,230));
        comboBox3.setBounds(470,238,200,20);
        comboBox3.setFont(new Font("Times New Roman", Font.BOLD,19));
        add(comboBox3);

        JLabel levelProfession = new JLabel("Profession                     : ");
        levelProfession.setFont(new Font("Times New Roman", Font.BOLD, 21));
        levelProfession.setBounds(249,127,300,300);
        add(levelProfession);

        String[] profession = {"Student","Government Employee", "Doctor", "Engineer", "Businessman", "Teacher", "Other"};
        comboBox4 = new JComboBox(profession);
        comboBox4.setBackground(new Color(135,230,230));
        comboBox4.setFont(new Font("Times New Roman", Font.BOLD,19));
        comboBox4.setBounds(470,267,200,20);
        add(comboBox4);

        JLabel levelEdu = new JLabel("Educational Q.F          : ");
        levelEdu.setFont(new Font("Times New Roman", Font.BOLD, 21));
        levelEdu.setBounds(249,156,300,300);
        add(levelEdu);

        String[] education = {"Under-Graduate","Graduate","Post-Graduate","Doctorate","Others"};
        comboBox5 = new JComboBox(education);
        comboBox5.setBackground(new Color(135,230,230));
        comboBox5.setFont(new Font("Times New Roman", Font.BOLD,19));
        comboBox5.setBounds(470,295,200,20);
        add(comboBox5);

        JLabel levelId = new JLabel("ID Number                     : ");
        levelId.setBounds(249, 182, 300, 300);
        levelId.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(levelId);

        textid = new JTextField();
        textid.setBounds(468, 325, 200, 22);
        textid.setFont(new Font("Times New Roman", Font.BOLD, 19));
        add(textid);

        JLabel levelcitize = new JLabel("Senior Citizen               : ");
        levelcitize.setBounds(251, 210, 300, 300);
        levelcitize.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(levelcitize);

        s1 = new JRadioButton("Yes");
        s1.setBackground(new Color(135, 230, 230));
        s1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        s1.setBounds(465,350, 80, 22);
        add(s1);

        s2 = new JRadioButton("No");
        s2.setBackground(new Color(135, 230, 230));
        s2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        s2.setBounds(615,352, 80, 22);
        add(s2);

        ButtonGroup buttonGroup3 = new ButtonGroup();
        buttonGroup3.add(s1);
        buttonGroup3.add(s2);

        JLabel levelac = new JLabel("Existing Acc.                 : ");
        levelac.setBounds(251, 235, 300, 300);
        levelac.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(levelac);

        a1 = new JRadioButton("Yes");
        a1.setBackground(new Color(135, 230, 230));
        a1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        a1.setBounds(465,375, 80, 22);
        add(a1);

        a2 = new JRadioButton("No");
        a2.setBackground(new Color(135, 230, 230));
        a2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        a2.setBounds(615,375, 80, 22);
        add(a2);

        ButtonGroup buttonGroup4 = new ButtonGroup();
        buttonGroup4.add(a1);
        buttonGroup4.add(a2);


        JLabel levelfn = new JLabel("Form No: ");
        levelfn.setBounds(800, 00, 100, 60);
        levelfn.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(levelfn);

        JLabel levelfn1 = new JLabel(formno);
        levelfn1.setBounds(880, 6, 100, 50);
        levelfn1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(levelfn1);



        next = new JButton("Next");
        next.setBounds(820, 480, 90,35);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        setFont(new Font("Times New Roman", Font.BOLD, 45));
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(135, 230, 230));
        setLayout(null);
        setSize(1050, 600);
        setLocation(180,80);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String rel = (String) comboBox1.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String income = (String) comboBox3.getSelectedItem();
        String profession = (String) comboBox4.getSelectedItem();
        String education = (String) comboBox5.getSelectedItem();

        String id = textid.getText();
        String scitizen = null;
        if(s1.isSelected()){
            scitizen = "Yes";
        } else if (s2.isSelected()) {
            scitizen = "No";

        }
        String e_acount = null;
        if(a1.isSelected()){
            e_acount = "Yes";
        }else if(a2.isSelected()){
            e_acount="No";
        }

        try{
            if(textid.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill required field");
            }
            else {
                Con c = new Con();
                String q = "insert into Signuptwo values('"+formno+"', '"+rel+"', '"+cate+"','"+income+"','"+education+"','"+profession+"','"+id+"','"+scitizen+"','"+e_acount+"')";
                c.statement.executeUpdate(q);
                new signUp3(formno);
                setVisible(false);


            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new signUp2("");
    }

}
