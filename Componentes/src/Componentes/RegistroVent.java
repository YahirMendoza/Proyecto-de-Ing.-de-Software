package Componentes;

import MetodosDB.ConexionDB;
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
public class RegistroVent extends javax.swing.JFrame {

    public RegistroVent(Comunicador conven) {
        this.conven=conven;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setMoverVentana(this);
        rsutilities.RSUtilities.setOpaqueVentana(this, false);
        this.setIconImage(new ImageIcon(getClass().getResource("/Iconos/Logotipo_3.png")).getImage());
    }

    Comunicador conven;
    
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
        TxtNombrecliente = new Componentes.TxtField();
        TxtProductos = new Componentes.TxtField();
        Txtprecio = new Componentes.TxtField();
        jSeparatorNombre = new javax.swing.JSeparator();
        jSeparatorApellidos = new javax.swing.JSeparator();
        jSeparatorUsuario = new javax.swing.JSeparator();
        jSeparatoContraseña = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXTDireccioncliente = new javax.swing.JTextPane();
        BTNRegresar = new Componentes.Boton();
        BTNRegistar = new Componentes.Boton();
        fechaventa = new Componentes.Fechas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        JPNRegistro.setBackground(new java.awt.Color(255, 255, 255));
        JPNRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logotipo_2.png"))); // NOI18N
        label1.setText("Su Inventario");

        label3.setText("REGISTRO DE VENTA");

        JLBNombreRegistro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBNombreRegistro.setText("Cliente:");

        JLBApellidoRegistro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBApellidoRegistro.setText("Productos");

        JLBNombreUsuarioRegistro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBNombreUsuarioRegistro.setText("Precio:");

        JLBFechaNacRegistro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBFechaNacRegistro.setText("Fecha de nacimiento:");

        JLBDireccionRegistro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBDireccionRegistro.setText("Dirección");

        TxtNombrecliente.setText("Ingrese cliente");
        TxtNombrecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreclienteActionPerformed(evt);
            }
        });

        TxtProductos.setText("Ingrese productos");
        TxtProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtProductosActionPerformed(evt);
            }
        });

        Txtprecio.setText("Ingrese el precio");
        Txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtprecioActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(TXTDireccioncliente);

        BTNRegresar.setText("Regresar");
        BTNRegresar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BTNRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRegresarActionPerformed(evt);
            }
        });

        BTNRegistar.setText("Registrar");
        BTNRegistar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BTNRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRegistarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPNRegistroLayout = new javax.swing.GroupLayout(JPNRegistro);
        JPNRegistro.setLayout(JPNRegistroLayout);
        JPNRegistroLayout.setHorizontalGroup(
            JPNRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JPNRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPNRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatoContraseña, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparatorApellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparatorNombre)
                    .addComponent(Txtprecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtNombrecliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparatorUsuario)
                    .addComponent(TxtProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPNRegistroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(BTNRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(JPNRegistroLayout.createSequentialGroup()
                        .addGroup(JPNRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBNombreRegistro)
                            .addComponent(JLBApellidoRegistro)
                            .addComponent(JLBNombreUsuarioRegistro)
                            .addComponent(JLBFechaNacRegistro)
                            .addComponent(fechaventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLBDireccionRegistro))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPNRegistroLayout.setVerticalGroup(
            JPNRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(JLBNombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(TxtNombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBApellidoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(TxtProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBNombreUsuarioRegistro)
                .addGap(1, 1, 1)
                .addComponent(Txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBFechaNacRegistro)
                .addGap(5, 5, 5)
                .addComponent(fechaventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBDireccionRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPNRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPNRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPNRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegistarActionPerformed
        try {
            PreparedStatement rs = cn.prepareStatement("INSERT INTO ventas (Nombre_c,Prods,Precio_c,Fechaventa,Direccion_c)"
                + "Values(?,?,?,?,?)");
            rs.setString(1, TxtNombrecliente.getText());
            rs.setString(2, TxtProductos.getText());
            rs.setString(3, Txtprecio.getText());
            Calendar cal = fechaventa.getCalendar();
            Date date = (Date) fechaventa.getDate();
            SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = format1.format(date);
            rs.setString(4, date1);
            rs.setString(5, TXTDireccioncliente.getText());
            rs.executeUpdate();
            conven.MostrarDatosVen();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        JOptionPane.showMessageDialog(this, "Venta registrada con éxito");
        conven.MostrarDatosVen();
        this.dispose();
    }//GEN-LAST:event_BTNRegistarActionPerformed

    private void BTNRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BTNRegresarActionPerformed

    private void TxtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtprecioActionPerformed

    private void TxtProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtProductosActionPerformed

    private void TxtNombreclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreclienteActionPerformed

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
//            java.util.logging.Logger.getLogger(RegistroUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RegistroUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RegistroUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegistroUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegistroUsu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.Boton BTNRegistar;
    private Componentes.Boton BTNRegresar;
    private javax.swing.JLabel JLBApellidoRegistro;
    private javax.swing.JLabel JLBDireccionRegistro;
    private javax.swing.JLabel JLBFechaNacRegistro;
    private javax.swing.JLabel JLBNombreRegistro;
    private javax.swing.JLabel JLBNombreUsuarioRegistro;
    private javax.swing.JPanel JPNRegistro;
    private javax.swing.JTextPane TXTDireccioncliente;
    private Componentes.TxtField TxtNombrecliente;
    private Componentes.TxtField TxtProductos;
    private Componentes.TxtField Txtprecio;
    private Componentes.Fechas fechaventa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatoContraseña;
    private javax.swing.JSeparator jSeparatorApellidos;
    private javax.swing.JSeparator jSeparatorNombre;
    private javax.swing.JSeparator jSeparatorUsuario;
    private Componentes.Label label1;
    private Componentes.Label label3;
    // End of variables declaration//GEN-END:variables
    ConexionDB cc = new ConexionDB();
    Connection cn = cc.conectar();
}
