package universidad.acceso;

import java.sql.Connection;


public class InscripcionData {

    private Connection con;
    
    public InscripcionData() {
        con = Conexion.buscarConexion(); // :c
    }
   
    
}
 