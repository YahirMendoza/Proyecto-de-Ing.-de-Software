
package Componentes;

/**
 *
 * @author Belorzam
 */
public interface Comunicador {
    public void AbrirLogin();
    public void CerrarLogin();

    public void AbrirContendorPrincipal();
    public void CerrarContendorPrincipal();

    public void AbrirContendorEmpleado();
    public void CerrarContendorEmpleado();

    public void AbrirRegistro();
    public void CerrarRegistro();
    
    public void AbrirRegistroprod();
    public void CerrarRegistroprod();
    
    public void AbrirRegistroven();
    public void CerrarRegistroven();
    
    public void MostrarDatosprim();
    public void MostrarDatosInv();
    public void MostrarDatosVen();
}
