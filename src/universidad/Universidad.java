package universidad;

/*
import java.time.LocalDate;
import java.time.Month;
import universidad.acceso.AlumnoData;
*/
import java.time.LocalDate;
import java.time.Month;
import universidad.acceso.Conexion;
import universidad.acceso.InscripcionData;
import universidad.entidades.Alumno;
import universidad.entidades.Inscripcion;
import universidad.entidades.Materia;
import universidad.vistas.uni;

//import universidad.entidades.Alumno;

public class Universidad {

    public static void main(String[] args) {
    Conexion con= new Conexion();
    /*
    Alumno ari = new Alumno(1,40678534,"Bartellini", "Ari", LocalDate.of(1998, Month.JANUARY,8),true);
    AlumnoData alumno = new AlumnoData();
    //alumno.guardarAlumno(ari);
   // alumno.modificarAlumno(ari);
     Alumno alumnoEncontrado = alumno.buscarAlumnoPorId(1);
     System.out.println("dni "+alumnoEncontrado.getDni());
     System.out.println("apellido "+alumnoEncontrado.getApellido());
    */
    Materia mat= new Materia("Topografia", 2, true);
    Alumno ari = new Alumno(1,40678534,"Bartellini", "Ari", LocalDate.of(1998, Month.JANUARY,8),true);
    uni.main(args);
  Inscripcion ins = new Inscripcion(ari, mat);
  InscripcionData insDa = new InscripcionData();
  insDa.guardarInscripcion(ins);
  
  
            
    
    
    }
    
}

/*
1)Al hacer un borrado logico en materia o alumno, se duplica al recargarlo en vez de reactivarlo
2)Podemos cambiar el boton Buscar del formulario de materias?
3)que tanto nos podemos alejar del modelo original?
4)Como no agregar materias iguales? 
5) No podemos no poner la ultima nota en inscripcion?
*/