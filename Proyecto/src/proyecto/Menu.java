package proyecto;

/**
 *
 * @author Pxk
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        btExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        menuNewC = new javax.swing.JMenuItem();
        menuEditC = new javax.swing.JMenuItem();
        menuDelC = new javax.swing.JMenuItem();
        menuRegC = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuNewV = new javax.swing.JMenuItem();
        menuEditV = new javax.swing.JMenuItem();
        menuDelV = new javax.swing.JMenuItem();
        menuRegV = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuInv = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuEx = new javax.swing.JMenuItem();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu2.setText("jMenu2");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido.");

        btExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/back.gif"))); // NOI18N
        btExit.setIconTextGap(15);
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Escoga una opción de la barra de menú para continuar.");

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/compra.gif"))); // NOI18N
        jMenu4.setText("Compras");

        menuNewC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/ncompra.gif"))); // NOI18N
        menuNewC.setText("Registrar compra");
        menuNewC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNewCActionPerformed(evt);
            }
        });
        jMenu4.add(menuNewC);

        menuEditC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/editcompra.gif"))); // NOI18N
        menuEditC.setText("Editar compra");
        menuEditC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditCActionPerformed(evt);
            }
        });
        jMenu4.add(menuEditC);

        menuDelC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/delcompra.gif"))); // NOI18N
        menuDelC.setText("Borrar compra");
        menuDelC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDelCActionPerformed(evt);
            }
        });
        jMenu4.add(menuDelC);

        menuRegC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/rcompra.gif"))); // NOI18N
        menuRegC.setText("Registro de compras");
        menuRegC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegCActionPerformed(evt);
            }
        });
        jMenu4.add(menuRegC);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/venta.gif"))); // NOI18N
        jMenu5.setText("Ventas");

        menuNewV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/nventa.gif"))); // NOI18N
        menuNewV.setText("Registrar venta");
        menuNewV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNewVActionPerformed(evt);
            }
        });
        jMenu5.add(menuNewV);

        menuEditV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/editventa.gif"))); // NOI18N
        menuEditV.setText("Editar venta");
        menuEditV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditVActionPerformed(evt);
            }
        });
        jMenu5.add(menuEditV);

        menuDelV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/delventa.gif"))); // NOI18N
        menuDelV.setText("Borrar venta");
        menuDelV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDelVActionPerformed(evt);
            }
        });
        jMenu5.add(menuDelV);

        menuRegV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/rventa.gif"))); // NOI18N
        menuRegV.setText("Registro de ventas");
        menuRegV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegVActionPerformed(evt);
            }
        });
        jMenu5.add(menuRegV);

        jMenuBar1.add(jMenu5);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/inv.gif"))); // NOI18N
        jMenu1.setText("Inventario");

        menuInv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/view.gif"))); // NOI18N
        menuInv.setText("Ver inventario");
        menuInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInvActionPerformed(evt);
            }
        });
        jMenu1.add(menuInv);
        jMenu1.add(jSeparator1);

        menuEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/backm.png"))); // NOI18N
        menuEx.setText("Regresar");
        menuEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExActionPerformed(evt);
            }
        });
        jMenu1.add(menuEx);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btExitActionPerformed

    private void menuRegCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegCActionPerformed
        new CompraRegistro().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuRegCActionPerformed

    private void menuExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuExActionPerformed

    private void menuRegVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegVActionPerformed
        new VentaRegistro().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuRegVActionPerformed

    private void menuNewVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNewVActionPerformed
        new VentaFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuNewVActionPerformed

    private void menuInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInvActionPerformed
        new InventarioFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuInvActionPerformed

    private void menuNewCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNewCActionPerformed
        new CompraFrame().setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_menuNewCActionPerformed

    private void menuEditCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditCActionPerformed
        new CompraFrameOp().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuEditCActionPerformed

    private void menuEditVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditVActionPerformed
        new VentaFrameOp().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuEditVActionPerformed

    private void menuDelVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDelVActionPerformed
        new VentaFrameOp().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuDelVActionPerformed

    private void menuDelCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDelCActionPerformed
        new CompraFrameOp().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuDelCActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* Set the Nimbus look and feel */
        
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExit;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem menuDelC;
    private javax.swing.JMenuItem menuDelV;
    private javax.swing.JMenuItem menuEditC;
    private javax.swing.JMenuItem menuEditV;
    private javax.swing.JMenuItem menuEx;
    private javax.swing.JMenuItem menuInv;
    private javax.swing.JMenuItem menuNewC;
    private javax.swing.JMenuItem menuNewV;
    private javax.swing.JMenuItem menuRegC;
    private javax.swing.JMenuItem menuRegV;
    // End of variables declaration//GEN-END:variables
}
