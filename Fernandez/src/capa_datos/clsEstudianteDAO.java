package capa_datos;

import capa_logica.clsEstudiante;

/**
 *
 * @author Fernandez Reyes
 */
public class clsEstudianteDAO {

    private static clsEstudiante[] objetos = new clsEstudiante[20];
    private static int cantidad;

    public clsEstudianteDAO() {
        cantidad = 0;
    }

    public static void agregar(clsEstudiante clsEst) {

        if (cantidad < 20) {
            objetos[cantidad] = clsEst;
            cantidad++;
        }
    }

    public static clsEstudiante[] obtener() {
        return objetos;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static void eliminar(clsEstudiante clsEst) {
        
        // Metodod para eliminar
    }
}
