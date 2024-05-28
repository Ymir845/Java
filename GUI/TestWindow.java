import java.awt.*; // Imports all of JavaAWT

public class App extends Frame{ // Extending Frame to App

        App(){ // Initialising 
            Button testButton = new Button("test");
            testButton.setBounds(30,100,60,20); // Position and Size of Button
            add (testButton);

            setSize(300,300); // Size of the Window
            setLayout(null); // no layout manager
            setVisible(true); // Makes the Window(Frame) visible
            setTitle("TestWindow");
        }


    

        public static void main(String[]args){ // main method
    App f = new App(); // creating instance of Frame class
}

}
