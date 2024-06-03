import java.awt.*; // For Canvas
import javax.swing.*;

public class App extends JFrame{
    private Canvas canvas; // Declare Canvas
    JFrame f;

    App(){
        f = new JFrame(); // Creates an Instance of JFrame, 'f' being the frame
        JButton bttn = new JButton("button"); // Declaring 'bttn' as a JButton variable; "button"
        bttn.setBounds(230,250,20,20);

        f.add(bttn); // Add 'bttn' button into 'f' Frame

        JLabel labl = new JLabel("label");
        labl.setBounds(220,350,20,20);
        f.add(labl);

        f.setSize(500,500); // Dimensions of Frame
        f.setVisible(true);
        f.setLayout(null);
        f.setTitle("SwingTest");

    }

    public static void main(String[]args){

        new App(); // run App

    }
}
