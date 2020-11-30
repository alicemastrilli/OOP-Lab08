package it.unibo.oop.lab.mvcio;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/**
 * A very simple program using a graphical interface.
 * 
 */
public final class SimpleGUI {

    private final JFrame frame = new JFrame();
    public void start() {
        frame.setVisible(true);
    }
   
    SimpleGUI(final Controller ctr) {
        frame.setTitle("My first java graphical interfaces");
         final JPanel MyPanel = new JPanel();
         frame.add(MyPanel);
         MyPanel.setLayout(new BorderLayout());
         final JTextArea testo = new JTextArea("ciao!");
         final JButton bottone = new JButton("Save");
         MyPanel.add(testo, BorderLayout.NORTH);
         MyPanel.add(bottone, BorderLayout.SOUTH);
         frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         final ActionListener listner = new ActionListener() {
            
            
            public void actionPerformed(ActionEvent arg0) {
                if(arg0.getActionCommand().equals("Save")) {
                    try {
                        ctr.write_in_current(testo.getText());
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                
            }
        };
        bottone.setActionCommand("Save");
        bottone.addActionListener(listner);
        
        
        final Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        final int sw = (int) screen.getWidth();
        final int sh = (int) screen.getHeight();
        frame.setSize(sw / 2, sh / 2);
        /*
         * Instead of appearing at (0,0), upper left corner of the screen, this
         * flag makes the OS window manager take care of the default positioning
         * on screen. Results may vary, but it is generally the best choice.
         */
        frame.setLocationByPlatform(true);
    }
   
        public static void main(final String... a) {
            final SimpleGUI gui = new SimpleGUI(new Controller());
            gui.start();
        }
    
    
    /*
     * Once the Controller is done, implement this class in such a way that:
     * 
     * 1) It has a main method that starts the graphical application
     * 
     * 2) In its constructor, sets up the whole view
     * 
     * 3) The graphical interface consists of a JTextArea with a button "Save" right
     * below (see "ex02.png" for the expected result). SUGGESTION: Use a JPanel with
     * BorderLayout
     * 
     * 4) By default, if the graphical interface is closed the program must exit
     * (call setDefaultCloseOperation)
     * 
     * 5) The program asks the controller to save the file if the button "Save" gets
     * pressed.
     * 
     * Use "ex02.png" (in the res directory) to verify the expected aspect.
     */

    /**
     * builds a new {@link SimpleGUI}.
     */
    
}
