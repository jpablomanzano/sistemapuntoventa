/*
 Clase de conexión a la base de datos
* Clases con los métodos para insertar, modificar, eliminar, mostrar, filtrar registros
de la db"
 */
package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo Lorca
 */
public class conexion {
    public String db = "basereserva";
    public String url = "jdbc:mysql://127.0.0.1"+db;
    public String user = "root";
    public String pass = "";

    public conexion() {
    }
    
    public Connection conectar () {
        Connection link=null;
        
        // Declaracion capturador de errores
        try {
            //Cargo el driver de la conexion
            Class.forName("org.gjt.mm.mysql");
            link = DriverManager.getConnection(this.url, this.user, this.pass);
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
   }
        
        return link;
    
    
    }
    
}
