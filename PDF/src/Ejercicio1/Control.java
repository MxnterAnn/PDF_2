
package Ejercicio1;

import java.awt.event.*;


public class Control implements ActionListener{
    Vista a;

    public Control() {
        a = new Vista();
        a.setVisible(true);
        a.btnCalcular.addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == a.btnCalcular) {
            double precio_base;
            double precio_instal; 
            double precio_for; 
            double precio_ali;
        }
    }
    
}
