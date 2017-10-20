package Ejercicio1;

import java.awt.event.*;
import javax.swing.event.*;

public class Control implements ActionListener {

    Vista a;
    int n1, n2;

    public Control() {
        a = new Vista();
        a.setVisible(true);
        a.btnCalcular.addActionListener(this);

    }

    public int Esnumero(String x) {
        int n = 0;
        try {
            n = Integer.parseInt(x);
            return n;
        } catch (Exception e) {
            return 0;
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == a.btnCalcular) {
            n1 = Esnumero(a.txtPrecio.getText());
            n2 = Esnumero(a.txtUnidades.getText());

            a.etiTotalSinIva.setText("Total:" + (n1 * n2));
            a.etiIva.setText("Iva:" + (n1 * n2) * 0.03);
            a.etiTotalMasIva.setText("Total mas Iva:" + ((n1 * n2) + ((n1 * n2) * 0.03)));

        }

    }

    public static void main(String[] args) {
        Control c = new Control();
    }

}
