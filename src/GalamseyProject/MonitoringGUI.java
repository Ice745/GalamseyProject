package GalamseyProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MonitoringGUI {
    private JTextField textField1;
    private JLabel Home;
    private JButton observatoryButton;
    private JButton galamseyMapButton;

    public MonitoringGUI() {
        textField1.addActionListener(new ActionListener() {
        });
        observatoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"")

            }
        });
    }


    public static void main (String[] args){
        JFrame frame = new Jframe("App");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultClose Opereation(JFrame.EXIT_ON_CLOSE;
        frame.pack();
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
