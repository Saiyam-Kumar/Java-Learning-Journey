import java.awt.*;
import java.awt.event.*;

public class CCheckboxDemo extends Frame implements ItemListener {

    Checkbox java, python;
    Label l;

    CCheckboxDemo() {

        java = new Checkbox("Java");
        python = new Checkbox("Python");

        java.setBounds(50, 50, 100, 30);
        python.setBounds(50, 100, 100, 30);

        l = new Label();
        l.setBounds(50, 150, 250, 30);

        java.addItemListener(this);
        python.addItemListener(this);

        add(java);
        add(python);
        add(l);

        setSize(300, 250);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void itemStateChanged(ItemEvent e) {

        String selected = "";

        if (java.getState())
            selected += "Java ";

        if (python.getState())
            selected += "Python";

        l.setText("Selected: " + selected);
    }

    public static void main(String[] args) {
        new CCheckboxDemo();
    }
}