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
                MonitoringGUI.startuppage.setVisible(true);
                MonitoringGUI.observatorypage = new Observatorypage();
//                MonitoringGUI.observatorypage.setVisible(true);

            }
        });
        galamseyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MonitoringGUI.startuppage.dispose();
                MonitoringGUI.observatorypage = new Observatorypage();
//                MonitoringGUI.observatorypage.setVisible(true);

            }
        });
    }
}
