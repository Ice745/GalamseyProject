package GalamseyProject;

import javax.swing.*;


public class MonitoringGUI {
    JFrame frame;


    MonitoringGUI(){
        frame = new JFrame();

        JButton button = new JButton("Click");
        button.setBounds(200, 100,100,25);

        frame.add(button);

        frame.getJMenuBar();
        frame.setSize(1280,720);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String args[]){
        new MonitoringGUI();
    }

}
