package dty.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFrame extends JFrame {
    
    public TestFrame() {
        // code that sets up the frame
        this.setTitle("Test Frame");
        this.setSize(400, 100);
        this.setLocationByPlatform(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        this.add(panel);

        // code that create the button the button and adds the listner
        JButton button1 = new JButton("Test Button");
        ActionListener listener =  new ClickListener();
        button1.addActionListener(listener);

        // code that display the frame
        panel.add(button1);
        this.setVisible(true);
    }

    // this inner class that implements the listener
    class ClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("The button was clicked!");
        }
    }

}
