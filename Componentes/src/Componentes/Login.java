package Componentes;

import MetodosDB.Metodos_SQL;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Belorzam
 */
public class Login extends javax.swing.JFrame {
    Comunicador com;
    public Login(Comunicador com) {
        this.com=com;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Su Inventario");
        this.setIconImage(new ImageIcon(getClass().getResource("/Iconos/Logotipo_3.png")).getImage());
    }

    Metodos_SQL metodos = new Metodos_SQL();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpanelLogin = new javax.swing.JPanel();
        JLBIniciarSesion = new javax.swing.JLabel();
        JLBUsuario = new javax.swing.JLabel();
        JLBContra = new javax.swing.JLabel();
        TXTUusario = new Componentes.TxtField();
        TXTPassWordField = new Componentes.PasswordField();
        JBLImagenUser = new Componentes.Label();
        JLBImagenPass = new Componentes.Label();
        BTNIngresar = new Componentes.Boton();
        jSeparatorUser = new javax.swing.JSeparator();
        jSeparatoPass = new javax.swing.JSeparator();
        JLBLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JpanelLogin.setBackground(new java.awt.Color(255, 255, 255));

        JLBIniciarSesion.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        JLBIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLBIniciarSesion.setText("SU INVENTARIO");

        JLBUsuario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBUsuario.setText("USUARIO:");

        JLBContra.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        JLBContra.setText("CONTRASEÑA:");

        TXTUusario.setText("Ingrese su usuario");
        TXTUusario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTUusarioActionPerformed(evt);
            }
        });

        TXTPassWordField.setText("passwordField1");

        JBLImagenUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/USER.png"))); // NOI18N

        JLBImagenPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Lock.png"))); // NOI18N

        BTNIngresar.setText("Ingresar");
        BTNIngresar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BTNIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNIngresarActionPerformed(evt);
            }
        });

        JLBLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLBLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logotipo_1.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Olvidó su contraseña?");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sistema de Gestión de Inventario");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Soporte: alfredoblz@hotmail.com");

        javax.swing.GroupLayout JpanelLoginLayout = new javax.swing.GroupLayout(JpanelLogin);
        JpanelLogin.setLayout(JpanelLoginLayout);
        JpanelLoginLayout.setHorizontalGroup(
            JpanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLBLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JpanelLoginLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(JpanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparatorUser)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLoginLayout.createSequentialGroup()
                                .addComponent(JBLImagenUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXTUusario, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jSeparatoPass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JpanelLoginLayout.createSequentialGroup()
                                .addComponent(JLBImagenPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXTPassWordField, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(BTNIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(JpanelLoginLayout.createSequentialGroup()
                                .addGroup(JpanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLBContra)
                                    .addComponent(JLBUsuario))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(13, 13, 13))
                    .addComponent(JLBIniciarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JpanelLoginLayout.setVerticalGroup(
            JpanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLBLogo)
                .addGap(1, 1, 1)
                .addComponent(JLBIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLBUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBLImagenUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TXTUusario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparatorUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLBContra)
                .addGap(10, 10, 10)
                .addGroup(JpanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXTPassWordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLBImagenPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatoPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JpanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTUusarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTUusarioActionPerformed


    }//GEN-LAST:event_TXTUusarioActionPerformed

    private void BTNIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNIngresarActionPerformed
        String validar_usuario = metodos.validarusuarioregistrado(TXTUusario.getText(), TXTPassWordField.getText());
        
        if (TXTUusario.getText().equals("root") && TXTPassWordField.getText().equals("root")) {
            JOptionPane.showMessageDialog(this, "Iniciaste sesion como ROOT (ADMINISTRADOR)"); 
            com.AbrirContendorPrincipal();
            com.CerrarLogin();

        } else if (validar_usuario.equals("Usuario encontrado")) {
            String mostrar_nombre = metodos.mostrar_nombre_log(TXTUusario.getText());
            JOptionPane.showMessageDialog(this, "Bienvenido/a: \n"+mostrar_nombre);
            com.AbrirContendorEmpleado();
            com.CerrarLogin();

        } else if (validar_usuario.equals("Usuario no encontrado")) {
            JOptionPane.showMessageDialog(this, "Datos erroneos, vuelva a intentar");

        }
    }//GEN-LAST:event_BTNIngresarActionPerformed

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
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Login().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.Boton BTNIngresar;
    private Componentes.Label JBLImagenUser;
    private javax.swing.JLabel JLBContra;
    private Componentes.Label JLBImagenPass;
    private javax.swing.JLabel JLBIniciarSesion;
    private javax.swing.JLabel JLBLogo;
    private javax.swing.JLabel JLBUsuario;
    private javax.swing.JPanel JpanelLogin;
    private Componentes.PasswordField TXTPassWordField;
    private Componentes.TxtField TXTUusario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparatoPass;
    private javax.swing.JSeparator jSeparatorUser;
    // End of variables declaration//GEN-END:variables
}
