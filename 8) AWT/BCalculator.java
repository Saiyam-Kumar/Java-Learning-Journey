import java.awt.*;
import java.awt.event.*;

public class BCalculator extends Frame implements ActionListener {
    TextField t1, t2, result;
    Button add, sub, mul, div, mod;

    BCalculator() {
        // Input fields
        t1 = new TextField();
        t1.setBounds(50, 50, 100, 30);

        t2 = new TextField();
        t2.setBounds(200, 50, 100, 30);

        // Buttons
        add = new Button("+");
        add.setBounds(50, 100, 50, 30);

        sub = new Button("-");
        sub.setBounds(110, 100, 50, 30);

        mul = new Button("*");
        mul.setBounds(170, 100, 50, 30);

        div = new Button("/");
        div.setBounds(230, 100, 50, 30);

        mod = new Button("%");
        mod.setBounds(290, 100, 50, 30);

        // Result field
        result = new TextField();
        result.setBounds(50, 170, 250, 30);
        result.setEditable(false);

        // Register listeners
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);

        // Add components
        add(t1);
        add(t2);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(mod);
        add(result);

        // Frame settings
        setSize(400, 300);
        setTitle("Simple Calculator");
        setLayout(null);
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        if (e.getSource() == add) {
            result.setText(String.valueOf(a + b));
        }
        else if (e.getSource() == sub) {
            result.setText(String.valueOf(a - b));
        }
        else if (e.getSource() == mul) {
            result.setText(String.valueOf(a * b));
        }
        else if (e.getSource() == div) {
            if (b != 0)
                result.setText(String.valueOf(a / b));
            else
                result.setText("Cannot divide by zero");
        }
        else if (e.getSource() == mod) {
            if (b != 0)
                result.setText(String.valueOf(a % b));
            else
                result.setText("Cannot mod by zero");
        }
    }

    public static void main(String[] args) {
        new BCalculator();
    }
}