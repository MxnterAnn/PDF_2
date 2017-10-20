package Ejercicio1;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JTextField txtUnidades, txtPrecio;
    JLabel etiTotalSinIva, etiIva, etiTotalMasIva;
    JButton btnCalcular;

    public Vista() {
        this.setTitle("EJERCICIO 1");
        this.setSize(300, 400);
        this.getContentPane().setLayout(new AbsoluteLayout());

        txtUnidades = new JTextField();
        this.getContentPane().add(txtUnidades, new AbsoluteConstraints              (20, 20, 200, 30));
        txtPrecio = new JTextField();
        this.getContentPane().add(txtPrecio, new AbsoluteConstraints                (20, 60, 200, 30));
        etiTotalSinIva = new JLabel();
        this.getContentPane().add(etiTotalSinIva, new AbsoluteConstraints           (20, 100, 200, 30));
        etiTotalSinIva.setBorder(new LineBorder(Color.black));
        etiTotalSinIva.setOpaque(true);
        etiIva = new JLabel();
        this.getContentPane().add(etiIva, new AbsoluteConstraints                   (20, 140, 200, 30));
        etiIva.setBorder(new LineBorder(Color.black));
        etiIva.setOpaque(true);
        etiTotalMasIva = new JLabel();
        this.getContentPane().add(etiTotalMasIva, new AbsoluteConstraints           (20, 180, 200, 30));
        etiTotalMasIva.setBorder(new LineBorder(Color.black));
        etiTotalMasIva.setOpaque(true);
        btnCalcular = new JButton("Calcular");
        this.getContentPane().add(btnCalcular, new AbsoluteConstraints              (20, 220, 200, 30));

    }

    public static void main(String[] args) {
        Vista a = new Vista();
        a.setVisible(true);
    }

}
