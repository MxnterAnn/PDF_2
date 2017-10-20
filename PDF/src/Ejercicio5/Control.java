
package Ejercicio5;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Control implements ActionListener{
Vista e;

    public Control() {
        e = new Vista();
        e.setVisible(true);
        e.btnCalcular.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         int x;
        double calcular = 0;
         x=(Integer.parseInt(e.txtNumero.getText()));
        calcular = Math.sqrt(x);
        e.etiRaiz.setText(String.valueOf(calcular));
         
    }
     public static void main(String[] args) {
        Control c=new Control();
     }
}
