import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.util.*;

public class App {

    private JFrame frame;

    public App(){
        initialize();
    }

    private void initialize(){
        //initializing the window
        frame = new JFrame();
        frame.setBounds(400, 400, 400, 400);

        //creating the GUI
        JPanel mainPanel = new JPanel(new GridLayout(0, 1));
        frame.add(mainPanel);

        //logo panel
        JPanel logoPanel = new JPanel();
        JLabel logoContainer = new JLabel("Logo");

        logoPanel.add(logoContainer);

        //top panel
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 0, 50));

        JButton loginButton = new JButton("Login");
        topPanel.add(loginButton, BorderLayout.CENTER);

        //middle panel
        JPanel middlePanel = new JPanel(new BorderLayout());
        middlePanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 0, 50));

        JButton registerButton = new JButton("Register");
        middlePanel.add(registerButton, BorderLayout.CENTER);

        //bottom panel
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(0, 50, 75, 50));

        JLabel resetLabel = new JLabel("Forgot your password?", SwingConstants.CENTER);
        bottomPanel.add(resetLabel);

        //finalizing window
        mainPanel.add(logoPanel);
        mainPanel.add(topPanel);
        mainPanel.add(middlePanel);
        mainPanel.add(bottomPanel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                try{
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    App main = new App();
                    main.frame.setVisible(true);
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "It seems that there is a problem running the program.\n\nError Code: 000001", "Oh no!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
