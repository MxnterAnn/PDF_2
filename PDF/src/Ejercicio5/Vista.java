package Ejercicio5;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JTextField txtNumero;
    JLabel etiRaiz;

    public Vista() {
        this.setTitle("EJERCICIO 5");
        this.setSize(300, 250);
        this.getContentPane().setLayout(new AbsoluteLayout());

        JTextField txtNumero = new JTextField();
        this.getContentPane().add(txtNumero, new AbsoluteConstraints(20, 40, 200, 40));
        JLabel etiRaiz = new JLabel();
        this.getContentPane().add(etiRaiz, new AbsoluteConstraints(20, 100, 200, 40));
        etiRaiz.setBorder(new LineBorder(Color.black));
        etiRaiz.setOpaque(true);
    }

    public static void main(String[] args) {
        Vista e = new Vista();
        e.setVisible(true);
    }

}
