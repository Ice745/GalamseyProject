package GalamseyProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Observatorypage extends JFrame{
    private JButton newButton;
    private JButton existingButton;
    private JPanel observatorypanel;


    public Observatorypage() {
        add(observatorypanel);
        MonitoringGUI.observatorypage.setVisible(true);
        newButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
