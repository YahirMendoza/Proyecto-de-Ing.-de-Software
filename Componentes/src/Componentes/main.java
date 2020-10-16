/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

/**
 *
 * @author Belorzam
 */
public class main implements Comunicador{
        
        Login ventlog;
        ContenedorPrincipal contprin;
        ContenedorEmpleado contemp;
        RegistroUsu reg;
        RegistroProd regprod;
        RegistroVent regven;
        
        public main(){
            ventlog=null;
            contprin=null;
            reg=null;
            regprod=null;
        }
        
        public void AbrirLog(){
            ventlog = new Login(this);
            ventlog.setVisible(true);
        }
        
        public void AbirPrincipal(){
            contprin = new ContenedorPrincipal(this);
            contprin.setVisible(true);
        }

        public void AbirPrincipalemp(){
            contemp = new ContenedorEmpleado(this);
            contemp.setVisible(true);
        }
        
        public void AbirReg(){
            reg = new RegistroUsu(this);
            reg.setVisible(true);
        }
        
        public void AbirRegprod(){
            regprod = new RegistroProd(this);
            regprod.setVisible(true);
        }
        
        public void AbirRegven(){
            regven = new RegistroVent(this);
            regven.setVisible(true);
        }
        
        public void CerrarLog(){
            if(ventlog!=null)
            ventlog.dispose();
        }
        
        public void CerrarPrincipal(){
            if(contprin!=null)
            contprin.dispose();
        }
        
        public void CerrarPrincipalemp(){
            if(contemp!=null)
            contemp.dispose();
        }
        
        public void CerrarReg(){
            if(reg!=null)
            reg.dispose();
        }
        
        public void CerrarRegprod(){
            if(regprod!=null)
            regprod.dispose();
        }
        
        public void CerrarRegven(){
            if(regven!=null)
            regven.dispose();
        }
        
        
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
            java.util.logging.Logger.getLogger(ContenedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContenedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContenedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContenedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                main cab = new main();
                cab.AbrirLog();
            }
        });
        
        
    }

    @Override
    public void AbrirLogin() {
        AbrirLog();
    }

    @Override
    public void CerrarLogin() {
        CerrarLog();
    }

    @Override
    public void AbrirContendorPrincipal() {
        AbirPrincipal();
    }

    @Override
    public void CerrarContendorPrincipal() {
        CerrarPrincipal();
    }

    @Override
    public void AbrirContendorEmpleado() {
        AbirPrincipalemp();
    }

    @Override
    public void CerrarContendorEmpleado() {
        CerrarPrincipalemp();
    }    
    
    @Override
    public void AbrirRegistro() {
        AbirReg();
    }

    @Override
    public void CerrarRegistro() {
        CerrarReg();
    }
    
    @Override
    public void AbrirRegistroprod() {
        AbirRegprod();
    }
    
    @Override
    public void AbrirRegistroven() {
        AbirRegven();
    }

    @Override
    public void CerrarRegistroprod() {
        CerrarRegprod();
    }
    
    @Override
    public void CerrarRegistroven() {
        CerrarRegven();
    }
    
    @Override
    public void MostrarDatosprim() {
        if(contprin!=null)
            contprin.mostrardatos("");
    }

    @Override
    public void MostrarDatosInv() {
        if(contprin!=null)
            contprin.mostrardatosInv("");
    }    

    @Override
    public void MostrarDatosVen() {
        if (contemp!=null) {
            contemp.mostrardatosInv("");
        }
    }
   
}

