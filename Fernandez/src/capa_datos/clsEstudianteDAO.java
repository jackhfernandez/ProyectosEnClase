package capa_datos;

import capa_logica.clsEstudiante;

/**
 *
 * @author Fernandez Reyes
 */
public class clsEstudianteDAO {

    private static final int MAX_ES = 20;
    private static clsEstudiante[] estudiantes = new clsEstudiante[MAX_ES];
    private static int cantidad = 0;

    static {
        inicializarDatos();
    }

    private static void inicializarDatos() {

        agregar(new clsEstudiante(1, "Sara", "Garcia", "Femenino", "999999999", "Av Juan XXIII", true));
        agregar(new clsEstudiante(2, "Juan", "Perez", "Masculino", "999999999", "Av Juan XXIII", true));
        agregar(new clsEstudiante(3, "Pedro", "Lopez", "Masculino", "999999999", "Av Juan XXIII", true));
        agregar(new clsEstudiante(4, "Adriel", "Sanchez", "Masculino", "999999999", "Av Juan XXIII", true));
        agregar(new clsEstudiante(5, "Carlos", "Reyes", "Masculino", "999999999", "Av Juan XXIII", true));
        agregar(new clsEstudiante(6, "Alberto", "Torres", "Masculino", "999999999", "Av Juan XXIII", true));
        agregar(new clsEstudiante(7, "Ana", "Martinez", "Femenino", "999999999", "Av Juan XXIII", true));
        agregar(new clsEstudiante(8, "Daniel", "Ojeda", "Masculino", "999999999", "Av Juan XXIII", true));
        agregar(new clsEstudiante(9, "Karol", "Margot", "Femenino", "999999999", "Av Juan XXIII", true));
        agregar(new clsEstudiante(10, "Maicol", "Lopez", "Masculino", "999999999", "Av Juan XXIII", true));
    }

    public static void agregar(clsEstudiante clsEst) {

        if (cantidad < MAX_ES) {
            estudiantes[cantidad] = clsEst;
            cantidad++;
        }
    }

    public static clsEstudiante[] obtener() {
        return estudiantes;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static clsEstudiante getElemento(int id) {

        for (int i = 0; i < cantidad; i++) {

            if (estudiantes[i].getId() == id) {
                return estudiantes[i];
            }
        }
        return null;
    }

    public static int posicion(int id) {

        for (int i = 0; i < cantidad; i++) {

            if (estudiantes[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public static void modificar(int pos, clsEstudiante objEst) {

        if (pos >= 0 && pos < cantidad) {
            estudiantes[pos] = objEst;
        }
    }
    
    public static void darBaja(int pos){
        
        if (pos >= 0 && pos < cantidad)
            estudiantes[pos].setEstado(false);
    }
    
    public static void eliminar(int pos) {

        if (pos >= 0 && pos < cantidad) {
            
            for (int i = pos; i < cantidad - 1; i++) {
                estudiantes[i] = estudiantes[i + 1];
            }
            estudiantes[cantidad -1 ] = null;
            cantidad--;
        }
    }
}
