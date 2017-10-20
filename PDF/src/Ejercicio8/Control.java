package Ejercicio8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control implements ActionListener {

    Vista h;

    public Control() {
        h = new Vista();
        h.setVisible(true);
        h.aceptar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String res, res2;

        if (h.aceptar == ae.getSource()) {
            double r = 0, x = 0, x1 = 0;
            r = (Integer.parseInt(h.A2.getText()) * Integer.parseInt(h.A2.getText())) - (4 * (Integer.parseInt(h.A1.getText()) * Integer.parseInt(h.A3.getText())));
            try {
                res = "X:";
                res2 = "X1:";
                if (r == 0) {

                    x = (-1 * (Integer.parseInt(h.A2.getText()))) / (2 * Integer.parseInt(h.A1.getText()));
                    h.label.setText(res + " " + x);

                }
                if (r > 0) {
                    double e = Math.sqrt(r);
                    x = ((-1 * (Integer.parseInt(h.A2.getText()))) + e) / ((2 * Integer.parseInt(h.A1.getText())));
                    x1 = ((-1 * (Integer.parseInt(h.A2.getText()))) - e) / ((2 * Integer.parseInt(h.A1.getText())));

                    h.label.setText(res + " " + x + " " + res2 + " " + x1);

                }
                if (r < 0) {
                    res = "Numero sin existencia";
                    h.label.setText(res);
                }
            } catch (Exception e) {
                res = "Numero sin existencia ";
                h.label.setText(res);
            }

        }
    }

    public static void main(String[] args) {
        Control c = new Control();
    }

}
