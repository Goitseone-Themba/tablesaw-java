package org.userApplications;

/**
 * @author: Goitseone Themba 21000539
 */

import java.io.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton button = new JButton("GFG Website Click");

        button.setBounds(150, 200, 220, 50);

        frame.add(button);

        frame.setSize(500, 600);

        frame.setLayout(null);

        frame.setVisible(true);
    }
}