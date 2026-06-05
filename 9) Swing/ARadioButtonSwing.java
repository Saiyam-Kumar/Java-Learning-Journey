//Swing -> Java tool to create GUI (windows,Buttons etc)
//Modern looking apps written fully in Java better than AWT

import java.awt.event.*;
import javax.swing.*;

public class ARadioButtonSwing extends JFrame implements ActionListener {

    JRadioButton male, female;
    JLabel label;
    ButtonGroup group;

    ARadioButtonSwing() {

        male = new JRadioButton("Male");
        male.setBounds(50, 50, 100, 30);

        female = new JRadioButton("Female");
        female.setBounds(50, 100, 100, 30);

        group = new ButtonGroup();
        group.add(male);
        group.add(female);

        label = new JLabel("Select Gender");
        label.setBounds(50, 150, 200, 30);

        male.addActionListener(this);
        female.addActionListener(this);

        add(male);
        add(female);
        add(label);

        setTitle("Radio Button Demo");
        setSize(300, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (male.isSelected())
            label.setText("Selected: Male");
        else if (female.isSelected())
            label.setText("Selected: Female");
    }

    public static void main(String[] args) {
        new ARadioButtonSwing();
    }
}