package universidad.acceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "universidad";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    Connection conexion = null;

    public Conexion() {
    }

    public Connection buscarConexion() {
        if (conexion == null) {
            try {
                Class.forName("org.mariab.jdbc.Driver");//Cargar Driver de conexion
                conexion = DriverManager.getConnection(URL + DB + USUARIO + PASSWORD); //conexion  la base de datos
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, " No ha sido posible la conexión con la BD", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers");
            }

            return conexion;
        }
        return conexion;

    }
}
