package MetodosDB;

import Componentes.ContenedorPrincipal;
import Componentes.RegistroUsu;
import Componentes.TxtField;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Belorzam
 */
public class Metodos_SQL {

    public static ConexionDB conexion = new ConexionDB();
    public static PreparedStatement sentencia_preparada;
    public static Statement sentencia_state;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    public int guardar(String IdUsuario, String Contraseña, String Nombre, String Apellidos, String Correo, Date fechanacimiento, String Direccion) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO Usuario (IdUsuario,Contraseña,Nombre,Apellidos,Correo,fechanacimiento,Direccion)"
                + "Values(?,?,?,?,?,?,?)");
        try {
            conexion = ConexionDB.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, IdUsuario);
            sentencia_preparada.setString(2, Contraseña);
            sentencia_preparada.setString(3, Nombre);
            sentencia_preparada.setString(4, Apellidos);
            sentencia_preparada.setString(5, Correo);
            sentencia_preparada.setDate(6, fechanacimiento);
            sentencia_preparada.setString(7, Direccion);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    public static String validarusuarioregistrado(String IdUsuario, String Contraseña) {
        String validar_usuario = null;
        Connection conexion = null;
        try {
            conexion = ConexionDB.conectar();
            String sentencia_validar_usuario = ("SELECT IdUsuario,Contraseña FROM Usuario WHERE IdUsuario = '" + IdUsuario + "' AND Contraseña = '" + Contraseña + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_validar_usuario);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                validar_usuario = "Usuario encontrado";
            } else {
                validar_usuario = "Usuario no encontrado";
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return validar_usuario;
    }

    public static String mostrar_nombre_log(String IdUsuario) {
        String mostrar_nombre = null;
        Connection conexion = null;
        try {
            conexion = ConexionDB.conectar();
            String sentencia_mostrar_nombre = ("SELECT Nombre,Apellidos from Usuario WHERE IdUsuario ='" + IdUsuario + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_mostrar_nombre);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                String Nombre = resultado.getString("Nombre");
                String Apellidos = resultado.getString("Apellidos");
                mostrar_nombre = (Nombre + " " + Apellidos);
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return mostrar_nombre;
    }

    public static DefaultTableModel listarUsuarios(){
        Connection conexion = null;      
        DefaultTableModel modelo = new DefaultTableModel();
//        String []datos = new String[4];
        try {
            conexion = ConexionDB.conectar();            
            sentencia_state = conexion.createStatement();
            resultado = null;           
            String sentencia_listar_usuario = ("SELECT IdUsuario,Nombre,Apellidos,Correo from Usuario");           
            resultado = sentencia_state.executeQuery(sentencia_listar_usuario);
            modelo.setColumnIdentifiers(new Object[]{"Usuario","Nombre","Apellidos","Correo"});
                while (resultado.next()) {  
                    modelo.addRow(new Object[]{resultado.getString("IdUsuario"),
                        resultado.getString("Nombre"),
                        resultado.getString("Apellidos"),
                        resultado.getString("Correo")});                        
                }
                conexion.close();
                return modelo;          
        } catch (Exception e) {
            System.out.println(e);
        }
        return modelo;
        
    }
    
}
