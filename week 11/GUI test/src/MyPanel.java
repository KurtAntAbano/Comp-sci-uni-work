import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    JLabel label; // Data members
    JButton OKButton;
    JTextField inputField = new JTextField(20); // create a text field 20 characters wide

    MyPanel(String message) { // message is passed from main as a parameter
        label = new JLabel(message);
        OKButton = new JButton("OK");

        // Adding ActionListener to the button
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputString = inputField.getText(); // retrieve the user's input
                System.out.println("User input: " + inputString); // print the input for now
            }
        });

        // Adding components to the panel
        add(label);
        add(inputField);
        add(OKButton);
    }
}
