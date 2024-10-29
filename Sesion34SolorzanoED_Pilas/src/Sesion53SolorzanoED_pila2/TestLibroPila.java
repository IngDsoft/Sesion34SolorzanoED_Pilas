
package Sesion53SolorzanoED_pila2;

import java.util.Stack;
import javax.swing.JOptionPane;


public class TestLibroPila extends javax.swing.JFrame {
    Stack<Libro> pila = new Stack<Libro>();
    
    
    Libro libro1 = new Libro("torres", "c++", 2024, "gandi");
    Libro libro2 = new Libro("Denzel", "java", 2024, "porrua");
    Libro libro3 = new Libro("Solorzano", "aguila", 2024, "torre");
    Libro libro4 = new Libro("Morales", "la vida es grande", 2024, "coyoacan");
    Libro libro5 = new Libro("Son", "toros", 2024, "coyoacan");
    
    
    
    public TestLibroPila() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btmConsultarLibrosPila = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setText("Operaciones libros Biblioteca Solorzano");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 29, -1, -1));

        btmConsultarLibrosPila.setText("Consultar libros");
        btmConsultarLibrosPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmConsultarLibrosPilaActionPerformed(evt);
            }
        });
        getContentPane().add(btmConsultarLibrosPila, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmConsultarLibrosPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmConsultarLibrosPilaActionPerformed
        //Agregar informacion de libros
        pila.push(libro1);
        pila.push(libro2);
        pila.push(libro3);
        pila.push(libro4);
        pila.push(libro5);
        
        //Imprimir
        while (!pila.isEmpty()) {            
            JOptionPane.showMessageDialog(null, "Datos de libros"
                                                + "\nAutor: " + pila.peek().getAutor()
                                                + "\n Titulo: " + pila.peek().getTitulos()
                                                + "\n Fecha publicacion: " + pila.peek().getAnio()
                                                + "\n Editorial: " + pila.peek().getEditorial());
            pila.pop();//Ultimo elemento
            
        }
        
    }//GEN-LAST:event_btmConsultarLibrosPilaActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestLibroPila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmConsultarLibrosPila;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
