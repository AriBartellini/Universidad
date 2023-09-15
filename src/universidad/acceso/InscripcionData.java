package universidad.acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import universidad.entidades.Alumno;
import universidad.entidades.Inscripcion;
import universidad.entidades.Materia;

public class InscripcionData {

    private Connection con;
    //private MateriaData matData;
    //private AlumnoData aluData;

    public InscripcionData() {
        con = Conexion.buscarConexion();
    }

    public void guardarInscripcion(Inscripcion ins) {
        String sql = "INSERT INTO inscripcion (idAlumno, idMateria, nota) VALUES (?,?,?)";
        
        

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ins.getAlumno().getIdAlumno());
            ps.setInt(2, ins.getMateria().getIdMateria());
            ps.setDouble(3, ins.getNota());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                
                ins.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion cargada correctamente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
 
    }
    public void actualizarNota(int idAlumno, int idMateria, double nota){
            String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? and idMateria = ?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas = ps.executeUpdate();
            if (filas>0){
                JOptionPane.showMessageDialog(null, "Nota actualizada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
            
        }
    
        public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
            String sql = "DELETE FROM inscripcion WHERE idAlumno = ? and idMateria = ?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
            int filas = ps.executeUpdate();
            if(filas>0){
                JOptionPane.showMessageDialog(null, "Inscripcion eliminada correctamente");
            }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
}
