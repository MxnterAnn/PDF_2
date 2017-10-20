package Ejercicio7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Control implements MouseListener, ActionListener {

    Vista g;

    public Control() {
        g = new Vista();
        g.setVisible(true);
        g.eti0.addMouseListener(this);
        g.eti1.addMouseListener(this);
        g.eti2.addMouseListener(this);
        g.eti3.addMouseListener(this);
        g.eti4.addMouseListener(this);
        g.eti5.addMouseListener(this);
        g.eti6.addMouseListener(this);
        g.eti7.addMouseListener(this);
        g.eti8.addMouseListener(this);
        g.eti9.addMouseListener(this);
        g.btnBorrar.addActionListener(this);

    }
    String mensaje = "";

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {

        if (me.getSource() == g.eti0) {
            mensaje = mensaje + "0 ";
        }
        if (me.getSource() == g.eti1) {
            mensaje = mensaje + "1 ";
        }
        if (me.getSource() == g.eti2) {
            mensaje = mensaje + "2 ";
        }
        if (me.getSource() == g.eti3) {
            mensaje = mensaje + "3 ";
        }
        if (me.getSource() == g.eti4) {
            mensaje = mensaje + "4 ";
        }
        if (me.getSource() == g.eti5) {
            mensaje = mensaje + "5 ";
        }
        if (me.getSource() == g.eti6) {
            mensaje = mensaje + "6 ";
        }
        if (me.getSource() == g.eti7) {
            mensaje = mensaje + "7 ";
        }
        if (me.getSource() == g.eti8) {
            mensaje = mensaje + "8 ";
        }
        if (me.getSource() == g.eti9) {
            mensaje = mensaje + "9 ";
        }

        g.txtNumero.setText(mensaje);
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == g.btnBorrar) {
            mensaje = "";
            g.txtNumero.setText(mensaje);
        }
    }

    public static void main(String[] args) {
        Control c = new Control();
    }

}
