/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disOrDat;

import java.awt.Cursor;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author 63947
 */
public class homeDOrD extends javax.swing.JFrame {

    /**
     * Creates new form homeDOrD
     */
    public homeDOrD() {
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
        gameTitle = new javax.swing.JLabel();
        enterBtn = new javax.swing.JLabel();
        gameDescrip = new javax.swing.JLabel();
        topBar = new javax.swing.JPanel();
        wtpkmnBtn = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
        dordBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(73, 166, 166));

        gameTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/DOrD LOGO_02.png"))); // NOI18N
        gameTitle.setFocusable(false);

        enterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/BUTTONS_ENTER.png"))); // NOI18N
        enterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enterBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enterBtnMouseExited(evt);
            }
        });

        gameDescrip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/DisOrDatDescrip.png"))); // NOI18N

        topBar.setBackground(new java.awt.Color(217, 95, 152));

        wtpkmnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/BUTTONS_WTPKMN.png"))); // NOI18N
        wtpkmnBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                wtpkmnBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                wtpkmnBtnMouseExited(evt);
            }
        });

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/XenQuizzes_120x60.png"))); // NOI18N
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeBtnMouseEntered(evt);
            }
        });

        dordBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/BUTTONS_TRIVQ_TOP.png"))); // NOI18N
        dordBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dordBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dordBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(wtpkmnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(homeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wtpkmnBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dordBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gameDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addComponent(topBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(topBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(gameDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

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

    private void enterBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterBtnMouseEntered
        // TODO add your handling code here:
        Icon enterCyan = new ImageIcon("D:\\63947\\Documents\\NetBeansProjects\\DisOrDat\\src\\assets\\BUTTONS_ENTER_CYAN.png");
        enterBtn.setIcon(enterCyan);
    }//GEN-LAST:event_enterBtnMouseEntered

    private void enterBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterBtnMouseExited
        // TODO add your handling code here:
        Icon enterCyan = new ImageIcon("D:\\63947\\Documents\\NetBeansProjects\\DisOrDat\\src\\assets\\BUTTONS_ENTER.png");
        enterBtn.setIcon(enterCyan);
    }//GEN-LAST:event_enterBtnMouseExited

    private void dordBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dordBtnMouseEntered
        // TODO add your handling code here:
        Icon trivCyan = new ImageIcon("D:\\63947\\Documents\\NetBeansProjects\\DisOrDat\\src\\assets\\BUTTONS_TRIVQ_TOP_DILAW.png");
        dordBtn.setIcon(trivCyan);
        dordBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_dordBtnMouseEntered

    private void dordBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dordBtnMouseExited
        // TODO add your handling code here:
        Icon trivCyan = new ImageIcon("D:\\63947\\Documents\\NetBeansProjects\\DisOrDat\\src\\assets\\BUTTONS_TRIVQ_TOP.png");
        dordBtn.setIcon(trivCyan);
    }//GEN-LAST:event_dordBtnMouseExited

    private void wtpkmnBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wtpkmnBtnMouseEntered
        // TODO add your handling code here:
        Icon pkmnCyan = new ImageIcon("D:\\63947\\Documents\\NetBeansProjects\\DisOrDat\\src\\assets\\BUTTONS_WTPKMN_DILAW.png");
        wtpkmnBtn.setIcon(pkmnCyan);
        wtpkmnBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_wtpkmnBtnMouseEntered

    private void wtpkmnBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wtpkmnBtnMouseExited
        // TODO add your handling code here:
        Icon pkmnCyan = new ImageIcon("D:\\63947\\Documents\\NetBeansProjects\\DisOrDat\\src\\assets\\BUTTONS_WTPKMN.png");
        wtpkmnBtn.setIcon(pkmnCyan);
    }//GEN-LAST:event_wtpkmnBtnMouseExited

    private void homeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseEntered
        // TODO add your handling code here:
        homeBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_homeBtnMouseEntered

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
            java.util.logging.Logger.getLogger(homeDOrD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeDOrD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeDOrD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeDOrD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeDOrD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dordBtn;
    private javax.swing.JLabel enterBtn;
    private javax.swing.JLabel gameDescrip;
    private javax.swing.JLabel gameTitle;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel topBar;
    private javax.swing.JLabel wtpkmnBtn;
    // End of variables declaration//GEN-END:variables
}