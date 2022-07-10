import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class window extends JFrame
{
    // Anfang Attribute
    logic l = new logic();
    // Ende Attribute
    
    public window()
    {
        // Frame-Initialisierung
        super();
        Container cp = getContentPane();
        cp.setLayout(null);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        int frameWidth = 300;
        int frameHeight = 300;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("Idiotentest");
        setResizable(false);
        
        // Anfang Komponenten
        JButton j = new JButton();
        j.setText("asdf");
        
        cp.add(j);
        // Ende Komponenten
        
        setVisible(true);
    } // end of public window
    
    public static void main(String[] args)
    {
        new window();
    }
    // Ende Methoden
} // end of class window
