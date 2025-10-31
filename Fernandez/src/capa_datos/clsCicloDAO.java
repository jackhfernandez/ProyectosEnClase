package capa_datos;

import capa_logica.clsCiclo;

/**
 *
 * @author Fernandez Reyes
 */
public class clsCicloDAO {

    private static final int MAX_CI = 10;
    private static clsCiclo[] ciclos = new clsCiclo[MAX_CI]; // solo diez ciclos
    private static int cantidad = 0;

    static {
        inicializarDatos();
    }

    private static void inicializarDatos() {

        agregar(new clsCiclo(1, "2024-I", "01/03/2024", "31/07/2024", true));
        agregar(new clsCiclo(2, "2024-I", "01/03/2024", "31/07/2024", true));
        agregar(new clsCiclo(3, "2024-I", "01/03/2024", "31/07/2024", true));
        agregar(new clsCiclo(4, "2024-I", "01/03/2024", "31/07/2024", true));
        agregar(new clsCiclo(5, "2024-I", "01/03/2024", "31/07/2024", true));
        agregar(new clsCiclo(6, "2024-I", "01/03/2024", "31/07/2024", true));
        agregar(new clsCiclo(7, "2024-I", "01/03/2024", "31/07/2024", true));
        agregar(new clsCiclo(8, "2024-I", "01/03/2024", "31/07/2024", true));
        agregar(new clsCiclo(9, "2024-I", "01/03/2024", "31/07/2024", true));
        agregar(new clsCiclo(10, "2024-I", "01/03/2024", "31/07/2024", true));
    }

    public static void agregar(clsCiclo objciclo) {

        if (cantidad <= MAX_CI) {
            ciclos[cantidad] = objciclo;
            cantidad++;
        }
    }

    public static clsCiclo[] obtener() {
        return ciclos;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static clsCiclo getElemento(int id) {

        for (int i = 0; i < cantidad; i++) {

            if (ciclos[i] != null && ciclos[i].getId() == id) {
                return ciclos[i];
            }
        }
        return null;
    }

    public static int posicion(int id) {

        for (int i = 0; i < cantidad; i++) {

            if (ciclos[i] != null && ciclos[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public static void modificar(int pos, clsCiclo objCiclo) {

        if (pos >= 0 && pos < cantidad) {
            ciclos[pos] = objCiclo;
        }
    }

    public static void darBaja(int pos) {

        if (pos >= 0 && pos < cantidad) {
            ciclos[pos].setEstado(false);
        }
    }
    
    public static void eliminar(int pos) {
        
        if (pos >= 0 && pos < cantidad) {
            
            for (int i = pos; i < cantidad - 1; i++) {
                ciclos[i] = ciclos[i + 1];
            }
            ciclos[cantidad - 1] = null;
            cantidad--;
        }
    }
}
