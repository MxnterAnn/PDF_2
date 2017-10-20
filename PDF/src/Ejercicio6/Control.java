package Ejercicio6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Control implements ActionListener {

    Vista f;

    public Control() {
        f = new Vista();
        f.setVisible(true);
        f.btnConcatena.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == f.btnConcatena) {

            f.etiTexto.setText(f.txtPalabra1.getText() + f.txtPalabra2.getText());

        }

    }

    public static void main(String[] args) {
        Control c = new Control();
    }

}
