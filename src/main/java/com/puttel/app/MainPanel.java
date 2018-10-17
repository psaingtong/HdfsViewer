package com.puttel.app;

import com.alee.laf.desktoppane.WebDesktopPane;
import com.alee.laf.rootpane.WebFrame;
import com.puttel.app.utils.I18n;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainPanel extends WebFrame {

    WebDesktopPane desktopPane;

    public MainPanel(){
        desktopPane = new WebDesktopPane();
        setMinimumSize(new Dimension(800, 600));
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                if (confirmBeforeExit()) {
                    System.exit(0);
                }
            }
        });
        setTitle("Hdfs Viewer");
        getContentPane().add(desktopPane, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }
    public boolean confirmBeforeExit(){
        if (JOptionPane.showConfirmDialog(this, I18n.lang("desktop.confirmbeforeexitdialog.title"), I18n.lang("desktop.confirmbeforeexitdialog.text"), JOptionPane.YES_NO_OPTION) == 0){
            return true;
        }
        return false;
    }
}
