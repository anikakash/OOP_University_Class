package com.company;
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
class project01 extends JFrame implements ActionListener{
    JFrame frame;
    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2, t3, t4;
    JButton b1;
    project01(){
        this.frame = new JFrame();
        this.l1 = new JLabel("Name: ");
        this.t1 = new JTextField(10);
        this.l2 = new JLabel("Designation: ");
        this.t2 = new JTextField(10);
        this.l3 = new JLabel("Salary: ");
        this.t3 = new JTextField(10);
        this.l4 = new JLabel("Overtime: ");
        this.t4 = new JTextField(10);
        this.b1 = new JButton("salary");
        this.l5 = new JLabel();
        this.setLayout(new FlowLayout());
        this.setSize(240, 300);
        this.setTitle("Login page");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        add(l5);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = t1.getText();
        String designation = t2.getText();
        int salary = Integer.parseInt(t3.getText());
        int overtime = Integer.parseInt(t4.getText());
        int main_salary;
        if (designation.equals("CEO")){
            main_salary = salary+(500*overtime);
            l5.setText("Salary = " + main_salary);
        }
        if (designation.equals("AGM")){
            main_salary = salary+(600*overtime);
            l5.setText("Salary = " + main_salary);
        }
        if (designation.equals("DGM")){
            main_salary = salary+(700*overtime);
            l5.setText("Salary = " + main_salary);
        }
        if (designation.equals("M")){
            main_salary = salary+(900*overtime);
            l5.setText("Salary = " + main_salary);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        project01 n = new project01();
    }
}