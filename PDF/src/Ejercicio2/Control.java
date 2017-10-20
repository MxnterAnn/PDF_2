package Ejercicio2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control implements ActionListener {

    Vista b;

    public Control() {
        b = new Vista();
        b.setVisible(true);
        b.btnCalcular.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int z, x, c, r;
        z = (Integer.parseInt(b.txtPrimerTrimestre.getText()));
        x = (Integer.parseInt(b.txtSegundoTrimestre.getText()));
        c = (Integer.parseInt(b.txtSegundoTrimestre.getText()));
        r = ((z + x + c) / 3);
        if (r <= 5) {
            b.etiNotaFinal.setText( r + " Suspenso");
            b.etiNotaFinal.setForeground(Color.RED);
        } else {
            b.etiNotaFinal.setText( r + " Aprovado");

        }
    }

    public static void main(String[] args) {
        Control c = new Control();
    }

}
