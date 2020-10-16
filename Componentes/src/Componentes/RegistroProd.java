package Componentes;

import MetodosDB.ConexionDB;
import MetodosDB.Metodos_SQL;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author Belorzam
 */
public class RegistroProd extends javax.swing.JFrame {

    public RegistroProd(Comunicador conregprod) {
        this.conregprod=conregprod;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setMoverVentana(this);
        rsutilities.RSUtilities.setOpaqueVentana(this, false);
        this.setIconImage(new ImageIcon(getClass().getResource("/Iconos/Logotipo_3.png")).getImage());
    }
    Comunicador conregprod;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPNRegistro = new javax.swing.JPanel();
        label1 = new Componentes.Label();
        label3 = new Componentes.Label();
        JLBNombreRegistro = new javax.swing.JLabel();
        JLBApellidoRegistro = new javax.swing.JLabel();
        JLBNombreUsuarioRegistro = new javax.swing.JLabel();
        JLBFechaNacRegistro = new javax.swing.JLabel();
        JLBDireccionRegistro = new javax.swing.JLabel();
        TxtNombreProducto = new Componentes.TxtField();
        TxtCantidadProducto = new Componentes.TxtField();
        TxtPrecioProducto = new Componentes.TxtField();
        jSeparatorNombre = new javax.swing.JSeparator();
        jSeparatorApellidos = new javax.swing.JSeparator();
        jSeparatorUsuario = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXTDescripcionprod = new javax.swing.JTextPane();
        BTNRegresarProd = new Componentes.Boton();
        BTNRegistarprod = new Componentes.Boton();
        fechacompra = new Componentes.Fechas();
        TxtCodifoProducto = new Componentes.TxtField();
        JLBNombreRegistro1 = new javax.swing.JLabel();
        jSeparatorNombre1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        JPNRegistro.setBackground(new java.awt.Color(255, 255, 255));
        JPNRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logotipo_2.png"))); // NOI18N
        label1.setText("Su Inventario");

        label3.setText("REGISTRO DE PRODUCTO");

        JLBNombreRegistro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBNombreRegistro.setText("Nombre:");

        JLBApellidoRegistro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBApellidoRegistro.setText("Cantidad:");

        JLBNombreUsuarioRegistro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBNombreUsuarioRegistro.setText("Precio:");

        JLBFechaNacRegistro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBFechaNacRegistro.setText("Fecha de compra:");

        JLBDireccionRegistro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBDireccionRegistro.setText("Descripción:");

        TxtNombreProducto.setText("Nombre de producto");
        TxtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreProductoActionPerformed(evt);
            }
        });

        TxtCantidadProducto.setText("Cantidad de productos");
        TxtCantidadProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCantidadProductoActionPerformed(evt);
            }
        });

        TxtPrecioProducto.setText("Precio total");
        TxtPrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrecioProductoActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(TXTDescripcionprod);

        BTNRegresarProd.setText("Regresar");
        BTNRegresarProd.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BTNRegresarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRegresarProdActionPerformed(evt);
            }
        });

        BTNRegistarprod.setText("Registrar");
        BTNRegistarprod.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BTNRegistarprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRegistarprodActionPerformed(evt);
            }
        });

        TxtCodifoProducto.setText("Código del producto");
        TxtCodifoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodifoProductoActionPerformed(evt);
            }
        });

        JLBNombreRegistro1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBNombreRegistro1.setText("Código");

        javax.swing.GroupLayout JPNRegistroLayout = new javax.swing.GroupLayout(JPNRegistro);
        JPNRegistro.setLayout(JPNRegistroLayout);
        JPNRegistroLayout.setHorizontalGroup(
            JPNRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JPNRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPNRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtCodifoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(jSeparatorApellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparatorNombre)
                    .addComponent(TxtPrecioProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(TxtNombreProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(jSeparatorUsuario)
                    .addComponent(TxtCantidadProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(fechacompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(JPNRegistroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(BTNRegresarProd, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNRegistarprod, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(JPNRegistroLayout.createSequentialGroup()
                        .addGroup(JPNRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBNombreRegistro1)
                            .addComponent(JLBNombreRegistro)
                            .addComponent(JLBApellidoRegistro)
                            .addComponent(JLBNombreUsuarioRegistro)
                            .addComponent(JLBFechaNacRegistro)
                            .addComponent(JLBDireccionRegistro))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(JPNRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPNRegistroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparatorNombre1)
                    .addContainerGap()))
        );
        JPNRegistroLayout.setVerticalGroup(
            JPNRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBNombreRegistro1, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtCodifoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBNombreRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(TxtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBApellidoRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(TxtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBNombreUsuarioRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(TxtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBDireccionRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBFechaNacRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechacompra, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNRegresarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNRegistarprod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(JPNRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPNRegistroLayout.createSequentialGroup()
                    .addGap(162, 162, 162)
                    .addComponent(jSeparatorNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(374, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPNRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPNRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtPrecioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrecioProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrecioProductoActionPerformed

    private void TxtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreProductoActionPerformed

    private void TxtCantidadProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCantidadProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCantidadProductoActionPerformed

    private void BTNRegistarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegistarprodActionPerformed
        try {
            PreparedStatement rs = cn.prepareStatement("INSERT INTO producto (Cod_prod,Nombre,Cantidad,Precio,Descripcion, FechaEntrega)"
                + "Values(?,?,?,?,?,?)");
            rs.setString(1, TxtCodifoProducto.getText());
            rs.setString(2, TxtNombreProducto.getText());
            rs.setString(3, TxtCantidadProducto.getText());
            rs.setString(4, TxtPrecioProducto.getText());
            rs.setString(5, TXTDescripcionprod.getText());
            Calendar cal = fechacompra.getCalendar();
            Date date = (Date) fechacompra.getDate();
            SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
            String date2 = format2.format(date);
            System.out.println(date2);;
            rs.setString(6, date2);
            rs.executeUpdate();
            conregprod.MostrarDatosInv();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        JOptionPane.showMessageDialog(this, "Producto registrado con éxito");
        conregprod.MostrarDatosInv();
        this.dispose();
    }//GEN-LAST:event_BTNRegistarprodActionPerformed

    private void BTNRegresarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegresarProdActionPerformed
        this.dispose();
    }//GEN-LAST:event_BTNRegresarProdActionPerformed

    private void TxtCodifoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodifoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodifoProductoActionPerformed

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Registro().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.Boton BTNRegistarprod;
    private Componentes.Boton BTNRegresarProd;
    private javax.swing.JLabel JLBApellidoRegistro;
    private javax.swing.JLabel JLBDireccionRegistro;
    private javax.swing.JLabel JLBFechaNacRegistro;
    private javax.swing.JLabel JLBNombreRegistro;
    private javax.swing.JLabel JLBNombreRegistro1;
    private javax.swing.JLabel JLBNombreUsuarioRegistro;
    private javax.swing.JPanel JPNRegistro;
    private javax.swing.JTextPane TXTDescripcionprod;
    private Componentes.TxtField TxtCantidadProducto;
    private Componentes.TxtField TxtCodifoProducto;
    private Componentes.TxtField TxtNombreProducto;
    private Componentes.TxtField TxtPrecioProducto;
    private Componentes.Fechas fechacompra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatorApellidos;
    private javax.swing.JSeparator jSeparatorNombre;
    private javax.swing.JSeparator jSeparatorNombre1;
    private javax.swing.JSeparator jSeparatorUsuario;
    private Componentes.Label label1;
    private Componentes.Label label3;
    // End of variables declaration//GEN-END:variables
    ConexionDB cc = new ConexionDB();
    Connection cn = cc.conectar();
}
