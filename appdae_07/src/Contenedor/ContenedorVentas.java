package Contenedor;

import capa_logica.clsVenta;

/**
 *
 * @author Fernandez Reyes
 */
public class ContenedorVentas {
    private static final int MAX = 25;
    private static clsVenta[] misVentas = new clsVenta[MAX];
    private static int cantidad;

    public ContenedorVentas() {
        cantidad = 0;
    }

    // Agregar
    public static boolean agregar(clsVenta objVenta) {
        if (cantidad < MAX) {
            misVentas[cantidad] = objVenta;
            cantidad++;
            return true;
        }
        return false;
    }
    
    public static int getCantidad() {
        return cantidad;
    }
    
    public static clsVenta[] obtener() {
        return misVentas;
    }
    
    /*public static int posicion(int codigo) {
        int pos = -1;
        for (int i = 0; i < cantidad; i++) {
            if (misVentas)
        }
    }*/

    public static clsVenta[] getMisVentas() {
        return misVentas;
    }
}
