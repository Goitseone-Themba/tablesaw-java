package org.userApplications.gui;

/**
 * @author: Goitseone Themba 21000539
 */

import java.awt.*;

public class Lan {
    Lan() {
        Frame f = new Frame();

        Label l1 = new Label("Select known Languages:");
        l1.setBounds(120, 50, 200, 50);
        f.add(l1);

        Checkbox c2 = new Checkbox("English");
        c2.setBounds(120, 150, 200, 50);
        f.add(c2);

        Checkbox c3 = new Checkbox("Hindi");
        c3.setBounds(120, 200, 200, 50);
        f.add(c3);

        Checkbox c4 = new Checkbox("Setswana");
        c4.setBounds(120, 250, 200, 50);
        f.add(c4);

        f.setSize(500, 360);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Lan();
    }
}
