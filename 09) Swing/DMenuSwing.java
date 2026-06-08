import java.awt.event.*;
import javax.swing.*;

public class DMenuSwing extends JFrame implements ActionListener {

    JMenuItem open, exit;
    JLabel label;

    DMenuSwing() {

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        open = new JMenuItem("Open");
        exit = new JMenuItem("Exit");

        fileMenu.add(open);
        fileMenu.add(exit);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        label = new JLabel("Choose a menu item");
        label.setBounds(100, 100, 200, 30);

        add(label);

        open.addActionListener(this);
        exit.addActionListener(this);

        setTitle("Menu Demo");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == open) {
            label.setText("Open Selected");
        }

        if (e.getSource() == exit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new DMenuSwing();
    }
}