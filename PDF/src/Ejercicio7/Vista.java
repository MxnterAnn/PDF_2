package Ejercicio7;

import java.awt.Color;
import java.awt.TextField;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame {

    JLabel etiUno, etiDos, etiTres, etiCuatro, etiCinco, etiSeis, etiSiete, etiOcho, etiNueve, etiDiez;
    TextField txtNumero;
    JButton btnBorar;

    public Vista() {
        this.setTitle("EJERCICIO 7");
        this.setSize(400, 600);
        this.getContentPane().setLayout(new AbsoluteLayout());

        JLabel etiUno = new JLabel();
        this.getContentPane().add(etiUno, new AbsoluteConstraints(20, 20, 300, 20));
        etiUno.setBorder(new LineBorder(Color.black));
        etiUno.setOpaque(true);
        JLabel etiDos = new JLabel();
        this.getContentPane().add(etiDos, new AbsoluteConstraints(20, 60, 300, 20));
        etiDos.setBorder(new LineBorder(Color.black));
        etiDos.setOpaque(true);
        JLabel etiTres = new JLabel();
        this.getContentPane().add(etiTres, new AbsoluteConstraints(20, 100, 300, 20));
        etiTres.setBorder(new LineBorder(Color.black));
        etiTres.setOpaque(true);
        JLabel etiCuatro = new JLabel();
        this.getContentPane().add(etiCuatro, new AbsoluteConstraints(20, 140, 300, 20));
        etiCuatro.setBorder(new LineBorder(Color.black));
        etiCuatro.setOpaque(true);
        JLabel etiCinco = new JLabel();
        this.getContentPane().add(etiCinco, new AbsoluteConstraints(20, 180, 300, 20));
        etiCinco.setBorder(new LineBorder(Color.black));
        etiCinco.setOpaque(true);
        JLabel etiSeis = new JLabel();
        this.getContentPane().add(etiSeis, new AbsoluteConstraints(20, 220, 300, 20));
        etiSeis.setBorder(new LineBorder(Color.black));
        etiSeis.setOpaque(true);
        JLabel etiSiete = new JLabel();
        this.getContentPane().add(etiSiete, new AbsoluteConstraints(20, 260, 300, 20));
        etiSiete.setBorder(new LineBorder(Color.black));
        etiSiete.setOpaque(true);
        JLabel etiOcho = new JLabel();
        this.getContentPane().add(etiOcho, new AbsoluteConstraints(20, 300, 300, 20));
        etiOcho.setBorder(new LineBorder(Color.black));
        etiOcho.setOpaque(true);
        JLabel etiNueve = new JLabel();
        this.getContentPane().add(etiNueve, new AbsoluteConstraints(20, 340, 300, 20));
        etiNueve.setBorder(new LineBorder(Color.black));
        etiNueve.setOpaque(true);
        JLabel etiDiez = new JLabel();
        this.getContentPane().add(etiDiez, new AbsoluteConstraints(20, 380, 300, 20));
        etiDiez.setBorder(new LineBorder(Color.black));
        etiDiez.setOpaque(true);
        JTextField txtNumero = new JTextField();
        this.getContentPane().add(txtNumero, new AbsoluteConstraints(20, 420, 300, 30));
        JButton btnConcatena = new JButton("Borrar");
        this.getContentPane().add(btnConcatena, new AbsoluteConstraints(20, 460, 300, 30));
    }

    public static void main(String[] args) {
        Vista g = new Vista();
        g.setVisible(true);
    }

}
