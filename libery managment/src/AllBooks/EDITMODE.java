/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllBooks;

import addbook.addbook;
import com.sun.glass.events.KeyEvent;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class EDITMODE extends javax.swing.JFrame {

    /**
     * Creates new form EDITMODE
     */
    public EDITMODE() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idtxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        writertxt = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        pubtxt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        loghatxt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        pagestxt = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        up = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idtxt.setBackground(new java.awt.Color(189, 195, 199));
        idtxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        idtxt.setForeground(new java.awt.Color(51, 51, 51));
        idtxt.setToolTipText("");
        idtxt.setBorder(null);
        idtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idtxtKeyTyped(evt);
            }
        });
        jPanel1.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 280, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 280, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("FULL NAME :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 90, 20));

        nametxt.setBackground(new java.awt.Color(189, 195, 199));
        nametxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nametxt.setForeground(new java.awt.Color(51, 51, 51));
        nametxt.setToolTipText("");
        nametxt.setBorder(null);
        jPanel1.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 280, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 280, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("WRITER :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 90, 20));

        writertxt.setBackground(new java.awt.Color(189, 195, 199));
        writertxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        writertxt.setForeground(new java.awt.Color(51, 51, 51));
        writertxt.setToolTipText("");
        writertxt.setBorder(null);
        jPanel1.add(writertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 280, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 280, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("PUBLISHER :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 110, 20));

        pubtxt.setBackground(new java.awt.Color(189, 195, 199));
        pubtxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pubtxt.setForeground(new java.awt.Color(51, 51, 51));
        pubtxt.setToolTipText("");
        pubtxt.setBorder(null);
        jPanel1.add(pubtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 280, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 280, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("BOOK ID :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 90, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("LANGUAGE :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 90, 20));

        loghatxt.setBackground(new java.awt.Color(189, 195, 199));
        loghatxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loghatxt.setForeground(new java.awt.Color(51, 51, 51));
        loghatxt.setToolTipText("");
        loghatxt.setBorder(null);
        jPanel1.add(loghatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 280, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 280, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("NUMER OF PAGES :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 150, 20));

        pagestxt.setBackground(new java.awt.Color(189, 195, 199));
        pagestxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pagestxt.setForeground(new java.awt.Color(51, 51, 51));
        pagestxt.setToolTipText("");
        pagestxt.setBorder(null);
        pagestxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pagestxtKeyTyped(evt);
            }
        });
        jPanel1.add(pagestxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 280, 30));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 280, 20));

        up.setBackground(new java.awt.Color(0, 145, 173));
        up.setForeground(new java.awt.Color(255, 255, 255));
        up.setText("update");
        up.setToolTipText("update selected row");
        up.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        jPanel1.add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 280, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllBooks/edit.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idtxtKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c) || (c== KeyEvent.VK_BACKSPACE) ||c == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_idtxtKeyTyped

    private void pagestxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagestxtKeyTyped
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c) || (c== KeyEvent.VK_BACKSPACE) ||c == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_pagestxtKeyTyped

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed

        

        allbooks.addrow( new Object[] {
            idtxt.getText(),
            nametxt.getText(),
            writertxt.getText(),
            pubtxt.getText(),
            loghatxt.getText(),
            pagestxt.getText(),
            
        });
            
        
        dispose();
        
    }//GEN-LAST:event_upActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(EDITMODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EDITMODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EDITMODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EDITMODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EDITMODE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    public javax.swing.JTextField loghatxt;
    public javax.swing.JTextField nametxt;
    public javax.swing.JTextField pagestxt;
    public javax.swing.JTextField pubtxt;
    private javax.swing.JButton up;
    public javax.swing.JTextField writertxt;
    // End of variables declaration//GEN-END:variables
}
