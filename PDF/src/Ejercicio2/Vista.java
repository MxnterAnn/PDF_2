package Ejercicio2;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame {

    JTextField txtPrimerTrimestre, txtSegundoTrimestre, txtTercerTrimestre;
    JLabel etiNotaFinal, etiResultado;
    JButton btnCalcular;

    public Vista() {
        this.setTitle("EJERCICIO 2");
        this.setSize(400, 400);
        this.getContentPane().setLayout(new AbsoluteLayout());

        JTextField txtPrimerTrimestre = new JTextField();
        this.getContentPane().add(txtPrimerTrimestre, new AbsoluteConstraints(20, 20, 200, 30));
        JTextField txtSegundoTrimestre = new JTextField();
        this.getContentPane().add(txtSegundoTrimestre, new AbsoluteConstraints(20, 60, 200, 30));
        JTextField txtTercerTrimestre = new JTextField();
        this.getContentPane().add(txtTercerTrimestre, new AbsoluteConstraints(20, 100, 200, 30));
        JLabel etiNotaFinal = new JLabel();
        this.getContentPane().add(etiNotaFinal, new AbsoluteConstraints(20, 140, 200, 30));
        etiNotaFinal.setBorder(new LineBorder(Color.black));
        etiNotaFinal.setOpaque(true);
        JLabel etiIva = new JLabel();
        JLabel etiResultado = new JLabel();
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(20, 180, 200, 30));
        etiResultado.setBorder(new LineBorder(Color.black));
        etiResultado.setOpaque(true);
        JButton btnCalcular = new JButton("Calcular");
        this.getContentPane().add(btnCalcular, new AbsoluteConstraints(20, 220, 200, 30));
    }
    public static void main(String[] args) {
        Vista b=new Vista();
        b.setVisible(true);
    }

}
