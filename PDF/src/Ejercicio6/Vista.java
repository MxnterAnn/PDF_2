package Ejercicio6;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JTextField txtPalabra1, txtPalabra2;
    JButton btnConcatena;
    JLabel etiTexto;

    public Vista() {
        this.setTitle("EJERCICIO 6");
        this.setSize(400, 400);
        this.getContentPane().setLayout(new AbsoluteLayout());

        txtPalabra1 = new JTextField ();
        this.getContentPane().add(txtPalabra1, new AbsoluteConstraints(20, 40, 200, 40));
        txtPalabra2 = new JTextField ();
        this.getContentPane().add(txtPalabra2, new AbsoluteConstraints(20, 100, 200, 40));
        btnConcatena = new JButton("Concatena");
        this.getContentPane().add(btnConcatena, new AbsoluteConstraints(20, 160, 200, 40));
        etiTexto = new JLabel();
        this.getContentPane().add(etiTexto, new AbsoluteConstraints(20, 220, 300, 40));
        etiTexto.setBorder(new LineBorder(Color.black));
        etiTexto.setOpaque(true);
    }

    public static void main(String[] args) {
        Vista f = new Vista();
        f.setVisible(true);
    }

}
