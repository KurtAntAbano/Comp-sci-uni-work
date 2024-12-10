import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    JLabel label; // Label for message
    JButton multiplyButton; // Button
    JButton divideButton;
    JButton additionButton;
    JButton minusButton;
    JTextField inputField = new JTextField(20); // First text field
    JTextField inputField2 = new JTextField(20); // Second text field


    MyPanel(String message) { // Constructor
        label = new JLabel(message);
        multiplyButton = new JButton("x");
        divideButton = new JButton("%");
        additionButton = new JButton("+");
        minusButton = new JButton("-");

        // Adding ActionListener to the button
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve input from both text fields
                int num1 = Integer.parseInt(inputField.getText());
                int num2 = Integer.parseInt(inputField2.getText());
                int answer = num1 * num2;
                label.setText("Result: " + answer);

            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve input from both text fields
                int num1 = Integer.parseInt(inputField.getText());
                int num2 = Integer.parseInt(inputField2.getText());
                int answer = num1 / num2;
                label.setText("Result: " + answer);

            }
        });

        additionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve input from both text fields
                int num1 = Integer.parseInt(inputField.getText());
                int num2 = Integer.parseInt(inputField2.getText());
                int answer = num1 + num2;
                label.setText("Result: " + answer);

            }
        });

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve input from both text fields
                int num1 = Integer.parseInt(inputField.getText());
                int num2 = Integer.parseInt(inputField2.getText());
                int answer = num1 - num2;
                label.setText("Result: " + answer);

            }
        });



        // Adding components to the panel
        add(label);         // Add the label
        add(inputField);    // Add the first text field
        add(inputField2);   // Add the second text field
        add(multiplyButton);      // Add the button
        add(divideButton);
        add(additionButton);
        add(minusButton);

    }
}
