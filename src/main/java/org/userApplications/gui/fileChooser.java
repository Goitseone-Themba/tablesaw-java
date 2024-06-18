package org.userApplications.gui;

/**
*@author: Goitseone Themba 21000539
 */

import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.*;

public class fileChooser extends JFrame implements ActionListener{
    static JLabel label;

    fileChooser() {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("File Chooser");

        frame.setSize(400, 400);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("save");

        JButton button2 = new JButton("open");

        fileChooser f1 = new fileChooser();

        button1.addActionListener(f1);
        button2.addActionListener(f1);

        JPanel panel = new JPanel();

        panel.add(button1);
        panel.add(button2);

        label = new JLabel("no file selected");

        panel.add(label);
        frame.add(panel);

        frame.show();
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        String com = evt.getActionCommand();

        if(com.equals("save")) {
            JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

            int r = j.showSaveDialog(null);

            if (r == JFileChooser.APPROVE_OPTION) {
                label.setText(j.getSelectedFile().getAbsolutePath());
            }
            else {
                label.setText("the user cancelled the operation.");
            }
        }
        else {
            JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

            int r = j.showOpenDialog(null);

            if (r == JFileChooser.APPROVE_OPTION) {
                label.setText(j.getSelectedFile().getAbsolutePath());
            }
            else {
                label.setText("the user cancelled the operation.");
            }
        }
    }
}
