package Ejercicio4;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JTextField txtbase, txtexponente;
    JLabel etiResultado;
    JButton btnCalcular;

    public Vista() {
        this.setTitle("EJERCICIO 4");
        this.setSize(400, 400);
        this.getContentPane().setLayout(new AbsoluteLayout());

        txtbase = new JTextField();
        this.getContentPane().add(txtbase, new AbsoluteConstraints(20, 20, 200, 40));
        txtexponente = new JTextField();
        this.getContentPane().add(txtexponente, new AbsoluteConstraints(20, 80, 200, 40));
        btnCalcular = new JButton("Calcular");
        this.getContentPane().add(btnCalcular, new AbsoluteConstraints(20, 140, 200, 40));
        etiResultado = new JLabel("                       Resultado");
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(20, 210, 200, 40));
        etiResultado.setBorder(new LineBorder(Color.black));
        etiResultado.setOpaque(true);
    }

    public static void main(String[] args) {
        Vista d = new Vista();
        d.setVisible(true);
    }

}
