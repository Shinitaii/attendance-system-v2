package main;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ButtonProperties extends MouseAdapter{

    private JButton button;

    public ButtonProperties(JButton button){
        this.button = button;
        button.setBackground(new Color(65, 105, 225));
        button.setForeground(Color.white);
        button.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
        button.setBorder(null);
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    public void mousePressed(MouseEvent e){
        button.setBackground(new Color(65, 105, 225).brighter());
    }

    public void mouseReleased(MouseEvent e) {
        button.setBackground(new Color(70, 130, 180));
    }

    public void mouseEntered(MouseEvent e) {
        button.setBackground(new Color(70, 130, 180));
    }

    public void mouseExited(MouseEvent e) {
        button.setBackground(new Color(65, 105, 225));
    }
}