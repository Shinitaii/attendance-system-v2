package main;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Login {
    
    public JFrame frame;

    public Login(){
        frame = new JFrame("Login");
        frame.setBounds(400,400,400,400);

        JPanel mainPanel = new JPanel(new BorderLayout());
        frame.add(mainPanel);

        JPanel topPanel = new JPanel(new BorderLayout());
        JPanel backContainer = new JPanel();
        JButton backButton = new JButton("Back");
        backButton.addMouseListener(new ButtonProperties(backButton));
        backButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                App app = new App();
                app.frame.setVisible(true);
                frame.dispose();
            }
        });
        backContainer.add(backButton);
        topPanel.add(backContainer, BorderLayout.WEST);
        JPanel middlePanel = new JPanel();
        JPanel namePanel = new JPanel(new BorderLayout());
        namePanel.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK) ,new EmptyBorder(10, 10, 10, 10)));
        JLabel nameLabel = new JLabel("Username:");
        namePanel.add(nameLabel, BorderLayout.NORTH);
        JTextField nameTextField = new JTextField(20);
        namePanel.add(nameTextField, BorderLayout.SOUTH);
        middlePanel.add(namePanel);
        JPanel bottomPanel = new JPanel();  

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(middlePanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
