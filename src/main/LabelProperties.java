package main;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class LabelProperties extends MouseAdapter{ //This property is only for clickable JLabels

    private JLabel label;

    public LabelProperties(JLabel label){
        this.label = label;
        label.setBackground(new Color(65, 105, 225));
        label.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
        label.setBorder(null);
        label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    public void mousePressed(MouseEvent e){
        label.setBackground(new Color(65, 105, 225).brighter());
    }

    public void mouseReleased(MouseEvent e) {
        label.setBackground(new Color(70, 130, 180));
    }

    public void mouseEntered(MouseEvent e) {
        label.setBackground(new Color(70, 130, 180));
    }

    public void mouseExited(MouseEvent e) {
        label.setBackground(new Color(65, 105, 225));
    }
}
