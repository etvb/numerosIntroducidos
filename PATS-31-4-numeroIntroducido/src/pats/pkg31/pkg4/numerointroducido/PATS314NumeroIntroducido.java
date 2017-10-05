/*
 * Ejercicio 4: Pedir números hasta que se teclee uno negativo, y mostrar 
 * cuántos números se han introducido.
 */
package pats.pkg31.pkg4.numerointroducido;

import javax.swing.JOptionPane;

/**
 *
 * @author edgardo
 */
public class PATS314NumeroIntroducido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, contador = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor"));
        
        while(numero > 0){
          contador += 1;
          numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa OTRO valor")); 
        }
        
        JOptionPane.showMessageDialog(null, "Pediste "+contador+" Ingresar numeros");
    }
    
}
