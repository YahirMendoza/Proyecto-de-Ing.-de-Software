
package MetodosDB;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Belorzam
 */
public class ConexionDB {
    public static String url = "jdbc:mysql://localhost/Farmacia";
    public static String usuario = "root";
    public static String contraseña = "";
    public static String clase = "com.mysql.jdbc.Driver";

    public static Connection conectar(){
        Connection conexion = null;
        try {
           Class.forName(clase);
           conexion = (Connection) DriverManager.getConnection(url,usuario,contraseña);
            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conexion;
    }

}
