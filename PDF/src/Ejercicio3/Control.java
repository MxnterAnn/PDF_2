
package Ejercicio3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Control implements ActionListener,KeyListener {
Vista c;

    public Control() {
        c = new Vista();
        c.setVisible(true);
        c.txtRadio.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        

    }
   public static void main(String[] args) {
        Control c=new Control();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
        System.out.println("Codigo: " + ke.getKeyCode());
        if (ke.getKeyCode() == 10) {
            double n = Double.parseDouble(c.txtRadio.getText());
            c.etiArea.setText("Area: " + redondear(Math.PI * n * n));
            c.etiPerimetro.setText("Perimetro: " + redondear(Math.PI * 2 * n));
    }
}
       public double redondear(double a) {
        double x = 0;
        int b = (int) (a * 100);
        x = (double) b / 100;
        return x;
    }
}
