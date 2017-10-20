
package Ejercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control implements  ActionListener{
    Vista d;
    public Control(){
        d= new Vista();
        d.setVisible(true);
        d.btnCalcular.addActionListener(this);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==d.btnCalcular){
            Double x;
           x= Math.pow(Integer.parseInt(d.txtbase.getText()), Integer.parseInt(d.txtexponente.getText()));
            
            d.etiResultado.setText(""+ x);
            
            
        }
    }
    public static void main(String[] args) {
        Control c=new Control();
    }
}
