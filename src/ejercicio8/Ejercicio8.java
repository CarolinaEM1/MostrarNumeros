/*
 Pedir un número N. y mostrar todos los números del 1 al N.
 */
package ejercicio8;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,i;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        
        i=1;
        while (i<= numero){
            System.out.println(i);
            i++; // 1 2 3 4...
        }
        
    }
    
}
