package universidad.acceso;

import java.sql.Connection;


public class InscripcionData {

    private Connection con;
    private MateriaData matData;
    private AlumnoData aluData;
    
    public InscripcionData() {
        con = Conexion.buscarConexion(); 
    }
   
    public void guardarInscripcion(Inscripcion ins){
        String sql = "INSERT INTO inscripcion (idAlumno, idMateria) VALUES (?,?)";
        
    }
    
}
 