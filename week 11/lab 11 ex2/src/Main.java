import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("calculator");
        f.setSize(600, 200);
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

// add an instance of MyPanel
        f.add( new MyPanel() );
        f.setVisible( true );



    }
}