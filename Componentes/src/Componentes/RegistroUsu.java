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
public class RegistroUsu extends javax.swing.JFrame {

    public RegistroUsu(Comunicador conreg) {
        this.conreg=conreg;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setMoverVentana(this);
        rsutilities.RSUtilities.setOpaqueVentana(this, false);
        this.setIconImage(new ImageIcon(getClass().getResource("/Iconos/Logotipo_3.png")).getImage());
    }
    Comunicador conreg;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPNRegistro = new javax.swing.JPanel();
        label1 = new Componentes.Label();
        label3 = new Componentes.Label();
        JLBNombreRegistro = new javax.swing.JLabel();
        JLBApellidoRegistro = new javax.swing.JLabel();
        JLBNombreUsuarioRegistro = new javax.swing.JLabel();
        JLBContraseñaRegistro = new javax.swing.JLabel();
        JLBFechaNacRegistro = new javax.swing.JLabel();
        JLBDireccionRegistro = new javax.swing.JLabel();
        JLBCorreoElecRegistro = new javax.swing.JLabel();
        TxtNombreRegistro = new Componentes.TxtField();
        TxtApellidoRegistro = new Componentes.TxtField();
        TxtUsuarioRegistro = new Componentes.TxtField();
        TXTContraseñaRegistro = new Componentes.PasswordField();
        jSeparatorNombre = new javax.swing.JSeparator();
        jSeparatorApellidos = new javax.swing.JSeparator();
        jSeparatorUsuario = new javax.swing.JSeparator();
        jSeparatoContraseña = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        TXTCorreo = new Componentes.TxtField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXTDireccion = new javax.swing.JTextPane();
        BTNRegresar = new Componentes.Boton();
        BTNRegistar = new Componentes.Boton();
        fechanacimiento = new Componentes.Fechas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        JPNRegistro.setBackground(new java.awt.Color(255, 255, 255));
        JPNRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logotipo_2.png"))); // NOI18N
        label1.setText("Su Inventario");

        label3.setText("REGISTRO DE USUARIO");

        JLBNombreRegistro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBNombreRegistro.setText("Nombre:");

        JLBApellidoRegistro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBApellidoRegistro.setText("Apellidos:");

        JLBNombreUsuarioRegistro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBNombreUsuarioRegistro.setText("Usuario:");

        JLBContraseñaRegistro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBContraseñaRegistro.setText("Contraseña:");

        JLBFechaNacRegistro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBFechaNacRegistro.setText("Fecha de nacimiento:");

        JLBDireccionRegistro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBDireccionRegistro.setText("Dirección");

        JLBCorreoElecRegistro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBCorreoElecRegistro.setText("Correo electrónico:");

        TxtNombreRegistro.setText("Nombre");
        TxtNombreRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreRegistroActionPerformed(evt);
            }
        });

        TxtApellidoRegistro.setText("Apellidos");
        TxtApellidoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoRegistroActionPerformed(evt);
            }
        });

        TxtUsuarioRegistro.setText("Usuario");
        TxtUsuarioRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioRegistroActionPerformed(evt);
            }
        });

        TXTContraseñaRegistro.setText("passwordField1");

        TXTCorreo.setText("Correo electrónico");

        jScrollPane1.setViewportView(TXTDireccion);

        BTNRegresar.setText("Regresar");
        BTNRegresar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BTNRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRegresarActionPerformed(evt);
            }
        });

        BTNRegistar.setText("Registrarse");
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
                .addGroup(JPNRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNRegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JPNRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TXTCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparatoContraseña, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TXTContraseñaRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparatorApellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparatorNombre)
                            .addComponent(TxtUsuarioRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtNombreRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparatorUsuario)
                            .addComponent(TxtApellidoRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(JPNRegistroLayout.createSequentialGroup()
                                .addGroup(JPNRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JLBNombreRegistro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLBApellidoRegistro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLBNombreUsuarioRegistro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLBContraseñaRegistro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLBCorreoElecRegistro, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(JPNRegistroLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(BTNRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(JPNRegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(JPNRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPNRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLBFechaNacRegistro)
                    .addComponent(fechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLBDireccionRegistro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(TxtNombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBApellidoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(TxtApellidoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBNombreUsuarioRegistro)
                .addGap(1, 1, 1)
                .addComponent(TxtUsuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBContraseñaRegistro)
                .addGap(1, 1, 1)
                .addComponent(TXTContraseñaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBCorreoElecRegistro)
                .addGap(1, 1, 1)
                .addComponent(TXTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(JLBFechaNacRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBDireccionRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(JPNRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPNRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPNRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtUsuarioRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioRegistroActionPerformed

    private void TxtNombreRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreRegistroActionPerformed

    private void TxtApellidoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoRegistroActionPerformed

    private void BTNRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegistarActionPerformed
        try {
            PreparedStatement rs = cn.prepareStatement("INSERT INTO Usuario (IdUsuario,Contraseña,Nombre,Apellidos,Correo,fechanacimiento,Direccion)"
                + "Values(?,?,?,?,?,?,?)");
            rs.setString(1, TxtUsuarioRegistro.getText());
            rs.setString(2, TXTContraseñaRegistro.getText());
            rs.setString(3, TxtNombreRegistro.getText());
            rs.setString(4, TxtApellidoRegistro.getText());
            rs.setString(5, TXTCorreo.getText());
            Calendar cal = fechanacimiento.getCalendar();
            Date date = (Date) fechanacimiento.getDate();
            SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = format1.format(date);
            System.out.println(date1);
            rs.setString(6, date1);
            rs.setString(7, TXTDireccion.getText());
            rs.executeUpdate();
            conreg.MostrarDatosprim();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        JOptionPane.showMessageDialog(this, "Usuario registrado con éxito");
        conreg.MostrarDatosprim();
        this.dispose();
    }//GEN-LAST:event_BTNRegistarActionPerformed

    private void BTNRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BTNRegresarActionPerformed

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
    private javax.swing.JLabel JLBContraseñaRegistro;
    private javax.swing.JLabel JLBCorreoElecRegistro;
    private javax.swing.JLabel JLBDireccionRegistro;
    private javax.swing.JLabel JLBFechaNacRegistro;
    private javax.swing.JLabel JLBNombreRegistro;
    private javax.swing.JLabel JLBNombreUsuarioRegistro;
    private javax.swing.JPanel JPNRegistro;
    private Componentes.PasswordField TXTContraseñaRegistro;
    private Componentes.TxtField TXTCorreo;
    private javax.swing.JTextPane TXTDireccion;
    private Componentes.TxtField TxtApellidoRegistro;
    private Componentes.TxtField TxtNombreRegistro;
    private Componentes.TxtField TxtUsuarioRegistro;
    private Componentes.Fechas fechanacimiento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatoContraseña;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparatorApellidos;
    private javax.swing.JSeparator jSeparatorNombre;
    private javax.swing.JSeparator jSeparatorUsuario;
    private Componentes.Label label1;
    private Componentes.Label label3;
    // End of variables declaration//GEN-END:variables
    ConexionDB cc = new ConexionDB();
    Connection cn = cc.conectar();
}
