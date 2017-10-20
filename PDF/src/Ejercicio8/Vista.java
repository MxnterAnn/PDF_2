package Ejercicio8;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JTextField A1, A2, A3;
    JLabel label;
    JButton aceptar;

    public Vista() {
        this.setTitle("Ejercicio 9");
        this.setSize(300, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new AbsoluteLayout());
        A1 = new JTextField(0);
        this.getContentPane().add(A1, new AbsoluteConstraints(20, 40, 200, 30));
        A2 = new JTextField(0);
        this.getContentPane().add(A2, new AbsoluteConstraints(20, 80, 200, 30));
        A3 = new JTextField(0);
        this.getContentPane().add(A3, new AbsoluteConstraints(20, 120, 200, 30));
        label = new JLabel("");
        this.getContentPane().add(label, new AbsoluteConstraints(20, 160, 200, 30));
        label.setBorder(new LineBorder(Color.black));
        label.setOpaque(true);
        aceptar = new JButton("Aceptar");
        this.getContentPane().add(aceptar, new AbsoluteConstraints(20, 200, 200, 30));

    }

    public static void main(String[] args) {
        Vista h = new Vista();
        h.setVisible(true);
    }

}
