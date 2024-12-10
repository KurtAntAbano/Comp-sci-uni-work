import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("hello, world");
        f.setSize(300, 200);
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

// add an instance of MyPanel
        String message = "yes";
        f.add( new MyPanel(message) );
        f.setVisible( true );



    }
}