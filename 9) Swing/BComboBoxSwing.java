import java.awt.event.*;
import javax.swing.*;

public class BComboBoxSwing extends JFrame implements ActionListener {

    JComboBox<String> combo;
    JLabel label;

    BComboBoxSwing() {

        String[] branches = {"CSE", "IT", "ECE", "ME"};

        combo = new JComboBox<>(branches);
        combo.setBounds(50, 50, 120, 30);

        label = new JLabel("Select Branch");
        label.setBounds(50, 100, 200, 30);

        combo.addActionListener(this);

        add(combo);
        add(label);

        setTitle("ComboBox Demo");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Selected: " + combo.getSelectedItem());
    }

    public static void main(String[] args) {
        new BComboBoxSwing();
    }
}