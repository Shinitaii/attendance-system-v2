package main;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App {

    /* 
     * This is a remastered application I've created for my 12th grade capstone project.
     * The legacy code of the said project is very unrefined and broke many of the coding method standards for -
     * - Java and Java Swing as it was rushed. Hence, this project is created for me to improve and refine my skills
     * regarding the syntax and the logical process of said language and its swing functionalities.
    */

    public JFrame frame;

    public App(){
        initialize();
    }

    private void initialize(){
        //initializing the window
        frame = new JFrame("Attendance System");
        frame.setBounds(400, 400, 400, 400);

        //creating the GUI contents
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
        loginButton.addMouseListener(new ButtonProperties(loginButton));
        loginButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Login login = new Login();
                login.frame.setVisible(true);
                frame.dispose();
            }
        });
        topPanel.add(loginButton, BorderLayout.CENTER);

        //middle panel
        JPanel middlePanel = new JPanel(new BorderLayout());
        middlePanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 0, 50));

        JButton registerButton = new JButton("Register");
        registerButton.addMouseListener(new ButtonProperties(registerButton));
        registerButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Register register = new Register();
                register.frame.setVisible(true);
                frame.dispose();
            }
        });
        middlePanel.add(registerButton, BorderLayout.CENTER);

        //bottom panel
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(0, 50, 70, 50));

        JLabel resetLabel = new JLabel("Forgot your password?", SwingConstants.CENTER);
        resetLabel.addMouseListener(new LabelProperties(resetLabel));
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