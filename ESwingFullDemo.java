import java.awt.event.*;
import javax.swing.*;

public class ESwingFullDemo extends JFrame implements ActionListener {

    JTextField name;
    JPasswordField pass;
    JTextArea output;
    JComboBox<String> country;
    JCheckBox terms;
    JRadioButton male, female;
    JButton submit;

    ESwingFullDemo() {

        setTitle("Swing Full Demo");
        setSize(500, 500);
        setLayout(null);

        // 🔷 MENU
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem about = new JMenuItem("About");

        about.addActionListener(e -> {
            JDialog d = new JDialog(this, "About", true);
            d.setSize(200, 150);
            d.setLayout(null);

            JLabel l = new JLabel("Swing Demo App");
            l.setBounds(30, 30, 150, 30);

            d.add(l);
            d.setVisible(true);
        });

        menu.add(about);
        mb.add(menu);
        setJMenuBar(mb);

        // 🔷 TABS
        JTabbedPane tabs = new JTabbedPane();
        tabs.setBounds(0, 0, 500, 450);

        // 🔷 PANEL 1 (FORM)
        JPanel p1 = new JPanel();
        p1.setLayout(null);

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(20, 20, 100, 25);
        p1.add(l1);

        name = new JTextField();
        name.setBounds(120, 20, 150, 25);
        p1.add(name);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(20, 60, 100, 25);
        p1.add(l2);

        pass = new JPasswordField();
        pass.setBounds(120, 60, 150, 25);
        p1.add(pass);

        JLabel l3 = new JLabel("Gender:");
        l3.setBounds(20, 100, 100, 25);
        p1.add(l3);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        male.setBounds(120, 100, 70, 25);
        female.setBounds(200, 100, 80, 25);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        p1.add(male);
        p1.add(female);

        JLabel l4 = new JLabel("Country:");
        l4.setBounds(20, 140, 100, 25);
        p1.add(l4);

        String countries[] = {"India", "USA", "UK"};
        country = new JComboBox<>(countries);
        country.setBounds(120, 140, 150, 25);
        p1.add(country);

        terms = new JCheckBox("Accept Terms");
        terms.setBounds(120, 180, 150, 25);
        p1.add(terms);

        submit = new JButton("Submit");
        submit.setBounds(120, 220, 100, 30);
        submit.addActionListener(this);
        p1.add(submit);

        // 🔷 PANEL 2 (OUTPUT)
        JPanel p2 = new JPanel();
        p2.setLayout(null);

        output = new JTextArea();
        output.setBounds(20, 20, 400, 300);
        p2.add(output);

        // 🔷 ADD TABS
        tabs.add("Form", p1);
        tabs.add("Output", p2);

        add(tabs);

        setVisible(true);
    }

    // 🔷 EVENT HANDLING
    public void actionPerformed(ActionEvent e) {

        String n = name.getText();
        String p = new String(pass.getPassword());
        String g = male.isSelected() ? "Male" : "Female";
        String c = (String) country.getSelectedItem();

        if (!terms.isSelected()) {
            JOptionPane.showMessageDialog(this, "Accept Terms first!");
            return;
        }

        output.setText(
                "Name: " + n +
                "\nPassword: " + p +
                "\nGender: " + g +
                "\nCountry: " + c
        );
    }

    public static void main(String[] args) {
        new ESwingFullDemo();
    }
}