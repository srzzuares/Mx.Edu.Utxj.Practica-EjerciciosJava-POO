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
public class Arreglos4 extends javax.swing.JFrame {

    /**
     * Creates new form Arreglos4
     */
    public Arreglos4() {
        initComponents();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
 /*
        matriz [0][0] = 2;
        matriz [0][1] = 3;
        matriz [0][2] = 5;
        matriz [1][0] = 4;
        matriz [1][1] = 7;
        matriz [1][2] = 9;
        matriz [2][0] = 8;
        matriz [2][1] = 1;
        matriz [2][2] = 0;
        JOptionPane.showMessageDialog(null,"Valor : " + matriz[0][2], 
        "Alerta", JOptionPane.INFORMATION_MESSAGE);
        */
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

        jButton1.setText("MatrizArreglo Bidimensional");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 213, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 212, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int [][] matriz = new int [3][3];
       
        for(int x = 0; x < 3; x++ ){
            for(int y = 0; y < 3; y++){
                matriz[x][y] = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un valor: " + x + "," + y));
            }
        }

//Crea un panel para mostrar los controles creados
        JPanel contenedor=(JPanel)this.getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(Color.YELLOW);
            int resum = 0, resum3 = 0, diagonalprimaria = 0,diagonalsecundaria = 0;
    
        JLabel[][] valores = new JLabel[3][3];
        
        
        
        for(int k = 0; k < 3; k++){
            for(int l = 0; l < 3; l++){
                valores[k][l] = new JLabel(String.valueOf(matriz[k][l]));
                valores[k][l].setBounds((l+1)*80,(k+1)*30,150,30);
                if(k==0){ //Fila 1 = k
                    resum = resum + matriz[k][l];
                }
               
                if(l==2){ //Columna 3 = l
                    resum3 = resum3 + matriz[k][l];
                }
                
                
                diagonalprimaria = matriz[0][0]*matriz[1][1]*matriz[2][2];
                diagonalsecundaria = matriz[0][2]*matriz[1][1]*matriz[2][0];
                
                contenedor.add(valores[k][l],null);   
            }
        }
        
        
        JOptionPane.showMessageDialog(null,"Suma fila 1: " 
                + resum,"Suma",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Suma Columna 3: " +
                resum3,"Suma",JOptionPane.INFORMATION_MESSAGE);
        
        
        
        JOptionPane.showMessageDialog(null,"Multiplicacion Diagonal: " + matriz[0][0] + " * " 
                + matriz[1][1] + " * " + matriz[2][2] + " = " + diagonalprimaria,
                "Multiplicación",JOptionPane.INFORMATION_MESSAGE);
        
        
        JOptionPane.showMessageDialog(null,"Multiplicacion Diagonal: " + matriz[2][0] + " * " 
                + matriz[1][1] + " * " + matriz[0][2] + " = "  + diagonalsecundaria,
                "Multiplicación",JOptionPane.INFORMATION_MESSAGE);
        
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
            java.util.logging.Logger.getLogger(Arreglos4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arreglos4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arreglos4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arreglos4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arreglos4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
