package universidad.acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import universidad.entidades.Inscripcion;


public class InscripcionData {

    private Connection con;
    private MateriaData matData;
    private AlumnoData aluData;
    
    public InscripcionData() {
        con = Conexion.buscarConexion(); 
    }
   
    public void guardarInscripcion(Inscripcion ins){
        String sql = "INSERT INTO inscripcion (idAlumno, idMateria) VALUES (?,?)";
        try {   
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,ins.getIdInscripcion());
            ps.setInt(2, ins.getMateria());
            
            
        } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    
    }
}
 