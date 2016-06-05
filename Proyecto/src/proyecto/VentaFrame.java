package proyecto;

import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static java.lang.Thread.sleep;

public class VentaFrame extends javax.swing.JFrame {

    VentaMetodo objVenta = new VentaMetodo();

    /**
     * Creates new form NewVentaFrame
     */
    public VentaFrame() {
        initComponents();
        iniciarTabla();
    }

    class tabla1 extends Thread {

        public void run() {

            try {
                int filas = mod1.getRowCount();
                for (int i = 0; filas > i; i++) {
                    mod1.removeRow(0);
                }
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }

            InventarioMetodo cargar = new InventarioMetodo();
            ArrayList<Inventario> arrP = cargar.getInv();
            while (!arrP.isEmpty()) {
                Inventario x = arrP.remove(0);
                mod1.addRow(x.getRow());
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        btExit = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtProd = new javax.swing.JTextField();
        jLabelProd = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabelCode = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabelQtt = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        txtQtt = new javax.swing.JTextField();
        txtFecha = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        btList = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuReg = new javax.swing.JMenuItem();
        menuBack = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de venta.");

        btExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/backm.png"))); // NOI18N
        btExit.setText("Salir");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/save.gif"))); // NOI18N
        btSave.setText("Guardar");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        jLabelProd.setText("Producto");

        jLabelCode.setText("Código");

        jLabelPrecio.setText("Precio");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabelQtt.setText("Cantidad");

        jLabelFecha.setText("Fecha");

        txtFecha.setModel(new javax.swing.SpinnerDateModel());
        txtFecha.setEditor(new javax.swing.JSpinner.DateEditor(txtFecha, "dd/MM/yyyy"));

        jButton1.setText("Limpiar formulario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCode))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelQtt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrecio))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProd)
                    .addComponent(jLabelCode)
                    .addComponent(jLabelPrecio)
                    .addComponent(jLabelQtt)
                    .addComponent(jLabelFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        btList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/list.gif"))); // NOI18N
        btList.setText("Listar");
        btList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListActionPerformed(evt);
            }
        });

        jMenu1.setText("Menú");

        menuReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/rventa.gif"))); // NOI18N
        menuReg.setText("Ver registros");
        menuReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegActionPerformed(evt);
            }
        });
        jMenu1.add(menuReg);

        menuBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/backm.png"))); // NOI18N
        menuBack.setText("Regresar");
        menuBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBackActionPerformed(evt);
            }
        });
        jMenu1.add(menuBack);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSave)
                        .addGap(32, 32, 32)
                        .addComponent(btExit)
                        .addGap(22, 22, 22)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSave)
                    .addComponent(btExit)
                    .addComponent(btList))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        new Menu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btExitActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        //        ingresar();
        //registrar venta
        String date = new SimpleDateFormat("yyyy/MM/dd").format(txtFecha.getValue());
        VentaMetodo add = new VentaMetodo();
        Venta x = new Venta();
        x.setProducto(txtProd.getText());
        x.setCode(txtCode.getText());
        x.setQtt(txtQtt.getText());
        x.setPrecio(txtPrecio.getText());
        x.setFecha(date);
        add.addVenta(x);
        System.out.println(txtFecha.getValue().toString());
        //actualizar inventario
        InventarioMetodo act = new InventarioMetodo();
        Inventario y = new Inventario();
        y.setQtt(txtQtt.getText());
        y.setCode(txtCode.getText());
        act.actInvVenta(y);
    }//GEN-LAST:event_btSaveActionPerformed

    private void menuRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegActionPerformed
        this.setVisible(false);
        new VentaRegistro().setVisible(true);
    }//GEN-LAST:event_menuRegActionPerformed

    private void menuBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBackActionPerformed
        new Menu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuBackActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        int numReg = table1.getSelectedRow();
        txtProd.setText(table1.getValueAt(numReg, 0).toString());
        txtCode.setText(table1.getValueAt(numReg, 1).toString());
        txtQtt.setText(table1.getValueAt(numReg, 2).toString());
        txtPrecio.setText(table1.getValueAt(numReg, 3).toString());
    }//GEN-LAST:event_table1MouseClicked

    private void btListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListActionPerformed
        new tabla1().start();
    }//GEN-LAST:event_btListActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaFrame().setVisible(true);
            }
        });
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="code archivos">
/* start of comment
        void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    void ingresar() {
        Venta newV = objVenta.buscar(txtCode.getText());
        if (newV == null) {
            newV = new Venta(txtProd.getText(), txtCode.getText(), 
                        txtQtt.getText(), txtPrecio.getText(), txtFecha.getText());
            objVenta.agregar(newV);
            objVenta.guardar();
//            listar();
            mensaje("Venta registrada");
        }
        else {
            mensaje("Codigo ya existe");
        }
    }
     */
// </editor-fold>
    DefaultTableModel mod1 = new DefaultTableModel();

    void iniciarTabla() {

        String encabezado[] = {"Producto", "Código", "Cantidad", "Precio"};

        mod1.setColumnIdentifiers(encabezado);
        table1.setModel(mod1);
    }

    void limpiarFormulario() {
        this.txtProd.setText("");
        this.txtCode.setText("");
        this.txtQtt.setText("");
        this.txtPrecio.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExit;
    private javax.swing.JButton btList;
    private javax.swing.JButton btSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelCode;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelProd;
    private javax.swing.JLabel jLabelQtt;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem menuBack;
    private javax.swing.JMenuItem menuReg;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtCode;
    private javax.swing.JSpinner txtFecha;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProd;
    private javax.swing.JTextField txtQtt;
    // End of variables declaration//GEN-END:variables
}
