package universidad;

/*
import java.time.LocalDate;
import java.time.Month;
import universidad.acceso.AlumnoData;
*/
import universidad.acceso.AlumnoData;
import universidad.acceso.Conexion;
import universidad.acceso.InscripcionData;
import universidad.acceso.MateriaData;
import universidad.entidades.Alumno;
import universidad.vistas.Uni;

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
   // Materia mat= new Materia("Topografia", 2, true);
   // Alumno ari = new Alumno(1,40678534,"Bartellini", "Ari", LocalDate.of(1998, Month.JANUARY,8),true);
    Uni.main(args);
 // Inscripcion ins = new Inscripcion(ari, mat, 3);
  //InscripcionData insDa = new InscripcionData();
  //insDa.guardarInscripcion(ins);
  
  AlumnoData ad = new AlumnoData();
  MateriaData md = new MateriaData();
  InscripcionData id = new InscripcionData();
            
    Alumno ari=ad.buscarAlumnoPorId(1);
    //Materia mate= md.buscarMateriaPorId(2);
    
    //Inscripcion insc = new Inscripcion(ari,mate,9);
    //id.guardarInscripcion(insc);
    //id.actualizarNota(1, 2, 7);
    //id.borrarInscripcionMateriaAlumno(1, 2);
 /* 
        for (Inscripcion inscripcion:id.obtenerInscripciones()) {
            System.out.println("id "+inscripcion.getIdInscripcion());
            System.out.println("apellido "+ inscripcion.getAlumno().getApellido());
            System.out.println("Materia "+ inscripcion.getMateria().getNombre());
            
            
        }
    */
 
  //  for(Materia materia: id.obtenerMateriasNoCursadas(2))
       //     System.out.println("materia: "+ materia.getNombre());
    }
 
}

