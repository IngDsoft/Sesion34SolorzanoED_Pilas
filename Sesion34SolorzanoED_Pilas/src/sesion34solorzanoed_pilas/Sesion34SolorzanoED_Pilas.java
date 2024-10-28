
package sesion34solorzanoed_pilas;

import java.util.Stack;
import javax.swing.JOptionPane;


public class Sesion34SolorzanoED_Pilas {

    
    public static void main(String[] args) {
        // Declaracion pila
        Stack<Integer> pilaSolorzano = new Stack<>();
        
        pilaSolorzano.push(100);
        pilaSolorzano.push(150);
        pilaSolorzano.push(230);
        pilaSolorzano.push(10);
        pilaSolorzano.push(160);
        
        JOptionPane.showMessageDialog(null, "Datos en pila ordenada es :\n" + pilaSolorzano);
        
        JOptionPane.showMessageDialog(null, "Autor: solorzano");
    }
    
}
