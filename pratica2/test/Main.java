package pratica2.test;

import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Button Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create a button
        JButton button = new JButton("Click me!");
        button.setBounds(100, 70, 100, 40);

        // Add action listener for button click
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action when button is pressed
                JOptionPane.showMessageDialog(frame, "Button was clicked!");
                System.out.println("Button pressed!");
            }
        });

        // Add button to frame
        frame.add(button);

        // Make frame visible
        frame.setVisible(true);
    }
}
