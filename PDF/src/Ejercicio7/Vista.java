package Ejercicio7;

import java.awt.Color;
import java.awt.TextField;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame {

    JLabel eti0, eti1, eti2, eti3, eti4, eti5, eti6, eti7, eti8, eti9;
    JTextField txtNumero;
    JButton btnBorrar;

    public Vista() {
        this.setTitle("EJERCICIO 7");
        this.setSize(400, 600);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setResizable(false);

        eti0 = new JLabel();
        this.getContentPane().add(eti0, new AbsoluteConstraints(20, 20, 300, 20));
        eti0.setBorder(new LineBorder(Color.black));
        eti0.setOpaque(true);
        eti1 = new JLabel();
        this.getContentPane().add(eti1, new AbsoluteConstraints(20, 60, 300, 20));
        eti1.setBorder(new LineBorder(Color.black));
        eti1.setOpaque(true);
        eti2 = new JLabel();
        this.getContentPane().add(eti2, new AbsoluteConstraints(20, 100, 300, 20));
        eti2.setBorder(new LineBorder(Color.black));
        eti2.setOpaque(true);
        eti3 = new JLabel();
        this.getContentPane().add(eti3, new AbsoluteConstraints(20, 140, 300, 20));
        eti3.setBorder(new LineBorder(Color.black));
        eti3.setOpaque(true);
        eti4 = new JLabel();
        this.getContentPane().add(eti4, new AbsoluteConstraints(20, 180, 300, 20));
        eti4.setBorder(new LineBorder(Color.black));
        eti4.setOpaque(true);
        eti5 = new JLabel();
        this.getContentPane().add(eti5, new AbsoluteConstraints(20, 220, 300, 20));
        eti5.setBorder(new LineBorder(Color.black));
        eti5.setOpaque(true);
        eti6 = new JLabel();
        this.getContentPane().add(eti6, new AbsoluteConstraints(20, 260, 300, 20));
        eti6.setBorder(new LineBorder(Color.black));
        eti6.setOpaque(true);
        eti7 = new JLabel();
        this.getContentPane().add(eti7, new AbsoluteConstraints(20, 300, 300, 20));
        eti7.setBorder(new LineBorder(Color.black));
        eti7.setOpaque(true);
        eti8 = new JLabel();
        this.getContentPane().add(eti8, new AbsoluteConstraints(20, 340, 300, 20));
        eti8.setBorder(new LineBorder(Color.black));
        eti8.setOpaque(true);
        eti9 = new JLabel();
        this.getContentPane().add(eti9, new AbsoluteConstraints(20, 380, 300, 20));
        eti9.setBorder(new LineBorder(Color.black));
        eti9.setOpaque(true);
        txtNumero = new JTextField();
        this.getContentPane().add(txtNumero, new AbsoluteConstraints(20, 420, 300, 30));
        btnBorrar = new JButton("Borrar");
        this.getContentPane().add(btnBorrar, new AbsoluteConstraints(20, 460, 300, 30));
    }

    public static void main(String[] args) {
        Vista g = new Vista();
        g.setVisible(true);
    }

}
