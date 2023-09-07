
package universidad.acceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private String url;
    private String usuario;
    private String password;
    Connection conexion;

    public Conexion(String url, String user, String pass) {
        this.url = url; // "jdbc:mariabd://localhost/universidad"
        usuario = user;
        password = pass;
    }

    public Connection buscarConexion() {

        try {
            Class.forName("org.mariab.jdbc.Driver");//Cargar Driver de conexion
            conexion = DriverManager.getConnection(url, usuario, password); //conexion  la base de datos
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + " No ha sido posible la conexión", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return conexion;
    }
}
