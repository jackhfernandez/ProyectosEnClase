package capa_datos;

import capa_logica.clsCurso;

/**
 *
 * @author Fernandez Reyes
 */
public class clsCursoDAO {

    private static final int MAX_CU = 20;
    private static clsCurso[] cursos = new clsCurso[MAX_CU];
    private static int cantidad = 0;

    static {
        inicializarCursos();
    }

    private static void inicializarCursos() {

        agregar(new clsCurso(1, "CYT001", "INTERFAZ", 4, 3, 30, true));
        agregar(new clsCurso(2, "CYT001", "BBDD", 4, 4, 28, true));
        agregar(new clsCurso(3, "CYT001", "ESTADISTICA", 2, 1, 30, true));
        agregar(new clsCurso(4, "CYT001", "IA", 4, 5, 28, true));
        agregar(new clsCurso(5, "CYT001", "FM", 4, 2, 35, true));
        agregar(new clsCurso(6, "CYT001", "POO", 4, 2, 27, true));
        agregar(new clsCurso(7, "CYT001", "FP", 4, 1, 18, true));
        agregar(new clsCurso(8, "CYT001", "SO", 4, 6, 25, true));
        agregar(new clsCurso(9, "CYT001", "REDES", 4, 8, 20, true));
        agregar(new clsCurso(10, "CYT001", "AUDITORIA", 4, 9, 15, true));
    }

    public static void agregar(clsCurso objCurso) {

        if (cantidad < MAX_CU) {
            cursos[cantidad] = objCurso;
            cantidad++;
        }
    }

    public static clsCurso[] obtener() {
        return cursos;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static int posicion(int id) {

        for (int i = 0; i < cantidad; i++) {
            if (cursos[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public static void modificar(int pos, clsCurso objCurso) {

        if (pos >= 0 && pos < cantidad) {
            cursos[pos] = objCurso;
        }
    }

    public static void darBaja(int pos) {

        if (pos >= 0 && pos < cantidad ) {
            cursos[pos].setEstado(false);
        }
    }

    public static void eliminar(int pos) {

        if ( pos >= 0 && pos < cantidad ) {
            
            for (int i = pos; i < cantidad - 1; i++) {
                cursos[i] = cursos[i+1];
            }
            
            cursos[cantidad - 1] = null;
            cantidad--;
        } 
    }

    public static clsCurso getElement(int id) {

        for (int i = 0; i < cantidad; i++) {

            if (cursos[i].getId() == id) {
                return cursos[i];
            }
        }
        return null;
    }
}
