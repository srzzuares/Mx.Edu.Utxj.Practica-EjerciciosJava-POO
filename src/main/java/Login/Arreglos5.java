/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author crysuar
 */
public class Arreglos5 extends javax.swing.JFrame {

    /**
     * Creates new form Arreglos5
     */
    public Arreglos5() {
        initComponents();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Arreglo Bidimencional");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 500, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 222, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int longitud = Integer.parseInt(JOptionPane.showInputDialog(null, "Longitud de la matriz: ", "Tamaño",
                JOptionPane.INFORMATION_MESSAGE));
        
        int [][] matriz1 = new int[longitud][longitud];
        int [][] matriz2 = new int[longitud][longitud];
        JOptionPane.showMessageDialog(null,"Matriz uno: ","Matriz 1",
                JOptionPane.INFORMATION_MESSAGE);
        for(int x = 0; x < longitud; x++){
            for(int y = 0; y < longitud; y++){
                matriz1[x][y] = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un valor: " + x + ", "+ y));
            }
        }
        JOptionPane.showMessageDialog(null,"Matriz Dos: ","Matriz 2", JOptionPane.INFORMATION_MESSAGE);
        for(int x = 0; x < longitud; x++){
            for(int y = 0; y < longitud; y++){
                matriz2[x][y] = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un valor: " + x + ", "+ y));
            }
        }
        
        //Mostrar Matrices
        JPanel contenedor = (JPanel)this.getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(Color.yellow);
        
        JLabel[][] valores = new JLabel [longitud][longitud];
        for(int x = 0; x < longitud; x++){
            for(int y = 0; y < longitud; y++){
                valores[x][y] = new JLabel (String.valueOf(matriz1[x][y]));
                valores[x][y].setBounds((x+1)*80, (y+1)*30,150,30);
                contenedor.add(valores[x][y],null);
            }
        }
        JLabel[][] valores2 = new JLabel[longitud][longitud];
        int d = longitud;
        for(int x = 0; x < longitud; x++){
            d = d+1;
            for(int y = 0; y < longitud; y++){
                valores2[x][y] = new JLabel(String.valueOf(matriz2[x][y]));
                valores2[x][y].setBounds((d+1)*65, (y+1)*30,150,30);
                contenedor.add(valores2[x][y],null);
            }
        }
        //Resultado de la operación
        JLabel[][] valores3 = new JLabel[longitud][longitud];
        int e = longitud +1 + longitud;
        int op = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Hola Humano, elija el numero para la operación: " + 
                                "\n1.-Suma \n2.-Multiplicación \n3.-División \n4.-Resta",
                        "Opciones", JOptionPane.INFORMATION_MESSAGE));
        for(int x = 0; x < longitud; x++){
            e = e+1;
            int res = 0;
            for(int y = 0; y < longitud; y++){
                if(op==1){
                res = (matriz1[x][y]) + (matriz2[x][y]);
                valores3[x][y] = new JLabel(String.valueOf(res));
                valores3[x][y].setBounds((e+1)*60,(y+1)*30,150,30);
                contenedor.add(valores3[x][y],null);
                }
                if(op==2){
                res = (matriz1[x][y]) * (matriz2[x][y]);
                valores3[x][y] = new JLabel(String.valueOf(res));
                valores3[x][y].setBounds((e+1)*60,(y+1)*30,150,30);
                contenedor.add(valores3[x][y],null);
                }
                if(op==3){
                res = (matriz1[x][y]) / (matriz2[x][y]);
                valores3[x][y] = new JLabel(String.valueOf(res));
                valores3[x][y].setBounds((e+1)*60,(y+1)*30,150,30);
                contenedor.add(valores3[x][y],null);
                }
                if(op==4){
                res = (matriz1[x][y]) - (matriz2[x][y]);
                valores3[x][y] = new JLabel(String.valueOf(res));
                valores3[x][y].setBounds((e+1)*60,(y+1)*30,150,30);
                contenedor.add(valores3[x][y],null);
                }
                
                
            }
        }
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Arreglos5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arreglos5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arreglos5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arreglos5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arreglos5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
