package GalamseyProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MonitoringGUI {

    private JButton galamseyButton;
    private JButton observatoryButton;


    public static startuppage startuppage;
    public static Observatorypage observatorypage;
//    public static publi

//static instances of all the pages


    public static void main (String[] args) {

        startuppage = new startuppage();
        startuppage.setVisible(true);
    }
}

