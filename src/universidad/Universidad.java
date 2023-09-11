package universidad;


import java.time.LocalDate;
import java.time.Month;
import universidad.acceso.AlumnoData;
import universidad.acceso.Conexion;
import universidad.entidades.Alumno;

public class Universidad {

    public static void main(String[] args) {
    Conexion con= new Conexion();
    
     Alumno ari = new Alumno(1,40678534,"Bartellini", "Ari", LocalDate.of(1998, Month.JANUARY,8),true);
    AlumnoData alumno = new AlumnoData();
    //alumno.guardarAlumno(ari);
    alumno.modificarAlumno(ari);
    
    
    }
    
}
