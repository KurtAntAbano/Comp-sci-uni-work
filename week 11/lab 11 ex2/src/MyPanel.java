import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    JLabel Day; // Label for message
    JLabel Month;
    JLabel Year;
    JButton getDay;
    JLabel Result;
    String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};


    JTextField inputField = new JTextField(5); // First text field
    JTextField inputField2 = new JTextField(5); // Second text field
    JTextField inputField3 = new JTextField(5); // Second text field


    MyPanel() { // Constructor
        Day = new JLabel("Day");
        Month = new JLabel("Month");
        Year = new JLabel("Year");
        getDay = new JButton("Get Day");
        Result = new JLabel(" ");


        // Adding ActionListener to the button
        getDay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve input from both text fields
                int day = Integer.parseInt(inputField.getText());
                int month = Integer.parseInt(inputField2.getText());
                int year = Integer.parseInt(inputField3.getText());

                int dayOfWeek = Doomsday.getDayOfWeek(day,month,year);
                Result.setText(day + "/" + month + "/" + year + " is a " + week[dayOfWeek]);





            }
        });



        // Adding components to the panel
        add(Day);         // Add the label
        add(inputField);    // Add the first text field
        add(Month);      // Add the button
        add(inputField2);   // Add the second text field
        add(Year);
        add(inputField3);
        add(getDay);
        add(Result);


    }
}
