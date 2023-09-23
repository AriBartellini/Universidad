package universidad;

import javax.swing.UnsupportedLookAndFeelException;
import universidad.acceso.Conexion;
import universidad.vistas.Uni;


public class Universidad {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
    Conexion con= new Conexion();
    
    Uni.main(args);
 
    }
 
}

