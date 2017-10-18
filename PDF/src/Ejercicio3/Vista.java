package Ejercicio3;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JTextField txtRadio;
    JLabel etiArea, etiPromedio;

    public Vista() {
        this.setTitle("EJERCICIO 3");
        this.setSize(300, 200);
        this.getContentPane().setLayout(new AbsoluteLayout());

        JTextField txtPrimerTrimestre = new JTextField();
        this.getContentPane().add(txtPrimerTrimestre, new AbsoluteConstraints(20, 20, 200, 30));
        JLabel etiArea = new JLabel();
        this.getContentPane().add(etiArea, new AbsoluteConstraints(20, 60, 200, 30));
        etiArea.setBorder(new LineBorder(Color.black));
        etiArea.setOpaque(true);
        JLabel etiPromedio = new JLabel();
        this.getContentPane().add(etiPromedio, new AbsoluteConstraints(20, 100, 200, 30));
        etiPromedio.setBorder(new LineBorder(Color.black));
        etiPromedio.setOpaque(true);
    }

    public static void main(String[] args) {
        Vista c = new Vista();
        c.setVisible(true);
    }

}
