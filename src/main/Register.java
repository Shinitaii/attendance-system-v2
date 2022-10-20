package main;

import javax.swing.*;

public class Register {

    public JFrame frame;

    public Register(){
        frame = new JFrame("Register");
        frame.setBounds(400,400,400,400);

        JPanel topPanel = new JPanel();
        frame.add(topPanel);
        JPanel middlePanel = new JPanel();
        frame.add(middlePanel);
        JPanel bottomPanel = new JPanel();  
        frame.add(bottomPanel);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
