package universidad.entidades;
public class Inscripcion {
    private int idInscripcion;
    private Alumno alumno;
    private Materia materia;
    double nota;

    public Inscripcion() {
    }

    public Inscripcion(Alumno alumno, Materia materia, double nota) {
        //this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
       
    }

    

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        String insc= idInscripcion + " " + alumno.getNombre() + " " + alumno.getApellido()+ " " + materia.getNombre();
        return insc;
    }
    
    
}
