import java.awt.event.*;
import javax.swing.*;

public class CMouseEventSwing extends JFrame implements MouseListener {

    JLabel label;

    CMouseEventSwing() {

        label = new JLabel("Perform Mouse Action");
        label.setBounds(50, 100, 200, 30);

        add(label);
        addMouseListener(this);

        setTitle("Mouse Event Demo");
        setSize(300, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    //Methods are predefined in Mouse Listener Class
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new CMouseEventSwing();
    }
}