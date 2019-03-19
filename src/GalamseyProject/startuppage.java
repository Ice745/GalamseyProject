package GalamseyProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startuppage extends JFrame {
    private JButton galamseyButton;
    private JButton Observatory;

    public startuppage() {
        Observatory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MonitoringGUI.startuppage.dispose();
                MonitoringGUI.Observatorypage = new Observatorypage();
                MonitoringGUI.Observatorypage.setVisible(true);

            }
        });
        galamseyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MonitoringGUI.startuppage.dispose();
                MonitoringGUI.Observatorypage = new Observatorypage();
                MonitoringGUI.Observatorypage.setVisible(true);

            }
        });
    }
}
