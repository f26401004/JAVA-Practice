package test;

import javax.swing.*;
public class GraphicsDemo02
{
    private static void createAndShowGUI()
    {
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new  JFrame("SwingDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World!!");
        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });
    }
} 