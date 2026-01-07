package capa_datos;

import capa_logica.clsVenta;

/**
 *
 * @author Fernandez Reyes
 */
public class clsVentaDAO {

    private static final int MAX_VENTA = 20;
    private static clsVenta[] objetos = new clsVenta[MAX_VENTA];
    private static int cantidad;

    public clsVentaDAO() {
        cantidad = 0;
    }

    // Inicializar datos
    public static void agregar(clsVenta objVenta) {

        if (cantidad <= MAX_VENTA) {
            objetos[cantidad] = objVenta;
            cantidad++;
        }
    }
    
    public static clsVenta[] obtener(){
        return objetos;
    }
    
    /*public static int posicion(int numero) {
        
        int pos = -1;
        
        for (int i = 0; i < cantidad; i++) {
            
            if (objetos[i].getNumero() == numero) {
                pos = 1;
                break;
            }
        }
        return pos;
    }
    
    public static clsVenta getElemento(int numero) {
        
        int pos = posicion(numero);
        
        if (pos != -1){
            return objetos[pos];
        } else {
            return null;
        }
    }*/
    
    public static void eliminar(int pos) {
        
        for (int i = pos; i < cantidad - 1; i++) {
            
            objetos[i] = objetos[i + 1];
        }
        objetos[cantidad-1] = null;
        cantidad--;
    }
    
    public static void modificar(int pos, clsVenta objVenta){
        
        objetos[pos] = objVenta;
    }
    
    public static int getCantidad(){
        
        return cantidad;
    }
}
