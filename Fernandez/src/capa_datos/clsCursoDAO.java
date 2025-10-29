package capa_datos;

import capa_logica.clsCurso;

/**
 *
 * @author Fernandez Reyes
 */
public class clsCursoDAO {

    private static clsCurso[] objetos = new clsCurso[20];
    private static int cantidad;

    public clsCursoDAO() {
        cantidad = 0;
    }

    public static void agregar(clsCurso clsCurso) {

        if (cantidad < 20) {
            objetos[cantidad] = clsCurso;
            cantidad++;
        }
    }

    public static clsCurso[] obtener() {
        return objetos;
    }

    public static int getCantidad() {
        return cantidad;
    }
}
