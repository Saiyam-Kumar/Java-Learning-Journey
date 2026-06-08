// AWT(Abstract Window Toolkit) is an API to develop GUI or Window based Appllications in Java

import java.awt.*; // contains various classes such as Textfield,Label,TextArea,CheckBox,ChoiceList etc.
import java.awt.event.*; // provides event classes such as Action event, Mouse event, Key event, Window event.

public class AButtonEvent extends Frame implements ActionListener {
    TextField tf;
    Label l;
    Button b;

    AButtonEvent() {
        tf = new TextField();
        tf.setBounds(50, 50, 150, 30);

        b = new Button("Submit");
        b.setBounds(50, 100, 100, 30);

        l = new Label("Output");
        l.setBounds(50, 150, 200, 30);

        b.addActionListener(this);

        add(tf);
        add(b);
        add(l);

        setSize(300, 250);
        setLayout(null);
        setVisible(true);
        
        //AWT -> doesn't close window automatically 
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    //Handling a Event
    public void actionPerformed(ActionEvent e) {
        l.setText("Hello " + tf.getText());
    }

    public static void main(String[] args) {
        new AButtonEvent();
    }
}